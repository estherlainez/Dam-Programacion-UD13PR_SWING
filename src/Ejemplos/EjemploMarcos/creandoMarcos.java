package Ejemplos.EjemploMarcos;
import javax.swing.JFrame;
public class creandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		miMarco marco1= new miMarco();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*(0) DO_NOTHING_ON_CLOSE: No hacer nada cuando se cierra la ventana. 
		 *(1) HIDE_ON_CLOSE: (por defecto) Esconde la ventana cuando el usuario la cierra, pero la deja disponible. 		
		 *(2) DISPOSE_ON_CLOSE: Destruye la ventana cuando se cierra.
		 *(3) EXIT_ON_CLOSE: Finaliza la aplicación cuando se cierra la ventana.
		 */

	}

}
/**
 * Creamos la clase marco que hereda de JFrame
 */
class miMarco extends JFrame{//como hereda puedo usar todos los metodos
	
	public miMarco() {
		/*cuando creamos un marco, se crea con las siguientes caracteristicas:
		 *  tamaño ancho y largo: 0,0, por tanto, tenemos que modificar el tamaño
		 *  Se crea el atributo visible=false, por tanto lo tenemos que cambiar.	 
		 */
		setVisible(true);
		
		setSize(500,300);//cambiamos el tamaño con este metodo.
		setLocation(100,150);//cambiamos la posicion de creacion
		setBounds(400,300,800,600);//posX, posY,width,height
		
		setResizable(true);//no permite maximizar ni cambiar el tamaño
		setExtendedState(JFrame.MAXIMIZED_BOTH);//el marco se abre a pantalla completa
		
		//Para cambiar el titulo de la ventana
		setTitle("Mi Primera Ventana");
	}
		
	
}
