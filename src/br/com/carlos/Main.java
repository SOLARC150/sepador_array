package br.com.carlos;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	static Scanner l = new Scanner (System.in);
	static Set<String> masculino = new TreeSet();
	static Set<String> feminino = new TreeSet();

	public static void main (String[] args) {
		byte num = 0;
		
		while(num<10) {
			
			adicionarPessoa(qualNome(), escolherSexo());
			
			System.out.println("Nomes Masculinos: "+masculino);
			System.out.println("Nomes Femininos: "+feminino);
			num++;
		}
	}

	private static String qualNome () {
		System.out.println("Qual seu nome?\n");
		return l.next();
	}
	
	private static Byte escolherSexo() {
		System.out.println("\nQual seu sexo?\n"
				+ "1- Masculino\n"
				+ "2- Feminino\n");
		return l.nextByte();
	}

	private static void adicionarPessoa(String nome, Byte num) {
		
		if(num == 1) {
			masculino.add(nome);
		}else if(num == 1) {
			feminino.add(nome);
		}
	}
}
