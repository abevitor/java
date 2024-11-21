import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        String email;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu email!");
        while (true) {
            email = scanner.nextLine();
            try {
                Email.validarEmail(email);
                System.out.println("Seu email é valido!");
                break;
            }catch (IllegalArgumentException e) {
                System.out.println(" Use a seguinte template: seuemail.fatec.sp.gov.br");
            }
        } 
        
        scanner.close();
    }
}
