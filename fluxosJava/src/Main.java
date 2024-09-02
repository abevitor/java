
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;


public class Main {
	static FileReader fi; 
	static BufferedReader bi;
	static FileWriter fw;
	static BufferedWriter bw;
	static final String RECEBACARACA= "C:\\Users\\Vitor\\Desktop\\recebacaraca.txt";
	static final String RECEBACARACAFINAL = "C:\\Users\\Vitor\\Desktop\\recebacaracafinal.txt";
	
	
	public static void main(String[] args) throws IOException {
		try {
			fi = new FileReader(RECEBACARACA);
			bi = new BufferedReader(fi);
			fw = new FileWriter(RECEBACARACAFINAL);
			bw = new BufferedWriter(fw);
		}catch(FileNotFoundException e) {
			e.printStackTrace();	
		}
		
	    lendoArquivos();
		escrevendoArquivos();
	}
	
	private static void escrevendoArquivos() {
		try {
			bw.write("RECEBA SEU DOCE CARACA BORA BILL");
			bw.flush();
		}catch(IOException e) {
			e.printStackTrace();
			
		}
	}
	
	private static void lendoArquivos() {
		try {
			String linha = "";
			while(true) {
				linha = bi.readLine();
				if(linha == null) break;
				System.out.println(linha);
			}
			System.out.println(bi.readLine());
		}catch(IOException e) {
			e.printStackTrace();
			
		}
	}

	
}
