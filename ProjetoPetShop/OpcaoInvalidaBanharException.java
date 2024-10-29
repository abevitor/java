public class OpcaoInvalidaBanharException extends Exception {
    private String message;
    public OpcaoInvalidaBanharException(String message) {
        this.message = message;

    }

    @Override
    public String getMessage() {
        return message;
    }


}
