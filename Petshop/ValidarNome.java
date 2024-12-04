public class ValidarNome {

    public static void validarNome(String nome) throws EspacoInvalidoException, IllegalArgumentException {
        if (nome.length() < 5 || nome.length() > 50) {
            throw new IllegalArgumentException("Número de caracteres inválido! Tente novamente");
        }
        if (!nome.matches("[a-zA-Z ]+")) {
            throw new IllegalArgumentException("Não se pode colocar números na área de inserir o nome! Tente novamente.");
        }
        if (nome.startsWith(" ") || nome.endsWith(" ")) {
            throw new EspacoInvalidoException("O nome não deve começar ou terminar com espaços em branco. Tente novamente.");
        }
    }

}
