import java.util.Random;

public class Cortar  {
    public static void cortar(String escolhaUnha) throws OpcaoCortarInvalidaException {

        Random random = new Random();
        int numeroCortar = random.nextInt(10) + 1;

        if(escolhaUnha.toLowerCase().equals("LIXAR")){
            for (int i = 0; i < numeroCortar; i++) {
                System.out.println("Lixando as unhas!");
                try { 
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

        if(escolhaUnha.toLowerCase().equals("CORTAR MÉDIO")) {
            for ( int i = 0; i < numeroCortar; i++) {
                System.out.println("Cortando as unhas!!");
                try {
                    Thread.sleep(1500);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        if(escolhaUnha.toLowerCase().equals("Cortar pequeno")) {
            for (int i = 0; i < numeroCortar; i++) {
                System.out.println("Cortando as unhas!!");
                try {
                    Thread.sleep(1500);
                }catch ( InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void validarOpcaoServico(String escolhaUnha) throws OpcaoCortarInvalidaException {

        if (!escolhaUnha.equalsIgnoreCase("cortar pequeno") &&
            !escolhaUnha.equalsIgnoreCase("cortar medio") &&
            !escolhaUnha.equalsIgnoreCase("lixar")) {
            throw new OpcaoCortarInvalidaException("Opção inválida!");

        }
        System.out.println("Opcão Selecionada:" + escolhaUnha);
    }

}
