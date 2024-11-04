public class ValidarNomeException {
    class EspacoInvalidoException extends Exception {
         String mensagem;
    
        public EspacoInvalidoException(String mensagem) {
            this.mensagem = mensagem;
        }
    
        public String getMensagem() {
            return mensagem;
        }
    }

}
