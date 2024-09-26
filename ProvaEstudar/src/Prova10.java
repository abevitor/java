import java.util.Scanner;

public class Prova10 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um nome");
    String nome = scanner.nextLine();

    System.out.println("Qual a posição que você quer checar?");
    int pos = scanner.nextInt();

    posicaoNome(nome, pos);
    
    scanner.close();
}
public static void posicaoNome(String nome, int pos){
    if(pos >= 0 && pos < nome.length()){
        char caractere = nome.charAt(pos);
       System.out.println("O caractere na posição " + pos + " é: " + caractere);
        return;
    }
}

}
