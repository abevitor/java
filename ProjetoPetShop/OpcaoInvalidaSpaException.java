public class OpcaoInvalidaSpaException extends Exception {
    private String message;
    public OpcaoInvalidaSpaException(String message){
        this.message = message;

    }
    
    public String getMessage() {
        return message; 
    }

}
