import java.util.Scanner;

public class Prova {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

       System.out.println("Digite um número:");
       double n1 = scanner.nextDouble();
       System.out.println("Digite outro número:");
       double n2 = scanner.nextDouble();
       System.out.println("Digite mais um número:");
       Double n3 = scanner.nextDouble();

       scanner.close();

       double total = n1 + n2 + n3;

       System.out.println("A soma total dos números escolhidos foi: " + total);

       
    }
}
