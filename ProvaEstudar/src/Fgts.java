import java.util.Scanner;

class EspacoInvalidoException extends Exception {
    private String mensagem;

    public EspacoInvalidoException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}

public class Fgts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        double salario;
        
        while (true) {
            System.out.print("Informe seu nome: ");
            nome = scanner.nextLine();
            
            try {
                validarNome(nome);
                break;  
            } catch (EspacoInvalidoException e) {
                System.out.println("Erro: " + e.getMensagem());
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        while (true) {
            System.out.print("Informe seu salário: ");
            try {
                salario = scanner.nextDouble();
                
                if (salario < 465) {
                    System.out.println("Erro: Salário abaixo do mínimo (465,00)");
                } else if (salario % 1 != 0) {
                    System.out.println("Erro: O salário deve ser um número fracionário.");
                } else {
                    break;
                }
                
            } catch (NumberFormatException e) {
                System.out.println("Erro: informe um número válido (ex.: 567.44)");
            }
        }
        
        double fgts = salario * 0.08;

        System.out.println("\nRecibo de pagamento");
        System.out.println("Nome: " + nome);
        System.out.printf("Salário: R$ %.2f%n", salario);
        System.out.printf("FGTS: R$ %.2f%n", fgts);
        
        scanner.close();
    }
    
    private static void validarNome(String nome) throws EspacoInvalidoException, IllegalArgumentException {
        if (nome.length() < 5 || nome.length() > 50) {
            throw new IllegalArgumentException("Número de caracteres inválido! Tente novamente");
        }
        if (!nome.matches("[a-zA-Z ]+")) {
            throw new IllegalArgumentException("Não se pode colocar números na área de inserir o nome! Tente novamente.");
        }
        if (nome.startsWith(" ") || nome.endsWith(" ")) {
            throw new EspacoInvalidoException("O nome não deve começar ou terminar com espaços em branco. Tente novamente.");
        }
    }
}