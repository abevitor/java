import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        String cpf;
        String estado;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu cpf");
        while(true) {
            cpf = scanner.nextLine();
      
                try {
                    Cpf.formatarCpf(cpf);
                    System.out.println("Seu CPF é válido!");
                    break;
                }catch (CpfInvalidoException e) {
                    System.out.println("seu CPF não é válido use o seguinte exemplo XXX.XXX.XXX-XX");
                }
            }
    
        while(true) {
            System.out.println("Digite seu estado!");
            estado = scanner.nextLine();

            try{
                Estado.validarEstado(estado);
                System.out.println("Seu estado: " + estado.toUpperCase() + " é válido! e seu cpf: " + cpf + "tambem!");
                break; 
            } catch(EstadoInvalidoException e) {
                System.out.println("Estado invalido, use apenas Duas siglas e um estado brasileiro válido!");
    
            }
        }

        scanner.close();
        
    }


}
