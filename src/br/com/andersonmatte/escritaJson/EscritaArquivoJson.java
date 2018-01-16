package br.com.andersonmatte.escritaJson;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

import br.com.andersonmatte.entidade.TimeFutebol;

/**
 * @author Anderson Matte 
 * 
 * Classe que exporta transforma um objeto .java em um arquivo .json
 * 
 */
public class EscritaArquivoJson {
	
	/** M�todo respons�vel pela execu��o da Escrita de um novo Time de Futebol */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//Nova inst�ncia do objeto Time de Futebol
		TimeFutebol timeParaExportacao = criarTime();
		
		/*Aqui � criado o objeto JSON para ser exportado*/ 
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("nomeEquipe", timeParaExportacao.getNomeEquipe());
		jsonObject.put("nomeCidade", timeParaExportacao.getNomeCidade());
		jsonObject.put("nomeEstadio", timeParaExportacao.getNomeEstadio());
		jsonObject.put("capacidadeEstadio", timeParaExportacao.getCapacidadeEstadio());
		jsonObject.put("quantidadeTitulo", timeParaExportacao.getQuantidadeTitulo());
		
		//Aqui ser� gerado o arqivo .json com as informa��es do novo time de futebol 
		try{
			FileWriter writeFile = null;
			writeFile = new FileWriter("novoTime.json");
			writeFile.write(jsonObject.toJSONString());
			writeFile.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		//Imprimne no console o objeto Json.
		System.out.println(jsonObject);

	}
	
	/** M�todo respons�vel pela cria��o de um novo Time de futebol */
	public static TimeFutebol criarTime() {
		TimeFutebol novoTime = new TimeFutebol();
		novoTime.setNomeEquipe("Barcelona");
		novoTime.setNomeCidade("Barcelona");
		novoTime.setNomeEstadio("Camp Nou");
		novoTime.setCapacidadeEstadio(99.786d);
		novoTime.setQuantidadeTitulo(128l);
		return novoTime;
	}
	
}
