public class OpcaoInvalidaSpaException extends Exception {
    private String message;
    public OpcaoInvalidaSpaException(String message){
        this.message = message;

    }

    @Override
    public String getMessage() {
        return message; 
    }

}
