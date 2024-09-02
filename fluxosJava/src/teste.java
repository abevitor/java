import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class teste {

    public static void main(String[] args) {
        String[] numeros = {"receba","receba2","receba3","receba4"};

        // Converter o array para uma lista
        List<String> listaNumeros = Arrays.asList(numeros);

        // Embaralhar a lista
        Collections.shuffle(listaNumeros);

        // Se precisar de volta como array
        String[] numerosEmbaralhados = listaNumeros.toArray(new String[0]);

        // Exibir o array embaralhado
        System.out.println(Arrays.toString(numerosEmbaralhados));
        
        
    }

}
