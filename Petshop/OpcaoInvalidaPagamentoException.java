public class OpcaoInvalidaPagamentoException extends Exception {

    private String message;
    public OpcaoInvalidaPagamentoException(String message) {
        this.message = message;

    }

    public String getMessage() {
        return message;
    }

}
