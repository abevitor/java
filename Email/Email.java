public class Email {
    public static void validarEmail(String email) throws IllegalArgumentException {
        if (!email.contains("@fatec.sp.gov.br")) {
            throw new IllegalArgumentException("Não se pode colocar números na área de inserir o nome! Tente novamente.");
        }
    }
}
