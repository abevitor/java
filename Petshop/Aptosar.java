import java.util.Random;

public class Aptosar {
    public static int aptosar(String escolha) throws OpcaoInvalidaTosaException {
        int cortar = 15;
        int aparar = 20;
        int tosar = 40;
        int maluco = 100;
        
        Random random = new Random();
        int numeroCorte = random.nextInt(10) + 1;

        if (escolha.toLowerCase().equals("tosar")) {
            for (int i = 0; i < numeroCorte; i++) {
                System.out.println("Tosando!!");
                try { 
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Você escolheu a opção tosar! seu cachorro esta peladinho! Obrigado pela escolha!");
            
            return tosar;
        }

        if (escolha.toLowerCase().equals("cortar")) {

            for (int i = 0; i < numeroCorte; i++) {
                System.out.println("Cortando!!");
                try { 
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(
                    "Você escolheu a opção cortar! seu bichinho de estimação esta lindo! Obrigado pela escolha!");

            return cortar;
        }

        if (escolha.toLowerCase().equals("aparar")) {

            for (int i = 0; i < numeroCorte; i++) {
                System.out.println("Aparando!!");
                try { 
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Aparamos o pelo do seu bichinho de estimação! Obrigado pela escolha!");

            return aparar;
        }

        if (escolha.toLowerCase().equals("corte de cabelo maluco")) {

        

            String[] cabelosMalucos = { "Corte do jaca", " skibidi sigma",
                    " maquina de lavar roupa", "topete", "moicano punk", "calvo", "sigma" };

            int corteAletorio = random.nextInt(cabelosMalucos.length);

            String corteEscolhido = cabelosMalucos[corteAletorio];

            System.out.println("O corte maluco escolhido para seu animalzinho de estimação foi: " + corteEscolhido);

            for (int i = 0; i < numeroCorte; i++) {
                System.out.println("Fazendo maluquice!!");
                try { 
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            return maluco;

        } else {
            throw new OpcaoInvalidaTosaException("Opção inválida para serviço de tosa");

        }

    }

    public static void exTosa(String escolha) throws OpcaoInvalidaTosaException {
        if (!escolha.equalsIgnoreCase("tosar") &&
                !escolha.equalsIgnoreCase("cortar") &&
                !escolha.equalsIgnoreCase("aparar") &&
                !escolha.equalsIgnoreCase("cabelo maluco")) {
            throw new OpcaoInvalidaTosaException("Opção inválida!");

        }

    }
}
