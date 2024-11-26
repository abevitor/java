package java.massagem;

import java.util.Scanner;

//Um cliente levou seu bichinho de astimação para um dia de massagem! com isso temos opções de massagem e pagamento.
//caso ele escolha algo inexistente, sera lançada uma exception.

public class massagista  {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome!");
        String nome = scanner.nextLine();

        System.out.println("você deseja:|MASSAGEM SECA|MASSAGEM UMIDA|COM CREME| || PREÇOS: |30|35|60|");
            System.out.println(" ");
        
            String opcoes = " ";

            do {
                try {
                    opcoes = scanner.nextLine();
                    C.massagear(opcoes);  
                    break; 
                } catch (MassagemException e) {
                    System.out.println(e.getMessage() + " Por favor, tente novamente.");
                }
            } while (true);
            
            System.out.println("Qual seria a forma de pagamento? CREDITO|PIX|DINHEIRO|DEBITO");
            String pagamentoSPA = scanner.nextLine();
            
            try {
                if (pagamentoSPA.toLowerCase().equals("credito")) {
                     
                    System.out.println(" ");
                    System.out.println("Quantas vezes voce deseja parcelar?");
                    System.out.println(" ");
                    return;
                }
        
                if (pagamentoSPA.toLowerCase().equals("pix")) {
                    
        
                    System.out.println(" ");
                    System.out.println("Pague o PIX enviando o pagamento para esse email! -> petshopreceba2000@gmail.com. Obrigado pela escolha!");
                    return;
                }
        
                if (pagamentoSPA.toLowerCase().equals("dinheiro")) {
                    
        
                    System.out.println("Se dirija ao caixa e pague a quantia correta! Obrigado pela escolha!");
                    return;
                }
        
                if (pagamentoSPA.toLowerCase().equals("debito")) {
                    
        
                    System.out.println("Ensira seu cartão! Obrigado pela escolha!");
                    return;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage() + " Por favor, tente novamente.");
            }
        
            return;
        }
        
    }


