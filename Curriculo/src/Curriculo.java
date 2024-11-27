import java.util.Scanner;

public class Curriculo {
    public static void main(String[] args) throws Exception {
        GetSet a = new GetSet();
        Geralzito b = new Geralzito();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        a.setNome(nome);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        a.setIdade(idade);

        scanner.nextLine();

        System.out.println("Digite seu email: ");
        String email = scanner.nextLine();
        a.setEmail(email);

        System.out.println("Digite seu grau de escolaridade: ");
        String escolaridade = scanner.nextLine();
        a.setEscolaridade(escolaridade);

        System.out.println("Digite sua graduação caso tenha uma.");
        String graduacao = scanner.nextLine();
        a.setGraduacao(graduacao);

        System.out.println("Esta cursando algo no momento? Caso sim, qual?");
        String cursando = scanner.nextLine();
        a.setCursando(cursando);

        System.out.println("Qual sua expectativa de sálario? Caso tenha uma.");
        double salario = scanner.nextDouble();
        a.setSalario(salario); 

        scanner.nextLine();


        scanner.close();

        b.geral(a);

    }
}
