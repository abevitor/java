public class Geral {

    public double tamanhoMedio(GettersSet a) {
        double resultado = 0;  

        if (a.getGen() != null && a.getGen().equalsIgnoreCase("m")) {
        
            resultado = (a.getTamanhoPai() + a.getTamanhoMae() + 13) / 2; 
        }
        else if (a.getGen() != null && a.getGen().equalsIgnoreCase("f")) {
            
            resultado = (a.getTamanhoPai() + a.getTamanhoMae() - 13) / 2;
        } else {
            
            System.out.println("Gênero inválido ou não informado.");
            resultado = 0; 
        }


        return resultado;  
    }


    public void printDetalhes(GettersSet a) {
        System.out.println("Nome: " + a.getName());
        System.out.println("Idade: " + a.getAge());
        System.out.println("Gênero: " + a.getGen());
        System.out.println("Tamanho: " + a.getTamanho());
        System.out.println("Tamanho do pai: " + a.getTamanhoPai());
        System.out.println("Tamanho da mãe: " + a.getTamanhoMae());
        
        // Chama o método tamanhoMedio e imprime o resultado do cálculo
        double tamanhoMedio = tamanhoMedio(a);
        System.out.println("Tamanho Médio Calculado: " + tamanhoMedio);
    }

}
