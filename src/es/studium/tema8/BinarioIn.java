package es.studium.tema8;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BinarioIn {

	public BinarioIn()
	{
		try
		{
			FileInputStream fos = new FileInputStream("uno.bin");
			BufferedInputStream bos = new BufferedInputStream (fos);
			//Necesitamos un objeto de la clase DataOutputStream
			DataInputStream salidaB = new DataInputStream(bos);
			//Meter un double en el archivo
			System.out.println(salidaB.readInt());
			salidaB.close();
			bos.close();
			fos.close();
		}
		catch(IOException i)
		{
			System.out.println("Se produjo un error de Archivo");
		}
		
	}
	public static void main(String[] args)
	{
		new BinarioIn();
	}

}
