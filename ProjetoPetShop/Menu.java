public class Menu {
    public static void validarOpcaoServico(String servico) throws MenuOpcaoInvalidaException {

        if (!servico.equalsIgnoreCase("MASSAGEM SECA") &&
            !servico.equalsIgnoreCase("MASSAGEM ÚMIDA") &&
            !servico.equalsIgnoreCase("COM CREME") &&
            !servico.equalsIgnoreCase("SEM CREME")) {
            throw new MenuOpcaoInvalidaException("Opção inválida!");
        }


    }

}
