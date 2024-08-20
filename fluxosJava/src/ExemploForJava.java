public class ExemploForJava {
    public static void main(String[] args) {
        String alunos [] = {"FELIPE","JONAS","JULIA","MARCOS"};

        //for comum

        for(int i=0; i<alunos.length; i++){
            System.out.println(" O aluno no indice x= "+ i + " é " + alunos[i]);
        }

        //for each

        for(String aluno: alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }

}
