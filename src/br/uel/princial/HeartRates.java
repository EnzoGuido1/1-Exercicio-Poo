package br.uel.princial;

import java.time.LocalDate;

public class HeartRates {
	private String nome;
	private String sobrenome;
	private Integer dia;
	private Integer mes;
	private Integer ano;

	//constructor initializes private variables stated above
	public HeartRates(String nome, String sobrenome, Integer dia, Integer mes, Integer ano) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	//set and get block that sets the values to the variables and return them
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Integer getDia() {
		return dia;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getMes() {
		return mes;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getAno() {
		return ano;
	}

	//calculate the age in years
	public static Integer getIdade(int dia, int mes, int ano) {
		LocalDate hoje = LocalDate.now(); // Create a date object

		int idadeAnos = hoje.getYear() - ano;
		if (hoje.getMonthValue() >= mes) {
			if (hoje.getDayOfMonth() < dia && hoje.getMonthValue() == mes) {
				idadeAnos--;
			}
		} else {
			idadeAnos--;
		}

		return idadeAnos;
	}

	//calculate the max heart rates expected
	public static Integer getMaxHeartRates(int idadeAnos) {
		int maxHeartRates = 220 - idadeAnos;
		return maxHeartRates;
	}

	//calculate the ideal heart rates
	public static Double[] getIdealHeartRates(int maxHeartRates) {
		Double[] idealHeartRates = new Double[2];
		idealHeartRates[0] = maxHeartRates * 0.85;
		idealHeartRates[1] = maxHeartRates * 0.50;

		return idealHeartRates;
	}
}
