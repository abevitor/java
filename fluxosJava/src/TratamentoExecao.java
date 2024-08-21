import java.util.InputMismatchException;
import java.util.Scanner;
public class TratamentoExecao {
    public static void main(String[] args) {
        try{Scanner scanner = new Scanner(System.in);

            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();
    
            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.nextLine();
    
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
    
            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();
    
    
            System.out.println("Ola, me chamo " + nome.toUpperCase() + "meu sobrenome é: " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos " );
            System.out.println("Minha altura é " + altura + " cm ");
            
            scanner.close();
    
    
            
        }
        catch(InputMismatchException e){
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("O campo idade e altura precisam ser numericos");
            double alturaTeste = scanner2.nextDouble();

            System.out.println("A altura é: " + alturaTeste);
            scanner2.close();

        }
        

        
    }

}
