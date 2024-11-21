public class EmailException  extends Exception {
    public String message;
    
    public EmailException(String mensagem){
        this.message = message;
    }
  
    public String getMessage(){
        return message;
    }
    
}
