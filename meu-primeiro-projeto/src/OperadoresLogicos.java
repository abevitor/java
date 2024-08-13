public class OperadoresLogicos {
    public static void main(String[] args){

        boolean cond1 = true;
        
        boolean cond2 = false;

        if(cond1 && (7> 5)){
            System.out.println("As duas sao verdadeiras e maneiras");
        }
    

        if(cond1 != cond2){
            System.out.println("Sao diferentes");
            return;
        }

        if(cond1 || cond2){
            System.out.println("Uma das duas sao verdadeiras");
            return;
        }
    }

}
