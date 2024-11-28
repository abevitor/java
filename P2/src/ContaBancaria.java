import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) throws Exception {

        GetSetters a = new GetSetters();
        Receba b = new Receba();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome.");
        String nome = scanner.nextLine();
        a.setNome(nome);

        System.out.println("Digite sua idade.");
        int idade = scanner.nextInt();
        a.setIdade(idade);

        scanner.nextLine();

        System.out.println("Digite o seu CPF.");
        String cpf = scanner.nextLine();
        a.setCpf(cpf);

        System.out.println("Digite o numero da sua conta.");
        int conta = scanner.nextInt();
        a.setConta(conta);

        System.out.println("Digite 1 para depositar \n Digite 2 para ver quanto tem na conta \n Digite 3 para sacar. ");
        int opcoes = scanner.nextInt();
        a.setOpcoes(opcoes);


        if (opcoes == 1) {

            System.out.println("Quanto voce deseja depositar?");
            double deposito = scanner.nextDouble();
            a.setDeposito(deposito);

            b.Metodos(a);

            return;
        }

        
        if (opcoes == 2) {

            double quantidade = 100.20;

            System.out.println("Você possui: " + quantidade + " R$.");

            b.Metodos(a);


            return;
        }

        if (opcoes == 3) {

            double valorSacar = 10;
            
            System.out.println("Você possui " + valorSacar + " R$. Quanto deseja sacar?");
            double sacar = scanner.nextDouble();

            if (sacar > 10) {

                System.out.println("Você não possui saldo suficiente!");

                b.Metodos(a);
                
                return;
            }

            if (sacar <= 10) {

                System.out.println("Voce sacou:" + valorSacar + " R$");

                b.Metodos(a);

                return;

            }

        }
        
    }
}
