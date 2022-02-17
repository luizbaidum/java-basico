package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato("Luiz", "vermelho", 29);
		/* Livros livros = new Livros(); */
		
		System.out.println("parte 2: " + gato);
		
		int a = 2;
		int b = 7;
		System.out.println("parte 1: Olá, meu mundo! " + (a+b) + " " + a+b);
	}

}

/* class Livros {
	private String nome;
	private String npag;
} */
