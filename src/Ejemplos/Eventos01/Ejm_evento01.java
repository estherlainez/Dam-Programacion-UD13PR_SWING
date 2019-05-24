package Ejemplos.Eventos01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ejm_evento01 {

	public static void main(String[] args) {
		MarcoE01 m= new MarcoE01();

	}

}

/*****calse miMarco *******/

class MarcoE01 extends JFrame{
	
	public MarcoE01() {
		setTitle("Mi primer Evento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(250,250,500,300);
		
		/*Engancho la lamina al marco*/
		LaminaE01 miLamina = new LaminaE01();
		add(miLamina);
	}
	
}

/*********clase miLamina**********/
/*Creamos la lamina que es un elemento donde podemos
 * colocar otros elementos par formar nuestra interfaz grafica*/

class LaminaE01 extends JPanel implements ActionListener{
	
//1.creamos los miembros de la clase, vamos a poner un boton
	JButton botonAzul = new JButton("Esther");
	
	
//2.crear el constructor
	public LaminaE01() {
		add(botonAzul);//Añadimos el elemento a la lamina	
		botonAzul.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//IMPLEMENTAMOS EL METODO EN EL OBJETO LISTENER
		setBackground(Color.BLUE);
		//setBackground(Color.GREEN);
		
	}
	
	
	
	
}