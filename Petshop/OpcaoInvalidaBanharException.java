public class OpcaoInvalidaBanharException extends Exception {
    private String message;
    public OpcaoInvalidaBanharException(String message) {
        this.message = message;

    }

    
    public String getMessage() {
        return message;
    }


}
