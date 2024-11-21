public class Cpf {
    public static void formatarCpf(String cpf) throws CpfInvalidoException {
        if(cpf.length()!= 14)
            throw new CpfInvalidoException();

         if (cpf.charAt(3) != '.' || cpf.charAt(7) != '.' || cpf.charAt(11) != '-') {
            throw new CpfInvalidoException();
        }

        for (int i = 0; i < cpf.length(); i++) {
            
            if(i !=3 && i != 7 && i != 11){
                if (!Character.isDigit(cpf.charAt(i))) {
                    throw new CpfInvalidoException();
                }
            }
        }
    }
    

}
