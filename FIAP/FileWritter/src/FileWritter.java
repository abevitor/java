import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileWritter {
    public static void main(String[] args) {
        String nomeDoArquivo = "estoque.csv";
        String diretorio = System.getProperty("user.home") + "\\Downloads";
        String caminho = diretorio + "\\" + nomeDoArquivo;

        List<String> conteudo = new ArrayList<>();
        conteudo.add("Produto; Quantidade; Unidade de medida; Valor da Unidade;");
        conteudo.add("Pera; 200; pct; R$ 5,40;");
        conteudo.add("Calabreso; 400; cx; R$ 6,50;");
        conteudo.add("Abacaxi; 280; un; R$ 5,00;");

        gravarEstoque(nomeDoArquivo, caminho, conteudo);

    }

    private static void gravarEstoque(String nomeDoArquivo, String caminho, List<String> conteudo) {
        FileWriter stream;
        PrintWriter print;

        try {
            stream = new FileWriter(caminho);
            print = new PrintWriter(stream);

            for (String linha : conteudo) {
                print.println(linha);
            }

            print.close();
            stream.close();

            System.out.println("O arquivo " + nomeDoArquivo + " foi salvo em " + caminho);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
