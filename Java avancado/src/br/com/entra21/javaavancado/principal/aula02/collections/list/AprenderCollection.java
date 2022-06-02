package br.com.entra21.javaavancado.principal.aula02.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AprenderCollection {

	static Scanner input = new Scanner(System.in);

	public static void aprender() {

		byte option;

		do {
			System.out.println("Vamos aprender sobre conceitos avançados em JAVA!");
			System.out.println("0 - Sair");
			System.out.println("1 - Aprendendo ArrayList");
			System.out.println("2 - Aprendendo Linked List");
			option = input.nextByte();

			switch (option) {

			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				aprenderArrayList();
				break;

			case 2:
				aprenderLinkedList();
				break;

			default:
				System.out.println("Escolha uma opção válida");
				break;

			}

		} while (option != 0);
		System.out.println("Volte sempre quando quiser aprender collection - list");
	}

	private static void aprenderArrayList() {
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Mateus");
		nomes.add("Felipe");
		nomes.add("Goettems");
		nomes.add("Loxa");

		nomes.add(0, "primeiro");

		System.out.println("Quantos nomes? " + nomes.size());

		for (String item : nomes) {
			System.out.println("O primeiro nome é: " + item);
		}

		for (int nome = 0; nome < nomes.size(); nome++) {
			System.out.println("No indice: " + nome + " tem o valor " + nomes.get(nome));
		}
		System.out.println("O primeiro nome é: " + nomes.get(0));
		System.out.println("O quarto nome é: " + nomes.get(3));

		nomes.set(2, "MATEUS");
		System.out.println("O terceiro nome é: " + nomes.get(2));

		nomes.set(0, (nomes.get(3).toUpperCase()));
		System.out.println("O primeiro nome é: " + nomes.get(0));
		
		System.out.println("Onde será que está o Loxa? "+nomes.indexOf("Loxa"));
		System.out.println("Vou deletar quem está no indice 2 "+nomes.get(2));
		nomes.remove(2);
		nomes.remove(nomes.indexOf("Loxa"));
		
		//criar uma lista de interesses
		//inclua 5 interesses
		//liste todos os interesses
		//desta lista escolha 2 que são seus favoritos
		//exclua 1 item por posição e outro por valor
		
		ArrayList<String> interesse = new ArrayList<>();
		interesse.add("Ir a praia");
		interesse.add("Fazer trilhas");
		interesse.add("Corrida");
		interesse.add("Passear com o Borges");
		interesse.add("Viajar");
		
		for (String contador : interesse) {
			System.out.println("Este é um dos meus interesses: "+contador);
		}
		
		System.out.println("Este é um dos meus favoritos "+interesse.get(3)+" e este também "+interesse.get(4));
		
		System.out.println("Agora vou excluir o interesse "+interesse.get(2)+" por posição e o "+interesse.get(1)+" por valor");
		interesse.remove(2);
		interesse.remove(interesse.indexOf("Fazer trilhas"));

	}

	private static void aprenderLinkedList() {
		// TODO Auto-generated method stub

	}

}
