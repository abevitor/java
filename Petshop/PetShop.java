import java.util.Scanner;

// lista doque fazer
// metodo serviço completo( colocar exception)
//metodo perguntas
// fazer Exceção de cada pagamento apos terminar o resto do programa

public class PetShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuffer x = new StringBuffer();
        StringBuilder y = new StringBuilder("Olá ");

        System.out.println("PETSHOP RECEBA");
        System.out.println("/ \\__\r\n" + //
                "(    @\\____\r\n" + //
                " /         O\r\n" + //
                "/   (_____/\r\n" + //
                "/_____/   U\r\n" + //
                "");
        System.out.println("Digite seu nome!");

        String nome;

        while (true) {
            nome = scanner.nextLine();
            x.append("Bem vindo ao PetShop! nome, qual seria o serviço?");
            x.replace(22, 26, nome);

            try {
                ValidarNome.validarNome(nome);
                break;
            } catch (EspacoInvalidoException e) {
                System.out.println("Erro: " + e.getMensagem());
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        System.out.println(" ");

        System.out.println(x.toString());

        System.out.println("BANHO|TOSA|SPA|CORTAR UNHAS|SERVIÇO COMPLETO|PERGUNTAS");
        String servico = " ";

        do {
            try {
                servico = " ";
                servico = scanner.nextLine();
                Menu.validarOpcaoServico(servico);
                break;
            } catch (MenuOpcaoInvalidaException e) {
                System.out.println(
                        e.getMessage() + "escolha um desses: BANHO|TOSA|SPA|CORTAR UNHAS|SERVIÇO COMPLETO|PERGUNTAS ");
            }
        } while (true);

        System.out.println(" ");

        try {
            if (servico.toLowerCase().equals("banho")) {
                y.append(nome);
                System.out.println(y.toString() + " você escolheu a opção banho!");

                System.out.println(" Shampoo Premium 40R$|Shampoo comum 25 R$|shampoo anticaspas 35 R$");

                String shampoo;

                do {
                    try {
                        shampoo = scanner.nextLine();
                        Banhar.banhar(shampoo);
                        break;
                    } catch (OpcaoInvalidaBanharException e) {
                        System.out.println(e.getMessage() + "Por favor, tente novamente");
                    }
                } while (true);

                System.out.println(" ");

                System.out.println("Qual seria a forma de pagamento? CREDITO|PIX|DINHEIRO|DEBITO");

                String pagamento;
                do {
                    try {
                        pagamento = scanner.nextLine();
                        Pagamento.pagar(pagamento);
                        break;
                    } catch (OpcaoInvalidaPagamentoException e) {
                        System.out.println(e.getMessage() + "Por favor, coloque uma forma de pagamento valida! ");
                    }
                } while (true);

                if (pagamento.toLowerCase().equals("credito")) {

                    System.out.println("Quantas vezes voce deseja parcelar?");

                    int parcelaBanho;

                    parcelaBanho = scanner.nextInt();
                    System.out.println(" ");
                    ParcelarBanho.parcelarBanho(parcelaBanho, shampoo);

                    return;

                }
                if (pagamento.toLowerCase().equals("pix")) {

                    System.out.println(
                            "Pague o PIX enviando o pagamento para esse email! -> petshopreceba2000@gmail.com. Obrigado pela escolha!");

                    return;
                }
                if (pagamento.toLowerCase().equals("dinheiro")) {

                    System.out.println("Se dirija ao caixa e pague a quantia correta! Obrigado pela escolha!");

                    return;
                }
                if (pagamento.toLowerCase().equals("debito")) {

                    System.out.println("Ensira seu cartão! Obrigado pela escolha!");

                    return;
                }
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
                do {

                    try {
                        if (pagamentoTosa.toLowerCase().equals("credito")) {

                            System.out.println("Quantas vezes voce deseja parcelar?");
                            int parcela = scanner.nextInt();
                            scanner.nextLine();

                            ParcelarCortes.parcelar(parcela, escolha);

                            System.out.println("sera parcelado em: " + parcela + " vezes. Obrigado pela escolha!");

                            return;
                        }

                        if (pagamentoTosa.toLowerCase().equals("pix")) {

                            System.out.println(
                                    "Pague o PIX enviando o pagamento para esse email! -> petshopreceba2000@gmail.com. Obrigado pela escolha!");

                            return;
                        }

                        if (pagamentoTosa.toLowerCase().equals("dinheiro")) {

                            System.out.println("Se dirija ao caixa e pague a quantia correta! Obrigado pela escolha!");

                            return;
                        }

                        if (pagamentoTosa.toLowerCase().equals("debito")) {

                            System.out.println("Ensira seu cartão! Obrigado pela escolha!");

                            return;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage() + " Por favor, tente novamente.");
                    }
                } while (true);

            }

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
                } catch (Exception e) {
                    System.out.println(e.getMessage() + " Por favor, tente novamente.");
                }

                return;
            }

            if (servico.toLowerCase().equals("cortar unhas")) {
                System.out.println("LIXAR 5R$|CORTAR PEQUENO 17R$|CORTAR MÉDIO 10R$");

                String escolhaUnha = " ";

                do {
                    try {
                        escolhaUnha = scanner.nextLine();
                        Cortar.cortar(escolhaUnha);
                        break;
                    } catch (OpcaoCortarInvalidaException e) {
                        System.out.println(e.getMessage() + " Por favor, tente novamente!");
                    }
                } while (true);

                System.out.println("Método de pagamento: CREDITO|DEBITO|PIX|DINHEIRO");
                String pagamentoUnha;

                pagamentoUnha = scanner.nextLine();

                try {
                    if (pagamentoUnha.toLowerCase().equals("credito")) {

                        System.out.println(" ");
                        System.out.println("Quantas vezes voce deseja parcelar?");
                        int parcelaSpa = scanner.nextInt();
                        System.out.println(" ");
                        ParcelarUnha.parcelar(escolhaUnha, parcelaSpa);
                        return;
                    }

                    if (pagamentoUnha.toLowerCase().equals("pix")) {

                        System.out.println(" ");
                        System.out.println(
                                "Pague o PIX enviando o pagamento para esse email! -> petshopreceba2000@gmail.com. Obrigado pela escolha!");
                        return;
                    }

                    if (pagamentoUnha.toLowerCase().equals("dinheiro")) {

                        System.out.println("Se dirija ao caixa e pague a quantia correta! Obrigado pela escolha!");
                        return;
                    }

                    if (pagamentoUnha.toLowerCase().equals("debito")) {

                        System.out.println("Ensira seu cartão! Obrigado pela escolha!");
                        return;
                    }

                } catch (Exception e) {

                    System.out.println("Tente novamente!");
                }

                return;

            }

            if (servico.toLowerCase().equals("serviço completo")) {

                return;
            }
        } catch (Exception e) {
            System.out.println("Por favor tente novamente!");
        }

    }

}
