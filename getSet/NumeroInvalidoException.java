
public class NumeroInvalidoException extends Exception {
    private String mensagem;

    public NumeroInvalidoException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}

