package br.com.caelum.fj11.cap15.testeio;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TestaSaida {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("saida.txt",true);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("caelum");
		bw.newLine();
		
		bw.close();
	}

}
