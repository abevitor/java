public class Fila {
	private int tamanho;
	No inicio;
	private No fim;
	
	public boolean estaVazia() {
		return this.tamanho == 0;
		
	}
	public Object inicio() {
		if(estaVazia()) {
			return null;
		}
		return this.inicio.info;
		
	}
	public void enfileirar(Object info) {
		No no = new No(info);
		if(estaVazia()) {
			inicio = no;
			this.fim = no;
		}else {
			fim.prox = no;
		}
		fim = no;
		this.tamanho ++;
		
	}
	
	public  Object desenfileirar() {
		if(estaVazia()) {
			return null;
		}
		Object info = inicio.info;
		inicio = inicio.prox;
		tamanho--;
		fim = tamanho == 0 ? null : fim;
		return info;
		
	}

}
