import java.util.Scanner;

public class FormatarData {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o dia/mes/ano");
		String receba = scanner.nextLine();
		scanner.close();
		
		formatDataSubString(receba);
		formatarData(receba);
	}

	private static void formatDataSubString(String receba) {
		String ano = receba.substring(0,4);
		String dia = receba.substring(5,7);
		String mes = receba.substring(8);
		
		System.out.println(dia + "/" + mes + "/" + ano);
	}
	
	private static void formatarData(String receba) {
		String [] dataBr = receba.split("/");
		System.out.println(dataBr[2] + "/" + dataBr[1] + "/" + dataBr[0]);
	}

}
