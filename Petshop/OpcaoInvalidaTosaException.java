public class OpcaoInvalidaTosaException extends Exception{
    private String message;
    public OpcaoInvalidaTosaException(String message) {
        this.message = message;

    }

    
    public String getMessage(){
        return message;
    }

}
