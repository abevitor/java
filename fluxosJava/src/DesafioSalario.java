import java.util.Scanner;
public class DesafioSalario {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor bruto do seu salário!: ");
        double valorSalario = scanner.nextDouble();
        System.out.println("Digite o benefício adcional!: ");
        double valorBeneficio = scanner.nextDouble();

        scanner.close();

        double valorImposto = 0;

        if(valorSalario>= 0 && valorSalario <= 1100){
            valorImposto = 0.05F * valorSalario;
            
        }

        if(valorSalario >= 1101.01 && valorSalario <= 2500){
            valorImposto = 0.10F * valorSalario;
            
        }
        
        if(valorSalario >= 2500){
            valorImposto = 0.15F * valorSalario;
            
        }

        double salarioLiquido = (valorSalario - valorImposto) + valorBeneficio;
        System.out.println(String.format("%.2f", salarioLiquido));

        

        
    








        scanner.close();

    }

}
