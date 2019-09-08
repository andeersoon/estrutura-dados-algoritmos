package com.anderson.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {
	
	// atributos
	private String[] elementos;
	private int tamanho;
	
	// construtor irá inicializar o vetor
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	// ADICIONAR ELEMENTO FINAL DO VETOR - OPÇÃO 1
	// forma simples de adicionar um elememnto no vetor
	/*public void adiciona(String elemento) {
		for(int i = 0; i < this.elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}*/
	// Esse algoritmo fuciona mas não é muito eficiente para vetores muito grandes
	
	
	// ADICIONAR ELEMENTO FINAL DO VETOR - OPÇÃO 2
	/*public void adiciona(String elemento) throws Exception {
		
		if(tamanho < elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("Vetor está cheio, não é possível adicionar mais elementos");
		}
	}*/
	
	
	// ADICIONAR ELEMENTO FINAL DO VETOR - OPÇÃO 3 (melhor opção)
	public boolean adiciona(String elemento) {
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} else {
			return false;
		}
	}
	
	// obtem elemento de uma posição
	public String buscar(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.elementos[posicao];
	}

	// retorna o tamanho do vetor
	public int getTamanho() {
		return tamanho;
	}
	
	// imprime totos os elementos dentro do vetor não nulos (forma mais simples, porém menos eficiente)
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
	
	// imprime totos os elementos do vetor não nulos (forma mais eficiente)
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