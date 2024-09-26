import java.util.Scanner;
public class Prova7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = scanner.nextInt();
        System.out.println(" ");
        System.out.println("Tabuada do " + number);

        for(int i = 1; i < 11; i++){
            System.out.println(i * number);
        }
        scanner.close();
        
    }

}
