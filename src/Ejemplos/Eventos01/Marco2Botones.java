package Ejemplos.Eventos01;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Marco2Botones {

	public static void main(String[] args) {
		Marco2Botones_ n = new Marco2Botones_();
		n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		n.setVisible(true);

	}

}

/*marco 2 Botones*/

class Marco2Botones_ extends JFrame{
	JTextField texto;
	JButton botonHola;
	JButton botonAdios;
	
	public Marco2Botones_() {
		setTitle("Marco 2 Botones");
		setBounds (600, 350, 600, 300);
		
		Lamina2Botones_ lamina = new Lamina2Botones_();
		FlowLayout disposicion = new FlowLayout(FlowLayout.CENTER, 5,5);
		lamina.setLayout(disposicion);
		add(lamina);
		
		
	}
}

class Lamina2Botones_ extends JPanel {
	
	JButton botonHola;
	JButton botonAdios;
	JTextField texto;
	
	public Lamina2Botones_ () {
		botonHola=new JButton("Saludar");
		botonHola.setSize(100, 25);
		botonHola.setLocation(50, 25);
		add(botonHola);
		
		botonAdios=new JButton("Despedir");
		botonAdios.setSize(100, 25);
		botonAdios.setLocation(50, 25);
		add(botonAdios);
		
		texto = new JTextField();
		texto.setPreferredSize(new Dimension(200,24));
		texto.setSize(100, 250);
		texto.setLocation(25,50);
		add(texto);
		
		EvnetoBotonHola h = new EvnetoBotonHola();
		botonHola.addActionListener(h);
		
		EventoBotonAdios g = new EventoBotonAdios();
		botonAdios.addActionListener(g);
		
		
		
	}

	/*clase interna asociada al boton hola*/
	class EvnetoBotonHola  implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			texto.setText("Hola caracola");
			
		}
		//este constructor no hay que hacerlo
		
	}
	
	class EventoBotonAdios implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			texto.setText("Adios Camaleon");
			
		}
		
	}
}