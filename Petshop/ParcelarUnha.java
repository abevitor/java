public class ParcelarUnha {

    public static double parcelar( String escolhaUnha, int parcelarUnha){
        int unhaPequena = 17;
        int unhaMedia = 10;
        int lixar = 5;

        double parcelaUnhaP = unhaPequena / parcelarUnha;
        double parcelaUnhaM = unhaMedia / parcelarUnha;
        double parcelaLixa = lixar / parcelarUnha;

        if(escolhaUnha.toLowerCase().equals("PEQUENO")){

            System.out.println("Sua parcela saiu: " + parcelaUnhaP + " R$ cada.");

            return parcelaUnhaP ;

        }

        if(escolhaUnha.toLowerCase().equals("MEDIA")) {
            
            System.out.println("Sua parcela saiu: " + parcelaUnhaM + " R$ cada.");

            return parcelaUnhaM;
        }

        if(escolhaUnha.toLowerCase().equals("LIXAR")) {

            System.out.println("Sua parcela saiu: " + parcelaLixa + " R$ cada.");

            return parcelaLixa;

        }

        return 0;
    }
}
