import java.util.Scanner;
public class Usuario {
 
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        SmartTv smartTv = new SmartTv();
        

        System.out.println("Voce deseja ligar a tv? sim ou nao?: ");
        boolean pergunta = scanner.nextBoolean();

        if(pergunta == true){
            System.out.println( "a tv esta: " + smartTv.ligada1);
            
           
            return;         
        }

        if(pergunta == false){
            System.out.println("a tv esta: " );
        }
        smartTv.abaixarVolume();


        
        
        

        smartTv.abaixarVolume();
         smartTv.abaixarVolume();
         smartTv.abaixarVolume();
         smartTv.abaixarVolume();
         smartTv.aumentarVolume();
         smartTv.mudarCanal(13);

         System.out.println(" Novo Status -> TV Ligada?: " + smartTv.ligada);
        System.out.println("TV Ligada?: " + smartTv.ligada);
         System.out.println("Canal Atual?: " + smartTv.canal);
         System.out.println("Volume Atual?: " + smartTv.volume);
         System.out.println("Canal Atual: "+smartTv.canal);
         System.out.println("Novo Status -> Volume Atual: " + smartTv.volume);

       
        
    }
}
