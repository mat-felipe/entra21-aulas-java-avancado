package br.com.entra21.javaavancado.principal;

import java.util.Iterator;
import java.util.Scanner;

import br.com.entra21.javaavancado.principal.aula01.enums.PersonagemJogo;
import br.com.entra21.javaavancado.principal.aula02.collections.list.AprenderCollection;
import br.com.entra21.javaavancado.principal.aula03.Aula03;

public class Main {

	static Scanner input = new Scanner(System.in);

	public enum DiasSemana {
		SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
	}

	public static void main(String[] args) {
		byte option;

		do {

			System.out.println(exibirMenu());

			option = input.nextByte();

			switch (option) {
			case 0:
				System.out.println("Saindo");
				break;

			case 1:
				aprenderWrapper();
				break;

			case 2:
				aprenderEnum();
				break;

			case 3:
				AprenderCollection.aprender();
				break;
				
			case 4:
				Aula03.aprender();
				break;

			default:
				System.out.println("Opção inválida!");
				break;
			}

		} while (option != 0);

	}

	private static void aprenderEnum() {
		System.out.println("Testando o Enum: " + DiasSemana.TERCA);
		boolean hoje = DiasSemana.DOMINGO == DiasSemana.SABADO;
		System.out.println(hoje ? "sim" : "não");

		for (int dia = 0; dia < DiasSemana.values().length; dia++) {
			System.out.println((dia + 1) + " - " + DiasSemana.values()[dia]);

		}

		System.out.println("Gosto deste tipo de personagem " + PersonagemJogo.ANAO);
		System.out.println("Geralmente a classe " + PersonagemJogo.ANAO + " tem HP " + PersonagemJogo.ANAO.getHP());
		System.out.println("Veja a caracteristica mais comum dele " + PersonagemJogo.ANAO.getDESCRICAO());
		System.out.println("O mago está no indice do ENMUM " + PersonagemJogo.BARBARO.ordinal());
		System.out.println("Veja a descrição completa do " + PersonagemJogo.BARBARO + " sua vida é "
				+ PersonagemJogo.BARBARO.getHP() + " e sua habilidade principal "
				+ PersonagemJogo.BARBARO.getDESCRICAO());

		for (int personagem = 0; personagem < PersonagemJogo.values().length; personagem++) {
			System.out.println("O contador é " + personagem + " posição do ENUM é "
					+ PersonagemJogo.values()[personagem].ordinal());
			System.out.println("O personagem " + PersonagemJogo.values()[personagem].name());
			System.out.println(PersonagemJogo.values()[personagem].getHP());
			System.out.println(PersonagemJogo.values()[personagem].getDESCRICAO());
			System.out.println("--------------------------------------------------");

		}
	}

	private static void aprenderWrapper() {

		// converter valores em tipos primitivos
		char letra = Character.valueOf('M');
		boolean verdade = Boolean.parseBoolean("TRUE");
		boolean verdade1 = Boolean.parseBoolean("tRue");
		boolean verdade2 = Boolean.parseBoolean("true");
		boolean falso = Boolean.parseBoolean("t");

		byte inteiroUm = Byte.parseByte("127");
		short inteiroDois = Short.parseShort("130");
		int inteiroTres = Integer.parseInt("10000");
		long inteiroQuatro = Long.parseLong("500000");

		float decimalUm = Float.parseFloat("50.565005");
		double decimalDois = Double.parseDouble("8457.546");

	}

	private static String exibirMenu() {
		String menu = "Vamos aprender sobre conceitos avançados em JAVA!";
		menu += "\n0 - Sair";
		menu += "\n1 - Wrapper";
		menu += "\n2 - ENUM";
		menu += "\n3 - Collection List";
		menu += "\n4 - Annotation and dates";
		menu += "\nEscolha uma das opções";
		return menu;

	}

}
