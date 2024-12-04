
public class Main {
    public static void main(String[] args) throws Exception {

        GetSetLivros a = new GetSetLivros();
        MetodosLivros b = new MetodosLivros();

        a.setAutor("Machado de Assis98");
        a.setAnoPub(1990);
        a.setEstoque(100);
        a.setPreco(40.00);
        a.setLivro("Conheça a história do machado98 narrado pelo Bora bill! EDIÇÃO ILIMITADA!!!!!");

        b.AtualizarEstoque(20);

        b.EstoqueAtualizado(20, a);
        
        b.calcularValorTotal(120, a);

        b.informacoes(a, 120, 20, 4800);
 
    }
}
