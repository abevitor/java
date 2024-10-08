import java.util.Scanner;

public class TiposStrings {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuffer x = new StringBuffer();
		
		
		System.out.println("Digite uma palavra!");
		String palavra = scanner.nextLine();
		x.append("Bem vindo");
		x.append(" ao");
		x.append(" PetShop");
		x.append(" qual");
		x.append(" seria ");
		x.append(" o serviço");
		x.append("?");
		
		System.out.println(palavra + "," + x.toString());
		
		System.out.println("BANHO|TOZA|SPA|CORTAR UNHAS|SERVIÇO COMPLETO");
		String servico = scanner.nextLine();
		
		System.out.println();
		
		if(servico.toLowerCase().equals("banho")) {
			
			return;
			
		}
		
		if(servico.toLowerCase().equals("toza")) {
			
			return;
		}
		
		if(servico.toLowerCase().equals("spa")) {
			
			return;
		}
		
		if(servico.toLowerCase().equals("cortar unhas")) {
			
			return;
			
		}
		
		if(servico.toLowerCase().equals("serviço completo")) {
			
			return;
		}
		
	}

}
