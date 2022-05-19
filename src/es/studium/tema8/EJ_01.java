package es.studium.tema8;

import java.util.Scanner;

public class EJ_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyb = new Scanner(System.in);
		
		String data = "";
		data = keyb.nextLine();
		
		new FileSalida("fich1.txt", data, false);
		
		keyb.close();
		System.out.println(data);
	}

}
