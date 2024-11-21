public class EstadoInvalidoException extends Exception{
    String message;

    public EstadoInvalidoException(String message) {
        this.message = message;

    }
    public String getMessage() {
        return message;
    }

}
