package frsf.isi.died.app;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App {

	private void armarApp() {
		JFrame ventana=new JFrame("Gestor Camiones");
		JPanel botones=new JPanel();
		ventana.setSize(300, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField texto=new JTextField(10);
		JButton boton1 = new JButton("Apreta aca");
		boton1.setSize(new Dimension(100,20));
		boton1.setMaximumSize(new Dimension(100,20));
		boton1.setPreferredSize(new Dimension(100,20));
		JLabel etiqueta=new JLabel("Pone tu nombre");
		
		botones.add(etiqueta);
		botones.add(texto);
		botones.add(boton1);
		
		
		ventana.setContentPane(botones);
		ventana.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
	
		App aplicacion = new App();
		
		aplicacion.armarApp();
		

	}
}
	
