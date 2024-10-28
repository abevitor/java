public class Parcelar {
    public static double parcelar(int parcela, String escolha) {
        int cortar = 15;
        int  aparar = 20;
        int tosar = 40;
        int maluco = 100;

        double parccortar = cortar / parcela;
        double parcaparar = aparar / parcela;
        double parctosar = tosar / parcela;
        double parcmaluco = maluco / parcela;

        if(escolha.toLowerCase().equals("tosar")) {
            System.out.println("a quantidade de parcelas foi: " + parcela + "e o preço de cada parcela ficou: " + parctosar);

            return parctosar;
            
        }

        if(escolha.toLowerCase().equals("cortar")) {
            System.out.println("a quantidade de parcelas foi: " + parcela + "e o preço de cada parcela ficou: " + parccortar);

            return parccortar;


        }

        if(escolha.toLowerCase().equals("aparar")) {
            System.out.println("a quantidade de parcelas foi: " + parcela + "e o preço de cada parcela ficou: " + parcaparar);

            return parcaparar;

        

        }

        if(escolha.toLowerCase().equals("corte de cabelo maluco")) {
            System.out.println("a quantidade de parcelas foi: " + parcela + "e o preço de cada parcela ficou: " + parcmaluco);

            return parcmaluco;

            

        }
        
        System.out.println("Opção invalida! Por favor tente novamente!");
        return 0;

    }

}
