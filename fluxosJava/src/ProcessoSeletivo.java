public class ProcessoSeletivo {
    
    public static void main (String[] args) {
        System.out.println("Processo seletivo");
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase  = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato!");
            return;
        }
        if(salarioBase == salarioPretendido){
            System.out.println("Oferecer ContraProposta");
            return;
        }

        if(salarioBase < salarioPretendido){
            System.out.println("Aguardando os demais candidatos!");
            return;
        }
    }

}
