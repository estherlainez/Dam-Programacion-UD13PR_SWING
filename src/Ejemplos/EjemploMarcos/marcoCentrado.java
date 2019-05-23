package Ejemplos.EjemploMarcos;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
public class marcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		miMarcoCentrado marco2 = new miMarcoCentrado();

	}

}

class miMarcoCentrado extends JFrame{
	public miMarcoCentrado() {
		
		setTitle("Marco Centrado");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Toolkit miPantalla= Toolkit.getDefaultToolkit();
		
		Dimension tamPantalla= miPantalla.getScreenSize();
		
		int anchuraPantalla=tamPantalla.width;
		int alturaPantalla=tamPantalla.height;
		
		setSize(anchuraPantalla/2, alturaPantalla/2);
		
		setLocation(anchuraPantalla/4,alturaPantalla/4);
		
		//cambiamos el icono de la ventana
		Image miIcono= miPantalla.getImage("src/Ejemplos/EjemploMarcos/graficos/icono.png");
		setIconImage(miIcono);
	
		
		
	}
}