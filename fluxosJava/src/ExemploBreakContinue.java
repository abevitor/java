public class ExemploBreakContinue {

    public static void main(String[] args) {

        //break
        for( int i = 1; i <=5; i++){
            if(i == 3)
            break;
            System.out.println(i);
        }

        for(int z = 1; z<= 5; z++){
            if(z  == 3 ) 
                continue;
                System.out.println(z);
            

        }
    }

}
