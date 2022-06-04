package br.com.entra21.javaavancado.principal.aula03;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Aula03 {
	static Scanner input = new Scanner(System.in);

	public static void aprender() {
		byte option;

		do {
			System.out.println("0 - Voltar");
			System.out.println("1 - Datas");
			System.out.println("2 - Anota��es");

			option = input.nextByte();

			switch (option) {

			case 0:
				System.out.println("Saindo..");
				break;

			case 1:
				aprenderDatas();
				break;

			case 2:
				aprenderAnotacoes();
				break;

			default:
				System.out.println("Digite o n�mero do menu");
				break;
			}

		} while (option != 0);

	}

	private static void aprenderDatas() {
		Instant inicio = Instant.now();

		System.out.println("Escolha um n�mero aleat�rio, menos esse que vc acabou de pensar");
		long numAle = input.nextLong();

		Instant fim = Instant.now();
		Duration tempo = Duration.between(inicio, fim);
		System.out.println("Vc demorou " + tempo.getSeconds() + " segundos para escolher o " + numAle);
		System.out.println("Para datas, levamos " + tempo.toSeconds() + " segundos");
		aprenderDatasHumanizadas();
	}

	private static void aprenderDatasHumanizadas() {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		LocalDate nascimento = LocalDate.of(2001, 8, 23);
		System.out.println(nascimento);

		LocalDate essaQuinta = LocalDate.of(2022, Month.JUNE, 2);
		System.out.println("Essa quinta � igual a " + essaQuinta);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM YYYY");
		System.out.println(formatter.format(essaQuinta));
		System.out.println(DateTimeFormatter.ofPattern("YYYY").format(essaQuinta));

		Period vida = Period.between(nascimento, hoje);
		System.out.println("Durante minha vida eu gastei " + vida.getYears() + " anos, " + vida.getMonths() + " meses, "
				+ vida.getDays() + " dias, ");

		LocalTime lanche = LocalTime.of(20, 10);
		LocalTime finalAula = LocalTime.of(22, 15);
		LocalTime avaliacao = LocalTime.of(22, 0);

		System.out.println("Fomo lanchar �s " + lanche + ", fomos avaliar a aula �s " + avaliacao
				+ ", e a aula terminar �s " + finalAula);
		System.out.println("Isso no d� " + Duration.between(lanche, finalAula) + " de aula depois do lanche e "
				+ Duration.between(avaliacao, finalAula) + " para avaliar a aula");

	}

	@InProgress
	private static void aprenderAnotacoes() {

	}

}
