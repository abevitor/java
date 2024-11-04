import java.util.Scanner;

class LoginInvalidoException extends Exception {
    private String mensagem;

    public LoginInvalidoException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}

public class SistemaLogin {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tentativas = 3;

        System.out.println("Bem-vindo ao sistema de login!");

        while (tentativas > 0) {
            System.out.print("Digite seu nome de usuário: ");
            String username = scanner.nextLine();

            System.out.print("Digite sua senha: ");
            String password = scanner.nextLine();

            try {
                verificarLogin(username, password);
                System.out.println("Login bem-sucedido! Bem-vindo, " + USERNAME + "!");
                break; 
            } catch (LoginInvalidoException e) {
                tentativas--;
                System.out.println("Erro: " + e.getMensagem());
                System.out.println("Tentativas restantes: " + tentativas);
            }

            if (tentativas == 0) {
                System.out.println("Você excedeu o número de tentativas. Acesso bloqueado.");
            }
        }

        scanner.close();
    }

    private static void verificarLogin(String username, String password) throws LoginInvalidoException {
        if (!username.equals(USERNAME) || !password.equals(PASSWORD)) {
            throw new LoginInvalidoException("Nome de usuário ou senha incorretos.");
        }
    }
}