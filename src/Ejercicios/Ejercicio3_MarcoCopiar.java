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


		public class Ejercicio3_MarcoCopiar {

			public static void main(String[] args) {
				Marco e= new Marco();

			}

		}
		class Marco2 extends JFrame {
			  JLabel texto;    
			  JButton boton;   
			public Marco2() {
				setTitle("Ventana de Eventos");
				setSize(700,400);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setVisible(true);
				Lamina2 la= new Lamina2();
				add(la);
				pack();
				
			}
			
			
	
		}

		class Lamina2 extends JPanel implements ActionListener{

			JButton boton = new JButton("Saludame");
			JTextField texto= new JTextField(23);
			JTextField textoPegado= new JTextField(50);
			
			public Lamina2() {
				texto.setBounds(100,25,25,25);
				add(boton);
				add(texto);
				add(textoPegado);
				
				boton.addActionListener(this);
				
			}
			@Override
			public void actionPerformed(ActionEvent e) {
				String t=texto.getText();
				//resultado.setText(t);
				
			}
			
			
	}