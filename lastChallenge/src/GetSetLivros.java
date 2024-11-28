public class GetSetLivros {
    private String livro;
    private String autorLivro;
    private int anoPub;
    private double preco;
    private int estoque;

    public void setLivro(String livro){

        this.livro = livro;

    }

    public void setAutor(String autorLivro) {

        this.autorLivro = autorLivro;

    }

    public void setAnoPub(int anoPub) {

        this.anoPub = anoPub;

    }

    public void setPreco(double preco) {

        this.preco = preco;

    }

    public void setEstoque(int estoque) {

        this.estoque = estoque;


    }

    public String getLivro() {

        return livro;

    }

    public String getAutor() {

        return autorLivro;

    }

    public int getAnoPub() {

        return anoPub;

    }

    public double getPreco() {

        return preco;


    }

    public int getEstoque() {

        return estoque; 

    }


}
