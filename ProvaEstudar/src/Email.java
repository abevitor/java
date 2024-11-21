public class Email {
    public static void validarEmail(String mensagem) throws EmailException{
        if (!mensagem.equalsIgnoreCase("banho") &&
            !mensagem.equalsIgnoreCase("spa") &&
            !mensagem.equalsIgnoreCase("tosa") &&
            !mensagem.equalsIgnoreCase("cortar unhas") &&
            !mensagem.equalsIgnoreCase("serviço completo") &&
            !mensagem.equalsIgnoreCase("perguntas")) {
            throw new EmailException("Opção inválida!");
        }
    }
    
}
