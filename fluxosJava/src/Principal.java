public class Principal {
	public static void main(String[]args) {
		Fila fila = new Fila();
		fila.enfileirar("tomato town");
		fila.enfileirar("rust depot");
		System.out.println(fila.inicio);
		fila.enfileirar("shaffty mines");
		fila.enfileirar("retail row");
		Object info = fila.desenfileirar();
		while(info != null) {
			System.out.println(info);
			info = fila.desenfileirar();
		}
		fila.enfileirar("tilted towers");
		fila.enfileirar("salty springs");
		info = fila.desenfileirar();
		while(info != null) {
			System.out.println(info);
			info = fila.desenfileirar();
		
		}	
	}

}
