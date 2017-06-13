package jaxrs;

import java.util.Date;

public class Calculo {

	private int idade;
	
	private String resultado;
	
	private String dataDeProcessamento;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getDataDeProcessamento() {
		return dataDeProcessamento;
	}

	public void setDataDeProcessamento(String dataDeProcessamento) {
		this.dataDeProcessamento = dataDeProcessamento;
	}

	public Calculo() {
	}

	public Calculo(int idade) {
		this.idade = idade;
	}

	public void calcular() {
		if (idade < 18) {
			setResultado("Menor");
		} else {
			setResultado("Maior");
		}
		setDataDeProcessamento(new Date().toString());
	}

}
