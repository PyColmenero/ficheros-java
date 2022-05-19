package es.studium.tema8;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binario {

	public Binario()
	{
		int i = 434;
		try
		{
			FileOutputStream fos = new FileOutputStream("uno.bin");
			BufferedOutputStream bos = new BufferedOutputStream (fos);
			//Necesitamos un objeto de la clase DataOutputStream
			DataOutputStream salidaB = new DataOutputStream(bos);
			//Meter un double en el archivo
			salidaB.writeInt(i);
			salidaB.close();
			bos.close();
			fos.close();
			System.out.println("¡Archivo creado correctamente!");
		}
		catch(IOException e)
		{
			System.out.println("Se produjo un error de Archivo");
		}
		
	}
	public static void main(String[] args)
	{
		new Binario();
	}

}
