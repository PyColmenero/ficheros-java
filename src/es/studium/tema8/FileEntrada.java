package es.studium.tema8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileEntrada {

	public FileEntrada() {
		
		try {
			
			FileReader file_reader = new FileReader("archivo.txt");
			BufferedReader buffer = new BufferedReader(file_reader);
			
			String fila;
			
			//Bucle para sacar la información del archivo
			while(( fila = buffer.readLine() ) != null)
			{
				System.out.println(fila);
			}
			
			
			buffer.close();
			file_reader.close();
			
			
			System.out.println("Archivo actualizado.");
			
			
		} catch(IOException i){
			System.out.println("Error_01: " + i.getMessage());
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new FileEntrada();
		
	}


}
