package com.anderson.estruturadados.vetor;

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
	
	// verifica se existe determinado elemento no vetor
	public int buscar(String elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;// retorna posição do elemento
			}
		}
		return -1;// retorna uma posição que não existe
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