package com.anderson.estruturadados.vetor.teste;

import com.anderson.estruturadados.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) {
		
		// vetor com capacidade para 10 elementos
		Vetor vetor = new Vetor(10);

		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		vetor.adiciona("elemento 4");
		vetor.adiciona("elemento 5");

		System.out.println(vetor.buscar(2));
	}

}
