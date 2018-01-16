package br.com.andersonmatte.entidade;

/**
 * @author Anderson Matte 
 * 
 * Classe que representa a entidade Times de Futebol
 * 
 */
public class TimeFutebol {

	private String nomeEquipe;
	private String nomeCidade;
	private String nomeEstadio;
	private Double capacidadeEstadio;
	private Long quantidadeTitulo;

	public String getNomeEquipe() {
		return nomeEquipe;
	}

	public void setNomeEquipe(String nomeEquipe) {
		this.nomeEquipe = nomeEquipe;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public String getNomeEstadio() {
		return nomeEstadio;
	}

	public void setNomeEstadio(String nomeEstadio) {
		this.nomeEstadio = nomeEstadio;
	}

	public Double getCapacidadeEstadio() {
		return capacidadeEstadio;
	}

	public void setCapacidadeEstadio(Double capacidadeEstadio) {
		this.capacidadeEstadio = capacidadeEstadio;
	}

	public Long getQuantidadeTitulo() {
		return quantidadeTitulo;
	}

	public void setQuantidadeTitulo(Long quantidadeTitulo) {
		this.quantidadeTitulo = quantidadeTitulo;
	}
	
}
