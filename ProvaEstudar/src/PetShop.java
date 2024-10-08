import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
		StringBuffer x = new StringBuffer();
        StringBuilder y = new StringBuilder("Olá ");
		
		
		System.out.println("Digite seu nome!");
		String nome = scanner.nextLine();
        x.append("Bem vindo ao PetShop! nome, qual seria o serviço?");
        x.replace(22, 26, nome);
		

		
		System.out.println(x.toString());
		
		System.out.println("BANHO|TOSA|SPA|CORTAR UNHAS|SERVIÇO COMPLETO");
		String servico = scanner.nextLine();
		
		System.out.println();
		
		if(servico.toLowerCase().equals("banho")) {
            y.append(nome);
            System.out.println(y.toString() + " você escolheu a opção banho!");
            System.out.println("Digite o tamanho do seu cachorro");
            double tamanho = scanner.nextDouble();
            System.out.println("Digite (1) se voce deseja usar Shampoo Premium, Digite (2) se voce deseja usar Shampoo comum e (3) se deseja usar shampoo comum");
            int shampoo = scanner.nextInt();

            banhar(tamanho, shampoo);

			return;
			
		}
		
		if(servico.toLowerCase().equals("tosa")) {

            System.out.println();
			
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

    private static void banhar(double tamanho, int shampoo){

        double shampooPremiumLitro = 50;
        double shampooComumLitro= 12.5;
        double shampooDermatiteLitro = 22.5;
        double LitroPerM = 30;
        double totalShampoo = tamanho / 100;
        double regra = LitroPerM * totalShampoo;

        if(shampoo == 1){
           double totalPremium =  regra * shampooPremiumLitro;
           System.out.println( "o preço total do banho ficou: " + totalPremium);
            
            return;
        }
        if(shampoo == 2){
            double totalComum = regra * shampooComumLitro;
            System.out.println( "o preço total do banho ficou: "  + totalComum);
            
            return;
        }
        if(shampoo == 3){
            double totalDermatite = regra * shampooDermatiteLitro;
            System.out.println(  "o preço total do banho ficou: " + totalDermatite);

            return;
        }

    }
    
}
