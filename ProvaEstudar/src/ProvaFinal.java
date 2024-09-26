import java.util.Scanner;


public class ProvaFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        System.out.println("Digite a posição que você deseja saber: ");
        int pos = scanner.nextInt();
        
        System.out.println("Digite um valor: ");
        int linha = scanner.nextInt();

        System.out.println("Digite outro valor: ");
        int coluna = scanner.nextInt();

        System.out.println(" ");

        imprimirArray(linha);
        System.out.println(" ");
        imprimirMatriz(linha, coluna);
        System.out.println(" ");
        imprimirPos(palavra, pos);
        


        scanner.close();
        
    }

    public static void imprimirArray(int linha) {
        int valor = 1;

        System.out.println("Array: ");
        System.out.println(" ");
        for(int i = 0; i < linha; i++){
            System.out.print(valor + " ");
            valor++;

        }
        
    }

    public static void imprimirMatriz(int linha, int coluna) {
        int valor = 1; 

        System.out.print("Matriz: ");
        System.out.println(" ");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(valor + " "); 
                valor++; 
            }
            System.out.println(); 
        }
    }

    public static void imprimirPos(String palavra, int pos) {
        if ( pos >= 0 && pos < palavra.length()) {
            char letra = palavra.charAt(pos);
            System.out.println("A palavra escolhida foi: " + palavra + " O caracter na posição: " + pos + " o caracter escolhido: "+ letra);
        }
    }


    

}
