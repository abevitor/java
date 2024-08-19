import java.util.Scanner;

public class CaixaEletronico {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto de saldo você tem?: ");
        double saldo = scanner.nextDouble();
        System.out.println("Qual o valor da compra?: ");
        double valorSolicitado = scanner.nextDouble();

        scanner.close();

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Sua compra foi bem sucedida! Resta: "+saldo+"R$ no cartão");
            return;
        }

        if(valorSolicitado > saldo){
            System.out.println("É impossivel fazer essa compra, você não tem saldo o suficiente! ");
            return;
        }
    }
}
