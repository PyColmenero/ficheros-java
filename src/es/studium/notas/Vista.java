package es.studium.notas;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.TextField;

public class Vista {

	Frame v = new Frame("nose");
	MenuBar menuBar = new MenuBar();
	Menu menu1 = new Menu();
	Menu menu2 = new Menu();
	
	MenuItem mItem1 = new MenuItem("");
	MenuItem mItem2 = new MenuItem("");
	MenuItem mItem3 = new MenuItem("");
	MenuItem mItem4 = new MenuItem("");
	MenuItem mItem5 = new MenuItem("");
	MenuItem mItem6 = new MenuItem("");
	MenuItem mItem7 = new MenuItem("");
	
	TextArea tx = new TextArea();
	Label lbl_data = new Label();
	
	public Vista() {
		
		v.setLayout( new FlowLayout() );
		
		//v.add(menuBar);
		menuBar.add(menu1);
			menu1.add(mItem1);
			menu1.add(mItem2);
			menu1.add(mItem3);
			menu1.add(mItem4);
		menuBar.add(menu1);
			menu1.add(mItem4);
			menu1.add(mItem5);
			menu1.add(mItem6);
			menu1.add(mItem7);
			
		v.add(tx);
		v.add(lbl_data);
		
		v.setSize(264, 104);
		v.setResizable(false);
		v.setLocationRelativeTo(null);
		v.setVisible(true);
		
	}
	
	
	
}
