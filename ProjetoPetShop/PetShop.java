import java.util.Scanner;

// lista doque fazer
// catch execption em alguns lugares(prioridade)
//metodo do spa(prioridade)
// metodo de cortar unhas
// metodo serviço completo
//metodo perguntas
// colocar thread.sleep em alguns metodos

public class PetShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuffer x = new StringBuffer();
        StringBuilder y = new StringBuilder("Olá ");

        System.out.println("PETSHOP RECEBA");
 System.out.println(" / \\__\r\n" + //
                "(    @\\____\r\n" + //
                " /         O\r\n" + //
                "/   (_____/\r\n" + //
                "/_____/   U\r\n" + //
                "");
        System.out.println("Digite seu nome!");
        String nome = scanner.nextLine();
        x.append("Bem vindo ao PetShop! nome, qual seria o serviço?");
        x.replace(22, 26, nome);

        System.out.println(" ");

        System.out.println(x.toString());

        System.out.println("BANHO|TOSA|SPA|CORTAR UNHAS|SERVIÇO COMPLETO|PERGUNTAS");
        String servico = scanner.nextLine();

        System.out.println(" ");

        if (servico.toLowerCase().equals("banho")) {
            y.append(nome);
            System.out.println(y.toString() + " você escolheu a opção banho!");
            System.out.println("Digite o tamanho do seu cachorro (em metros)");
            double tamanho = scanner.nextDouble();
            System.out.println(
                    "Digite (1) se voce deseja usar Shampoo Premium, Digite (2) se voce deseja usar Shampoo comum e (3) se deseja usar shampoo comum");
            int shampoo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Qual seria a forma de pagamento? CREDITO|PIX|DINHEIRO|DEBITO");
            String pagamento = scanner.nextLine();

            if (pagamento.toLowerCase().equals("credito")) {
                Banhar.banhar(tamanho, shampoo);

                System.out.println("Quantas vezes voce deseja parcelar?");
                int parcela = scanner.nextInt();
                scanner.nextLine();

                System.out.println("sera parcelado em: " + parcela + " vezes. Obrigado pela escolha!");

                return;
            }
            if (pagamento.toLowerCase().equals("pix")) {
                Banhar.banhar(tamanho, shampoo);
                System.out.println(
                        "Pague o PIX enviando o pagamento para esse email! -> petshopreceba2000@gmail.com. Obrigado pela escolha!");

                return;
            }
            if (pagamento.toLowerCase().equals("dinheiro")) {
                Banhar.banhar(tamanho, shampoo);
                System.out.println("Se dirija ao caixa e pague a quantia correta! Obrigado pela escolha!");

                return;
            }
            if (pagamento.toLowerCase().equals("debito")) {
                Banhar.banhar(tamanho, shampoo);
                System.out.println("Ensira seu cartão! Obrigado pela escolha!");

                return;
            }

            return;

        }

        if (servico.toLowerCase().equals("tosa")) {
            System.out.println(y.toString() + "voce escolheu tosa");
            System.out.println("Voce deseja: CORTAR|APARAR|TOSAR|CORTE DE CABELO MALUCO| PREÇOS: 15|20|40|100");

            String escolha = " ";

            do { 
                try { 
             escolha = scanner.nextLine();
             Aptosar.aptosar(escolha);
             break;
            } catch (OpcaoInvalidaTosaException e) {
                System.out.println(e.getMessage() + "Por favor, tente novamente.");
            }
        } while (true);

            System.out.println("Qual seria a forma de pagamento? CREDITO|PIX|DINHEIRO|DEBITO");
            String pagamentoTosa = scanner.nextLine();

            try { 
            if (pagamentoTosa.toLowerCase().equals("credito")) {

                Aptosar.aptosar(escolha);

                System.out.println("Quantas vezes voce deseja parcelar?");
                int parcela = scanner.nextInt();
                scanner.nextLine();

                ParcelarCortes.parcelar(parcela, escolha);

                System.out.println("sera parcelado em: " + parcela + " vezes. Obrigado pela escolha!");

                return;
            }

            if (pagamentoTosa.toLowerCase().equals("pix")) {

                Aptosar.aptosar(escolha);
                System.out.println(
                        "Pague o PIX enviando o pagamento para esse email! -> petshopreceba2000@gmail.com. Obrigado pela escolha!");

                return;
            }

            if (pagamentoTosa.toLowerCase().equals("dinheiro")) {

                Aptosar.aptosar(escolha);

                System.out.println("Se dirija ao caixa e pague a quantia correta! Obrigado pela escolha!");

                return;
            }

            if (pagamentoTosa.toLowerCase().equals("debito")) {

                Aptosar.aptosar(escolha);
                System.out.println("Ensira seu cartão! Obrigado pela escolha!");

                return;
            }
        } catch (OpcaoInvalidaTosaException e) {
            System.out.println(e.getMessage() + " Por favor, tente novamente.");
        }

            return;
        }
        // parei aqui
        if (servico.toLowerCase().equals("spa")) {
            System.out.println("você deseja:|MASSAGEM SECA|MASSAGEM UMIDA|COM CREME| || PREÇOS: |30|35|60|");
            System.out.println(" ");
        
            String opcoes = " ";
        
            do {
                try {
                    opcoes = scanner.nextLine();
                    Massagear.massagear(opcoes);  
                    break; 
                } catch (OpcaoInvalidaSpaException e) {
                    System.out.println(e.getMessage() + " Por favor, tente novamente.");
                }
            } while (true);
            
            System.out.println("Qual seria a forma de pagamento? CREDITO|PIX|DINHEIRO|DEBITO");
            String pagamentoSPA = scanner.nextLine();
            
            try {
                if (pagamentoSPA.toLowerCase().equals("credito")) {
                     
                    System.out.println(" ");
                    System.out.println("Quantas vezes voce deseja parcelar?");
                    int parcelaSpa = scanner.nextInt();
                    System.out.println(" ");
                    ParcelarSPA.parcelar(opcoes, parcelaSpa);
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
        

        if (servico.toLowerCase().equals("cortar unhas")) {

            return;

        }

        if (servico.toLowerCase().equals("serviço completo")) {

            return;
        }

    }

    
}
