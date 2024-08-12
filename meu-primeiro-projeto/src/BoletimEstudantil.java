public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 1;
        if(mediaFinal<6){
            System.out.println("Reprovado");
            return;
        }
        if(mediaFinal == 6){
            System.out.println("Prova substituta");
            return;
        }
        if(mediaFinal > 6){
            System.out.println("Aprovado casco de balo");
            return;
        }
    }

}
