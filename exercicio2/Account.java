package java.exercicio2;
import java.util.Scanner;
public class Account {
    String name;
    int age;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome ze ruela");
        String name = scanner.nextLine();

        System.out.println("Digite sua idade");
        int age = scanner.nextInt();

        Account a = new Account();

        a.setAge(age);
        a.setName(name);

        a.printDetalhes();
        
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public String getName(String name) {

        return this.name;

    }

    public int getAge(int age) {
        
        return this.age;
    }

    public void printDetalhes() {
        System.out.println(name + ", " + age);
    }
}
