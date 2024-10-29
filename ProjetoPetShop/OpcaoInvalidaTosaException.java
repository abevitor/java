public class OpcaoInvalidaTosaException extends Exception{
    private String message;
    public OpcaoInvalidaTosaException(String message) {
        this.message = message;

    }

    @Override
    public String getMessage(){
        return message;
    }

}
