import java.util.Scanner;

public class Prova4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        
        if(idade <= 15) {
            System.out.println("Você ainda não pode votar!");
            return;

        }
        if(idade >= 16 && idade >= 70){
            System.out.println("Seu voto é facultativo!");
            return;

        }
        if(idade >= 18 && idade <=70){
            System.out.println("Seu voto é obrigatório!");

        }
    
        
    }

}
