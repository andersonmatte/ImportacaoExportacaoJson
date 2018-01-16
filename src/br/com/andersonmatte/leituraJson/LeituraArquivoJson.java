package br.com.andersonmatte.leituraJson;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import br.com.andersonmatte.entidade.TimeFutebol;

/**
 * @author Anderson Matte 
 * 
 * Classe que transforma um arquivo .json em um obleto java.
 */
public class LeituraArquivoJson {

	private static ResourceBundle mensagensLabel = null;
	
	/**
	 * Método responsável pela execução da leitura de um arquivo JSON e pela
	 * transformação para Java
	 */
	public static void main(String[] args) {
		
		// Aqui é criada a lista de objeto Json e o objeto de parser
		List<JSONObject> listaJSONObject = new ArrayList<>();
		JSONParser parser = new JSONParser();

		// Aqui é criada a lista de objeto Time de futebol e o objeto que vai ser parseado
		List<TimeFutebol> listaTimeFutebol = new ArrayList<>();
		TimeFutebol timeParaParser = new TimeFutebol();
		
		try {
			listaJSONObject = (List<JSONObject>) parser.parse(new FileReader("timesGauchao2017.jason"));
			for (JSONObject jsonObject : listaJSONObject) {
				if (jsonObject != null) {
					timeParaParser.setNomeEquipe(jsonObject.get("nomeEquipe") != null ? jsonObject.get("nomeEquipe").toString() : null);
					timeParaParser.setNomeCidade(jsonObject.get("nomeCidade") != null ? jsonObject.get("nomeCidade").toString() : null);
					timeParaParser.setNomeEstadio(jsonObject.get("nomeEstadio") != null ? jsonObject.get("nomeEstadio").toString() : null);
					timeParaParser.setCapacidadeEstadio(jsonObject.get("capacidadeEstadio") != null ? Double.parseDouble(jsonObject.get("capacidadeEstadio").toString()) : null);
					timeParaParser.setQuantidadeTitulo(jsonObject.get("quantidadeTitulo") != null ? Long.parseLong(jsonObject.get("quantidadeTitulo").toString()) : null);
					listaTimeFutebol.add(timeParaParser);
					//Mostra no console a linha inserida na lista de Times.
					imprimeLinhaArquivoJSON(timeParaParser);
				}
			}
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Método responsável pela impressão no console das linhas do arquivo .json já
	 * transformadas em objeto .java.
	 * 
	 */
	public static void imprimeLinhaArquivoJSON(TimeFutebol timeParaParser) {
		mensagensLabel = PropertyResourceBundle.getBundle("br.com.andersonmatte.mensagens.MensagensLabel");
		System.out.print(mensagensLabel.getString("nomeEquipe") + timeParaParser.getNomeEquipe() + ","
				+ mensagensLabel.getString("nomeCidade") + timeParaParser.getNomeCidade() + ","
				+ mensagensLabel.getString("nomeEstadio") + timeParaParser.getNomeEstadio() + ","
				+ mensagensLabel.getString("capacidadeEstadio") + timeParaParser.getCapacidadeEstadio() + ","
				+ mensagensLabel.getString("quantidadeTitulo") + timeParaParser.getQuantidadeTitulo() + "\n");
	}
	
}
