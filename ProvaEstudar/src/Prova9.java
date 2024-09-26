import java.util.Scanner;

public class Prova9 {
    public static void main(String[] args) {
        
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite um número!");
        int linha = scanner.nextInt();

        imprimirArray(linha);
        
        scanner.close();



        
    }
    public static void imprimirArray(int linha){
        int valor =  1;
        for(int i = 0; i < linha; i++){
            System.out.print(valor + " ");
            valor++;

        }

    }

}
