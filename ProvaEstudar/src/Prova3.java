import java.util.Scanner;


public class Prova3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número:");
    double lado1 = scanner.nextDouble();
    System.out.println("Digite outro número:");
    double lado2 = scanner.nextDouble();
    System.out.println("Digite mais um número:");
    double lado3 = scanner.nextDouble();

    scanner.close();

    if(lado1 == lado2 && lado2 == lado3){
        System.out.println("É um triangulo equilatero!");
        return;

    }
    if(lado1 != lado2 && lado2 != lado3){
        System.out.println("Não é um triangulo equilatero!");
        return;

    }
 
  }

}

