import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        String email;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu email!");
        while (true) {
            email = scanner.nextLine();
            try {
                validarEmail(email);
                System.out.println("Seu email é valido!");
                break;
            }catch (IllegalArgumentException e) {
                System.out.println(" Use a seguinte template: seuemail.fatec.sp.gov.br");
            }
        } 
        
        scanner.close();
    }
    public static void validarEmail(String email) throws IllegalArgumentException {
        if (!email.contains("@fatec.sp.gov.br")) {
            throw new IllegalArgumentException("Não se pode colocar números na área de inserir o nome! Tente novamente.");
        }
    }
}
