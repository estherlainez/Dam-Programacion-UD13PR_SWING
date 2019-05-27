package Ejercicios;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.*;
import javax.swing.JFrame;


public class Ejercicio1_BotonAzul {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);

		System.out.println("Introduzca ancho del marco");
		int ancho=teclado.nextInt();
		
		System.out.println("Introduzca alto del marco");
		int alto=teclado.nextInt();
		System.out.println("Introduzca titulo de ventana");
		String titulo=teclado.nextLine();
		
		nuevoMarco marcoEsther = new nuevoMarco(ancho,alto,titulo);

	}
}




class nuevoMarco extends JFrame{
	
	public nuevoMarco(int ancho,int alto,String titulo) {
	
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(ancho,alto);
		
		
		setTitle(titulo);
		
		//setExtendedState(JFrame.MAXIMIZED_BOTH);

		
	}
	}