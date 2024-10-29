import java.util.Random;

public class Banhar {
    
    public static void banhar(String shampoo) throws OpcaoInvalidaBanharException {
        Random random = new Random();
        int numeroLavada = random.nextInt(10) + 1;

        if (shampoo.toLowerCase().equals("shampoo premium")) {
            for (int i = 0; i < numeroLavada; i++) {
                System.out.println("Lavando com shampoo premium!");
                try { 
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return;
        }

        if (shampoo.toLowerCase().equals("shampoo comum")) {
            for (int i = 0; i < numeroLavada; i++) {
                System.out.println("Lavando com shampoo comum!");
                try { 
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return;
        }

        if (shampoo.toLowerCase().equals("shampoo anticaspas")) {
            for (int i = 0; i < numeroLavada; i++) {
                System.out.println("Lavando com shampoo anticaspas!");
                try { 
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return;
        }

        // Se a opção de shampoo não for válida, lança a exceção
        throw new OpcaoInvalidaBanharException("Opção inválida para o serviço de banho!");
    }

    // Método separado, fora do método banhar
    public static void skibidi(String shampoo) throws OpcaoInvalidaBanharException {
        if (!shampoo.equalsIgnoreCase("shampoo premium") &&
            !shampoo.equalsIgnoreCase("shampoo comum") &&
            !shampoo.equalsIgnoreCase("shampoo anticaspas")) 
            {
            throw new OpcaoInvalidaBanharException("Opção inválida!");
        }
    }
}
