public class Banhar {
    public static void banhar(double tamanho, int shampoo){

        double shampooPremiumLitro = 50;
        double shampooComumLitro= 12.5;
        double shampooDermatiteLitro = 22.5;
        double LitroPerM = 30;
        double regra = (tamanho / 100) * LitroPerM;

        if(shampoo == 1){
           double totalPremium =  regra * shampooPremiumLitro ;
           System.out.println( "o preço total do banho ficou: " + totalPremium);
           return;
               
        }
        if(shampoo == 2){
            double totalComum = regra * shampooComumLitro;
            System.out.println( "o preço total do banho ficou: "  + totalComum);
            return;
              
        }
        if(shampoo == 3){
            double totalDermatite = regra * shampooDermatiteLitro;
            System.out.println(  "o preço total do banho ficou: " + totalDermatite);
            return;

        }
    }

}
