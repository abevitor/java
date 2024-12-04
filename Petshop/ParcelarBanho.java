public class ParcelarBanho {

    public static double parcelarBanho( int parcelaBanho, String shampoo) {

        int shampooPremium = 40;
        int shampooComum = 25;
        int shampooAntiCaspas = 35;
        double totShampooPremium = shampooPremium / parcelaBanho;
        double totShampooComum = shampooComum / parcelaBanho;
        double totShampooAntiCaspas = shampooAntiCaspas / parcelaBanho;

        if(shampoo.toLowerCase().equals("shampoo premium")) {
            System.out.println("a quantidade de parcelas foi: " + parcelaBanho + " e cada parcela fica no preço de: " + totShampooPremium);
            return totShampooPremium;
        }

        if(shampoo.toLowerCase().equals("shampoo comum")) {
            System.out.println("a quantidade de parcelas foi: " + parcelaBanho + " e cada parcela fica no preço de: " + totShampooComum);
            return totShampooComum;
        }

        if(shampoo.toLowerCase().equals("shampoo premium")) {
            System.out.println("a quantidade de parcelas foi: " + parcelaBanho + " e cada parcela fica no preço de: " + totShampooAntiCaspas);
            return totShampooAntiCaspas;
        }

        return 0;

    }

}
