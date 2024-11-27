import java.util.Scanner;

public class Account {

    public static void main(String[] args) {

        GettersSet a = new GettersSet();
        Geral b = new Geral();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu genero (USE M para masculino e F para feminino): ");
        String gen = scanner.nextLine();
        a.setGen(gen);  // Atribuindo o valor de 'gen'

        System.out.println("Digite seu nome: ");
        String name = scanner.nextLine();
        a.setName(name);

        System.out.println("Digite sua idade: ");
        int age = scanner.nextInt();
        a.setAge(age);

        System.out.println("Digite seu tamanho: ");
        double tamanho = scanner.nextDouble();
        a.setTamanho(tamanho);

        System.out.println("Digite o tamanho do seu pai: ");
        double tamanhoPai = scanner.nextDouble();
        a.setTamanhoPai(tamanhoPai);

        System.out.println("Digite o tamanho da sua mãe: ");
        double tamanhoMae = scanner.nextDouble();
        a.setTamanhoMae(tamanhoMae);

        // Chamando o método que imprime os detalhes
        b.printDetalhes(a);
    }
}
