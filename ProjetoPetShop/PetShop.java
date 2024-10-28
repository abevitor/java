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

        System.out.println(x.toString());

        System.out.println("BANHO|TOSA|SPA|CORTAR UNHAS|SERVIÇO COMPLETO|PERGUNTAS");
        String servico = scanner.nextLine();

        System.out.println();

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
            String escolha = scanner.nextLine();

            System.out.println("Qual seria a forma de pagamento? CREDITO|PIX|DINHEIRO|DEBITO");
            String pagamentoTosa = scanner.nextLine();

            if (pagamentoTosa.toLowerCase().equals("credito")) {

                Aptosar.aptosar(escolha);

                System.out.println("Quantas vezes voce deseja parcelar?");
                int parcela = scanner.nextInt();
                scanner.nextLine();

                Parcelar.parcelar(parcela, escolha);

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

            return;
        }
        // parei aqui
        if (servico.toLowerCase().equals("spa")) {
            System.out.println("você deseja: MASSAGEM SECA|MASSAGEM ÚMIDA|COM CREME|SEM CREME");

            System.out.println("É possível escolher mais de uma opção! Quantas opções você deseja escolher");
            int opcoes = scanner.nextInt();

            System.out.println("Qual seria a forma de pagamento? CREDITO|PIX|DINHEIRO|DEBITO");
            String pagamentoSPA = scanner.nextLine();
            if (pagamentoSPA.toLowerCase().equals("credito")) {

                System.out.println("Quantas vezes voce deseja parcelar?");
                int parcela = scanner.nextInt();
                scanner.nextLine();

                System.out.println("sera parcelado em: " + parcela + " vezes. Obrigado pela escolha!");

                return;
            }

            if (pagamentoSPA.toLowerCase().equals("pix")) {

                System.out.println(
                        "Pague o PIX enviando o pagamento para esse email! -> petshopreceba2000@gmail.com. Obrigado pela escolha!");

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
