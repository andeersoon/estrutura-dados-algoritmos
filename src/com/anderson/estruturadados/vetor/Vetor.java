package com.anderson.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {
	
	// atributos
	private String[] elementos;
	private int tamanho;
	
	// construtor ir� inicializar o vetor
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	// ADICIONAR ELEMENTO FINAL DO VETOR - OP��O 1
	// forma simples de adicionar um elememnto no vetor
	/*public void adiciona(String elemento) {
		for(int i = 0; i < this.elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}*/
	// Esse algoritmo fuciona mas n�o � muito eficiente para vetores muito grandes
	
	
	// ADICIONAR ELEMENTO FINAL DO VETOR - OP��O 2
	/*public void adiciona(String elemento) throws Exception {
		
		if(tamanho < elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("Vetor est� cheio, n�o � poss�vel adicionar mais elementos");
		}
	}*/
	
	
	// ADICIONAR ELEMENTO FINAL DO VETOR - OP��O 3 (melhor op��o)
	public boolean adiciona(String elemento) {
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} else {
			return false;
		}
	}
	
	// obtem elemento de uma posi��o
	public String buscar(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		return this.elementos[posicao];
	}

	// retorna o tamanho do vetor
	public int getTamanho() {
		return tamanho;
	}
	
	// imprime totos os elementos dentro do vetor n�o nulos (forma mais simples, por�m menos eficiente)
	/*@Override
	public String toString() {
		
		String s = "[";
		for(int i = 0; i < this.tamanho -1; i++) {
			s += this.elementos[i];
			s += ", ";
		}
		if(this.tamanho > 0) {
			s += this.elementos[this.tamanho -1];
		}
		
		s += "]";
		
		return Arrays.toString(elementos);
	}*/
	
	// imprime totos os elementos do vetor n�o nulos (forma mais eficiente)
	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i = 0; i < this.tamanho -1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if(this.tamanho > 0) {
			s.append(this.elementos[this.tamanho -1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
	
}