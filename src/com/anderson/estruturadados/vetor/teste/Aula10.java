package com.anderson.estruturadados.vetor.teste;

import com.anderson.estruturadados.vetor.VetorObjetos;

/**
 * @author Anderson S Leite
 *
 */
public class Aula10 {
	
	public static void main(String[] args) {
		
		VetorObjetos vetor = new VetorObjetos(3);
		
		Contato c1 = new Contato("Maria", "1234-4567", "maria@email.com");
		Contato c2 = new Contato("João", "2345-6789", "joao@email.com");
		Contato c3 = new Contato("Pedro", "7985-3557", "maria@email.com");
		
		Contato c4 = new Contato("Maria", "1234-4567", "maria@email.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho = "+ vetor.getTamanho());
		
		int pos = vetor.buscar(c4);
		if(pos > -1) {
			System.out.println("Elemento existe no vetor");
		} else {
			System.out.println("Elemento não existe no vetor");
		}
		
		System.out.println(vetor);
		
	}
}
