public class MenuOpcaoInvalidaException extends Exception {
    private String message;
    public MenuOpcaoInvalidaException(String message){
        this.message = message;

    }

   
    public String getMessage(){
        return message;
    }


}
