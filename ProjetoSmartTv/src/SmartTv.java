public class SmartTv {
    boolean ligada = false;
    String ligada1 = "Ligada!";
    int canal = 1;
    int volume = 25;

    public void ligar(){
        
        ligada = true;
        System.out.println("a tv esta ligada!");

    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("aumentando o volume para:  " + volume);
        
    }

    public void abaixarVolume(){
        volume--;
        System.out.println("abaixando o volume para: " + volume);
        
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;

    }


}
