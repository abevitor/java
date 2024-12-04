public class Menu {
    public static void validarOpcaoServico(String servico) throws MenuOpcaoInvalidaException {

        if (!servico.equalsIgnoreCase("banho") &&
            !servico.equalsIgnoreCase("spa") &&
            !servico.equalsIgnoreCase("tosa") &&
            !servico.equalsIgnoreCase("cortar unhas") &&
            !servico.equalsIgnoreCase("serviço completo") &&
            !servico.equalsIgnoreCase("perguntas")) {
            throw new MenuOpcaoInvalidaException("Opção inválida!");
        }


    }

}
