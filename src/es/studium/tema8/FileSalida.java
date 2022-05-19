package es.studium.tema8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileSalida {

	public FileSalida(String file, String data, boolean sobrescribir) {
		
		try {
			FileWriter file_writer = new FileWriter(file, sobrescribir);
			BufferedWriter buffer = new BufferedWriter(file_writer);
			PrintWriter printer = new PrintWriter(buffer);
			
			printer.println(data);
			
			
			printer.close();
			buffer.close();
			file_writer.close();
			
			System.out.println("Archivo actualizado.");
			
			
		} catch(IOException i){
			System.out.println("Error_01: " + i.getMessage());
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new FileSalida("archivo.txt", "ola", false);
		
	}

}
