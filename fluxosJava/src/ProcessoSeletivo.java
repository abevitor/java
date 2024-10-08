import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    
    public static void main (String[] args) {
        String[] candidatos = {"BILL","AUGUSTO","MIQUELLA","BEATRIZ","VITOR"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);

        }
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
            tentativasRealizadas++;
             else
             System.out.println("CONTATO REALIZADO COM SUCESSO");

        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
        System.out.println("CONSEGUIMOS CONTATO COM " + candidato + "NA" + tentativasRealizadas + " TENTATIVA");
          else 
          System.out.println("CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO DE TENTATIVAS " + tentativasRealizadas + " REALIZADA");

    }

    static void imprimirSelecionados(){
        String[] candidatos = {"BILL","AUGUSTO","MIQUELLA","BEATRIZ","VITOR"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento: ");

        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }

    }

    static void selecaoCandidatos(){
        String[] candidatos = {"FELIPE","MARCIA","BILL","AUGUSTO","MONICA","MIQUELLA","DANIELA","JORGE","BEATRIZ","VITOR"};
        int candidatosSelcionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelcionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if(salarioBase >=salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga" );
                candidatosSelcionados++;

            }
            candidatosAtual++;

        }
        
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1900, 2200);
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
