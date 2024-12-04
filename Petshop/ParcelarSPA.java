public class ParcelarSPA {
    public static double parcelar(String opcoes, int parcelaSpa) {
        int massagemS = 30;
        int massagemU = 35;
        int comCreme = 60;

        double parcMassagemS = 30 / parcelaSpa;
        double parcMassagemU = 35 / parcelaSpa;
        double parcComCreme = 60 / parcelaSpa;

        if (opcoes.toLowerCase().equals("massagem seca")) {
            System.out.println("a quantidade de parcelas foi: " + parcelaSpa + " ,o preço de cada parcela ficou: "
                    + parcMassagemS + " e o preço total ficou: " + massagemS);

            return parcMassagemS;

        }
        if (opcoes.toLowerCase().equals("massagem umida")) {
            System.out.println("a quantidade de parcelas foi: " + parcelaSpa + " ,o preço de cada parcela ficou: "
                    + parcMassagemU + " e o preço total ficou: " + massagemU);

            return parcMassagemU;

        }

        if (opcoes.toLowerCase().equals("com creme")) {
            System.out.println("a quatidade de parcelas foi: " + parcelaSpa + " ,o preço de cada parcela ficou: " 
            + parcComCreme  + "e o preço total ficou: " + comCreme );

             return parcComCreme;
        }

        return 0;
    }

}
