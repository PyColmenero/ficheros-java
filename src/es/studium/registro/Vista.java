package es.studium.registro;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

public class Vista {

	Frame v = new Frame("nose");
	TextField tf = new TextField(25);
	
	Button btnMision = new Button("Misi�n");
	Button btnVision = new Button("Visi�n");
	Button btnValores = new Button("Valores");
	
	public Vista() {
		
		v.setLayout( new FlowLayout() );
		
		v.add(tf);
		v.add(btnMision);
		v.add(btnVision);
		v.add(btnValores);
		
		v.setSize(264, 104);
		v.setResizable(false);
		v.setLocationRelativeTo(null);
		v.setVisible(true);
		
	}
	
	
	
}
