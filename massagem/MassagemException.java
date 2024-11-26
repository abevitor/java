package java.massagem;
public class MassagemException extends Exception {

    private String message;

    public MassagemException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message; 
    }
}

