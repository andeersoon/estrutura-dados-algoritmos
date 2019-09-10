package com.anderson.estruturadados.vetor;

public class VetorObjetos {

	private Object[] elementos;
	private int tamanho;

	// construtor irá inicializar o vetor
	public VetorObjetos(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}

	// adiciona elemento final do vetor
	public boolean adiciona(Object elemento) {
		this.aumentarCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} else {
			return false;
		}
	}

	// adiciona um elemento em qualquer posição do vetor
	public boolean adiciona(int posicao, Object elemento) {

		// verifica se existe determinado elemento no vetor
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}

		this.aumentarCapacidade();

		// move todos os elementos
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}

	// adiciona capacidade no vetor
	private void aumentarCapacidade() {
		if (this.tamanho == this.elementos.length) {
			// cria um novo vetor com dobro de capacidade
			Object[] elementosNovos = new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	// obtem elemento de uma posição
	public Object buscar(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.elementos[posicao];
	}

	// verifica se existe determinado elemento no vetor
	public int buscar(Object elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;// retorna posição do elemento
			}
		}
		return -1;// retorna uma posição que não existe
	}

	// retorna o tamanho do vetor
	public int getTamanho() {
		return tamanho;
	}

	// remove elemento do vetor
	public void remover(int posicao) {
		// verifica se existe determinado elemento no vetor
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;
	}

	// imprime totos os elementos do vetor não nulos (forma mais eficiente)
	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");

		return s.toString();
	}

}