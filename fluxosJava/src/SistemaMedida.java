import java.util.Scanner;
public class SistemaMedida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o tamanho da camiseta(PP),(P),(M),(G),(GG): ");
        String sigla = scanner.nextLine();

        switch (sigla) {
            case "PP": {
                System.out.println("Camiseta Extra Pequena!");
                break;

            }
            case "P": {
                System.out.println("Camiseta Pequena!");
                break;
            }
            case "M": {
                System.out.println("Camiseta Media!");
                break;
            }
            case "G": {
                System.out.println("Camiseta Grande!");
                break;
            }
            case "GG": {
                System.out.println("Camiseta Extra Grande!");
                break;
            }
            default:

            System.out.println("Tamanho inexistente!");
                break;
        }


        scanner.close();
    }
    

}
