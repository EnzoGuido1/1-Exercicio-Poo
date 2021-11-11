package br.uel.princial;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		//scanner to read the inputs in terminal
		Scanner input = new Scanner(System.in);

		//block to read the inputs in terminal
		System.out.println("Ensira seu nome:");
		String nome = input.nextLine();
		System.out.println("Ensira seu sobrenome:");
		String sobrenome = input.nextLine();
		System.out.println("Ensira o dia do seu nascimento:");
		Integer dia = input.nextInt();
		System.out.println("Ensira o mes do seu nascimento:");
		Integer mes = input.nextInt();
		System.out.println("Ensira o ano do seu nascimento:");
		Integer ano = input.nextInt();

		HeartRates conta = new HeartRates(nome, sobrenome, dia, mes, ano);

		//calculate the age in years
		int idadeAno = HeartRates.getIdade(dia, mes, ano);
		//calculate the max heart rates expected
		int maxHeartRates = HeartRates.getMaxHeartRates(idadeAno);
		//calculate the ideal heart rates
		Double[] idealHeartRates = new Double[2];
		idealHeartRates = HeartRates.getIdealHeartRates(maxHeartRates);

		System.out.printf("\nNome: %s\nSobrenome: %s\nData de nascimento(DD/MM/AAAA): %d/%d/%d\n", conta.getNome(),
				conta.getSobrenome(), conta.getDia(), conta.getMes(), conta.getAno());
		System.out.printf("Idade em anos: %d\n", idadeAno);
		System.out.printf("Frequencia maxima de batimentos cardiacos esperados: %d\n", maxHeartRates);
		System.out.printf("Frequencia ideal de batimentos cardiacos: %.2f - %.2f\n", idealHeartRates[0],
				idealHeartRates[1]);

		input.close();
	}
}

