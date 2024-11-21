import java.util.Scanner;
class main {
    public static void main(String[] args) {

        String email;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu email!");

        do {
            try {
                email = " ";
                email = scanner.nextLine();
               
                if(!email.contains("@")) {
                    throw new EmailException("Email inválido: " + email);
                }
                System.out.println("Email válido: " + email);
                break;

            }catch (EmailException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (true);
    }
}
