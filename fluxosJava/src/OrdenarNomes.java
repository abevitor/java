package aula4;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class  BrasileiraoTabela {
	static FileReader fi;
	static BufferedReader br;
	static FileWriter fw;
	static BufferedWriter bw;
	static final String ARQ_ENTRADA = "C:\\Users\\Aluno.LAPTOP-EH2MO30N\\Desktop\\RECEBACARACA.txt";
	static final String ARQ_SAIDA = "C:\\Users\\Aluno.LAPTOP-EH2MO30N\\Desktop\\RECEBACARACAFINAL.txt";

	public static void main(String[] args) {
		try {
			fi = new FileReader(ARQ_ENTRADA);
			br = new BufferedReader(fi);
			fw = new FileWriter(ARQ_SAIDA);
			bw = new BufferedWriter(fw);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ordenarNomes();
	}

	private static void ordenarNomes() {
		
		ArrayList<String>  nomes = new ArrayList();

		try {
			String linha = "";
			while(true) {
				linha = br.readLine();
				if(linha == null) break;
				linha = linha.toUpperCase();
				nomes.add(linha);
			}
			Collections.sort(nomes);
			for(String nome : nomes) {
				bw.write(nome + "\n");
			}
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	}
