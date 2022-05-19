package es.studium.registro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements ActionListener, WindowListener, ComponentListener {

	Vista vista;
	Modelo modelo;
	
	public Controlador(Vista vista, Modelo modelo) {
		this.vista = vista;
		this.modelo = modelo;
		
		this.vista.v.addWindowListener(this);
		this.vista.v.addComponentListener(this);
		this.vista.btnMision.addActionListener(this);
		this.vista.btnValores.addActionListener(this);
		this.vista.btnVision.addActionListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(vista.btnMision.equals(e.getSource())) {
			modelo.guardar(vista.tf.getText(), "Mision");
		}
		if(vista.btnVision.equals(e.getSource())) {
			modelo.guardar(vista.tf.getText(), "Vision");
		}
		if(vista.btnValores.equals(e.getSource())) {
			modelo.guardar(vista.tf.getText(), "Valores");
		}
			
	}

	@Override
	public void componentResized(ComponentEvent e) {}
	@Override
	public void componentMoved(ComponentEvent e) {}
	@Override
	public void componentShown(ComponentEvent e) {}
	@Override
	public void componentHidden(ComponentEvent e) {}
}
