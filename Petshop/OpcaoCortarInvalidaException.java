public class OpcaoCortarInvalidaException extends Exception{

    private String message;
    public OpcaoCortarInvalidaException(String message) {
        this.message = message;

    }

    public String getMessage() {
        return message;
    }

}
