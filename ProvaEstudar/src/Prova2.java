import java.util.Scanner;

public class Prova2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número do mês desejado!");
        int mes = scanner.nextInt();
        scanner.close();

        switch (mes) {
            case 1: {
                System.out.println("Janeiro");

                break;
            }
            case 2: {
                System.out.println("Fevereiro");

                break;
            }
            case 3: {
                System.out.println("Março");

                break;
            }
            case 4: {
                System.out.println("Abril");

                break;
            }
        
            default:
            System.out.println("Mês invalido! tente dos números de 1 a 12!");
            
                break;
        }


        
    }

}
