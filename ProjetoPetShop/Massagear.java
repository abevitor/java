import java.util.Random;

public class Massagear {
    public static void massagear(String opcoes) throws OpcaoInvalidaSpaException {
        Random random = new Random();

        int numeroMassagem = random.nextInt(10) + 1;

        

        if (opcoes.toLowerCase().equals("massagem seca")) {
            for (int i = 0; i < numeroMassagem; i++) {
                System.out.println("massageando!");
            }
        } else if (opcoes.toLowerCase().equals("massagem umida")) {
            for (int i = 0; i < numeroMassagem; i++) {
                System.out.println("massageando!");
            }
        } else if (opcoes.toLowerCase().equals("com creme")) {
            for (int i = 0; i < numeroMassagem; i++) {
                System.out.println("massageando!");
            }
        } else if (opcoes.toLowerCase().equals("sem creme")) {
            for (int i = 0; i < numeroMassagem; i++) {
                System.out.println("massageando!");
            }
        } else {
            throw new OpcaoInvalidaSpaException("Opção inválida para o serviço de SPA.");
        }
        

    }

    public static void skibidi(String opcoes) throws OpcaoInvalidaSpaException {
        if (!opcoes.equalsIgnoreCase("MASSAGEM SECA") &&
            !opcoes.equalsIgnoreCase("MASSAGEM ÚMIDA") &&
            !opcoes.equalsIgnoreCase("COM CREME") &&
            !opcoes.equalsIgnoreCase("SEM CREME")) {
            throw new OpcaoInvalidaSpaException("Opção inválida!");
        }
    }
}
