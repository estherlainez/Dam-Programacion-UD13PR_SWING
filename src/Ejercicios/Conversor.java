package Ejercicios;
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




public class Conversor {

	public static void main(String[] args) {
		MarcoConversor n = new MarcoConversor();
		n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		n.setVisible(true);

	}

}
class MarcoConversor extends JFrame{
	JTextField texto;
	JButton botonHola;
	JButton botonAdios;
	
	public MarcoConversor() {
		setTitle("Conversor");
		setBounds (600, 350, 600, 300);
		
		LaminaConversor lamina = new LaminaConversor();
		FlowLayout disposicion = new FlowLayout(FlowLayout.CENTER, 5,5);
		lamina.setLayout(disposicion);
		add(lamina);
		
		
	}
}


class LaminaConversor extends JPanel {
	
	JButton botonEuroDolar;
	JButton botonDolarEuro;
	JButton botonClear;
	JTextField texto;
	
	public LaminaConversor() {
		botonEuroDolar=new JButton("EuroDolar");
		botonEuroDolar.setSize(100, 25);
		botonEuroDolar.setLocation(50, 25);
		add(botonEuroDolar);
		
		botonDolarEuro=new JButton("DolarEuro");
		botonDolarEuro.setSize(100, 25);
		botonDolarEuro.setLocation(50, 25);
		add(botonDolarEuro);
		
		botonClear=new JButton("C");
		botonClear.setSize(100, 25);
		botonClear.setLocation(50, 25);
		add(botonClear);
		
		texto = new JTextField();
		texto.setPreferredSize(new Dimension(200,24));
		texto.setSize(100, 250);
		texto.setLocation(25,50);
		add(texto);
	
		EventoBotonEuroDolar h = new EventoBotonEuroDolar();
		botonEuroDolar.addActionListener(h);
		
		EventoBotonDolarEuro g = new EventoBotonDolarEuro();
		botonDolarEuro.addActionListener(g);
		
		EventoBotonClear t = new EventoBotonClear();
		botonClear.addActionListener(t);
	}
	
	
	
	class EventoBotonClear  implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			texto.setText("");
			
		}
		
		
	}
	
	class EventoBotonEuroDolar  implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String cantidad=texto.getText();
			double c=Double.parseDouble(cantidad);
			c=c*1.12;
			cantidad=""+c;
			texto.setText(cantidad);
			
		}
		
		
	}
	
	
	
	class EventoBotonDolarEuro implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String cantidad=texto.getText();
			double c=Double.parseDouble(cantidad);
			c=c*0.89;
			cantidad=""+c;
			texto.setText(cantidad);
		}
		
	}
}