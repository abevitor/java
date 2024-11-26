



import java.util.Scanner;

public class TelefoneMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String telefone;

        System.out.println("Digite seu número de telefone, somente números: ");
      
        while(true){
            telefone = scanner.nextLine();
            try {
                // Valida e formata o número de telefone
                ValidaTelefone.validarTelefone(telefone);
                // Mostra a mensagem indicando que o telefone é válido
                System.out.println("Seu telefone " + telefone + " é válido!");
                break; // Sai do loop caso o telefone seja válido
            } catch(NumeroInvalidoException e) {
    
                System.out.println("Erro: " + e.getMensagem());
            }
        }
        
        scanner.close();
    }
}
