import java.util.Scanner;

public class Prova8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de linhas: ");
        int linha = scanner.nextInt();
        System.out.println("Digite o número de colunas: ");
        int coluna = scanner.nextInt();
        System.out.println(" ");

        
        imprimirMatriz(linha, coluna);
    }

    public static void imprimirMatriz(int linha, int coluna) {
        int valor = 1; 

        
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(valor + " "); 
                valor++; 
            }
            System.out.println(); 
        }
    }
}
