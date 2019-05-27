package Ejercicios;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


		public class Ejercicio2_MarcoSaludador {

			public static void main(String[] args) {
				Marco m= new Marco();

			}

		}
		class Marco extends JFrame {
			  JLabel texto;    
			  JButton boton;   
			public Marco() {
				setTitle("Ventana de Eventos");
				setSize(700,400);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setVisible(true);
				Lamina1 l= new Lamina1();
				add(l);
				
			}
			
			
	
		}

		class Lamina1 extends JPanel implements ActionListener{

			JButton boton = new JButton("Saludame");
			JTextField texto= new JTextField(50);
			JLabel resultado=new JLabel();
			
			public Lamina1() {
				texto.setBounds(100,25,25,25);
				texto.setSize(new Dimension (100,200));
				add(boton);
				add(texto);
				add(resultado);
				boton.addActionListener(this);
				
			}
			@Override
			public void actionPerformed(ActionEvent e) {/*
				//saludar con el nombre que introducimos
				String nombre=texto.getText();
				texto.setText("Hola "+ nombre);   */
				//para cambiar de dolares a euros
				String cantidad=texto.getText();
			
				double c=Double.parseDouble(cantidad)*0.89;
				texto.setVisible(false);
				String nombre=" "+c+"$";
				resultado.setText(nombre);
				
			}
			
		
		
		
		
		
		
	}