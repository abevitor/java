import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class tabelaBrasileirao {
	public static void main(String [] args) {

		String[] times = {"1SaoPaulo", "2Corinthians", "3Palmeiras", "4Santos"};
	    int[] gols = {0,1,2,3,4};
		 separarCodigoTime(times);
		 numeroGols(gols);
	}

	private static String separarCodigoTime(String[] times) {
		String time1 = times[0].substring(1);

		for(int i = 0; i < times.length; i++){
			String numeros = times[i].substring(0,1);
			String time = times[i].substring(1);
			//String number = times[i].substring(0,1);
			System.out.println(numeros + "-" + time);
		}
		
		
		return time1;
	}

	private static String[] numeroGols(int[] gols) {
		int[][] resultados = new int[4][2]; 

		for (int i = 0; i < 4; i++) {
			
			List<Integer> listaGols = Arrays.stream(gols)
											.boxed()
											.collect(Collectors.toList());
		
			Collections.shuffle(listaGols);
			
			int[] numerosEmbaralhados = {listaGols.get(0), listaGols.get(1)};
			resultados[i] = numerosEmbaralhados;

			String resultadoFormatado = Arrays.stream(numerosEmbaralhados)
			.mapToObj(String::valueOf)
			.collect(Collectors.joining(" "));
			
			System.out.println(resultadoFormatado);
			if (numerosEmbaralhados[0] > numerosEmbaralhados[1]) {
				System.out.println("Ganhou! +3");
			} else if (numerosEmbaralhados[0] < numerosEmbaralhados[1]){
				System.out.println("Perdeu");
			}else
			System.out.println("Empatou");

			
		}
	
		return null;
	}

}
