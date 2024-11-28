public class MetodosLivros {
    private int quantidade = 20;
    private int totalEstoque;
    private double precoEstoque;

    public void AtualizarEstoque(int quantidade) {

        for(int i = 0; i > quantidade ; i++){

            System.out.println("Adicionando novos livros na estante! Total de livros a serem adicionados:" + quantidade);

        }

    }

    public void EstoqueAtualizado(int quantidade, GetSetLivros a) {

         totalEstoque = quantidade + a.getEstoque();

        System.out.println("O total de livros do autor: " + a.getAutor() + " é de: " + totalEstoque);

    }

    public void calcularValorTotal(int totalEstoque, GetSetLivros a) {

        precoEstoque = totalEstoque * a.getPreco();

        System.out.println("O preço total do estoque é de: " + precoEstoque + "R$");

    }

    public void informacoes(GetSetLivros a, int totalEstoque, int quantidade,  double precoEstoque) {

        System.out.println("O nome do livro é: " + a.getLivro());
        System.out.println("o Nome do autor é: " + a.getAutor());
        System.out.println("O ano de publicação é de: " + a.getAnoPub());
        System.out.println("O preço do livro é de: " + a.getPreco() + " R$.");
        System.out.println("Existem " + a.getEstoque() + " no estoque."); 
        System.out.println("A quantidade adicionada essa semana ao estoque foi de: " + quantidade);
        System.out.println("O total do estoque é de: " + totalEstoque + " livros");
        System.out.println("O preço total do estoque é de: " + precoEstoque + " R$");


    }

}
