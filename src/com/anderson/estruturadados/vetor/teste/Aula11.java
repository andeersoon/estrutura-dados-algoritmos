package com.anderson.estruturadados.vetor.teste;

import com.anderson.estruturadados.vetor.Lista;

/**
 * @author Anderson S Leite
 *
 */
public class Aula11 {

	public static void main(String[] args) {
		
		Lista<String> vetor = new Lista<String>(4);

		vetor.adiciona("Carla");
		vetor.adiciona("José Roberto");
		vetor.adiciona("Joaquim");
		vetor.adiciona("Maria Teresa");
		
		System.out.println(vetor);
	}

}
