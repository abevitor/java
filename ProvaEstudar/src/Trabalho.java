import java.util.Scanner;

public class Trabalho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		StringBuffer x = new StringBuffer();
		
		System.out.println("Digite seu nome!");
		String nome = scanner.nextLine();
        x.append("Bem vindo ao PetShop! nome, qual seria o serviço?");
        x.replace(22, 26, nome);
		
		System.out.println(x.toString());
		
        System.out.println("Qual o tamanho do seu animalzinho de estimação para o banho?");
		Double servico = scanner.nextDouble();
        System.out.println();
        
        

        System.out.println("daremos banho no seu animalzinho que tem " + servico + "m" );

        
    }

}
