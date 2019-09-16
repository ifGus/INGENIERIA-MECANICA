package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.*;
//import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
//import javax.xml.crypto.Data;

import controlador.DimensionesPantalla;
public class Plantilla extends JFrame {
	
	private final JPanel FONDO, PANEL_SUPERIOR, PANEL_INFERIOR, PANEL_IZQUIERDO, PANEL_DERECHO, PANEL_CENTRAL;
	private DimensionesPantalla dimPan;
	private JLabel BANNER;
	
	/**
	 * El constructor establece todo el disenio
	 * @param titulo
	 * @param tituloBarra
	 */
	public Plantilla(String titulo, String tituloBarra) {
		
		//INICIALIZACION
		FONDO = new JPanel();
		PANEL_SUPERIOR = new JPanel();
		PANEL_INFERIOR = new JPanel();
		PANEL_IZQUIERDO = new JPanel();
		PANEL_CENTRAL = new JPanel();
		PANEL_DERECHO = new JPanel();
		BANNER = new JLabel();
				
		dimPan = new DimensionesPantalla();
		
		
		//CONFIGURACION
		this.setSize(new Dimension(dimPan.DX(100), dimPan.DY(100)));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle(tituloBarra);
		
		FONDO.setLayout(new BorderLayout());
		FONDO.setBackground(Color.DARK_GRAY);
		
		PANEL_SUPERIOR.setBackground(new Color(9, 11, 45));
		PANEL_IZQUIERDO.setBackground(Color.DARK_GRAY);
		PANEL_DERECHO.setBackground(Color.DARK_GRAY);
		PANEL_INFERIOR.setBackground(new Color(80, 115, 40));
		PANEL_CENTRAL.setBackground(new Color(80,125,40));
		
		PANEL_SUPERIOR.setLayout(new GridLayout(1,4));
		PANEL_IZQUIERDO.setLayout(new GridLayout(10,2,dimPan.DX(1),dimPan.DY(1)));
		PANEL_IZQUIERDO.setBorder(new TitledBorder(new EtchedBorder(), "Menú"));
		PANEL_DERECHO.setBorder(new TitledBorder(new EtchedBorder(), "Información"));

		BANNER = new JLabel();
		BANNER.setSize(dimPan.DX(50), dimPan.DY(15));
	    ImageIcon img = new ImageIcon("src/img/banner2.jpg");
	    Icon scala = new ImageIcon(img.getImage().getScaledInstance(BANNER.getWidth(), BANNER.getHeight(), Image.SCALE_DEFAULT));
	    BANNER.setIcon(scala);
	    
	    
		
		//AGREGAR ELEMENTOS
		this.getContentPane().add(FONDO);
		FONDO.add(PANEL_SUPERIOR, BorderLayout.NORTH);
		FONDO.add(PANEL_INFERIOR, BorderLayout.SOUTH);
		FONDO.add(PANEL_IZQUIERDO, BorderLayout.WEST);
		FONDO.add(PANEL_DERECHO, BorderLayout.EAST);
		FONDO.add(PANEL_CENTRAL, BorderLayout.CENTER);
		
		PANEL_SUPERIOR.add(BANNER);
		JLabel titulo2 = texto("<html>_________________________<br>"+titulo+"</html>");
		titulo2.setFont(new Font("Calibri", 0, dimPan.tamanioLetra(20)));
		PANEL_SUPERIOR.add(titulo2);
		JLabel titulo1 = texto("INGENIERIA MECANICA ", dimPan.tamanioLetra(35));
		titulo1.setHorizontalAlignment(SwingConstants.RIGHT);
		titulo1.setBounds(0, 0, dimPan.DX(50), dimPan.DY(8));
		BANNER.add(titulo1);
		
		PANEL_INFERIOR.add(new JLabel("<html><center>Ingeniería de Sistemas - Ingeniería Mecánica ©<br>UMSS - 2019</center></html>"));
		
		PANEL_IZQUIERDO.add(new JButton("BOTON 1"));
		PANEL_IZQUIERDO.add(new JButton("BOTON 2"));
		
		PANEL_DERECHO.add(texto("<html><br>DETALLE DEL ELEMENTO</html>", dimPan.tamanioLetra(8F)));
	}
	
	/**
	 * Dibuja el texto
	 * @param texto
	 * @param color sobrecargado
	 * @param tamanioLetra sobrecargado
	 * @return
	 */
	public JLabel texto(String texto, int tamanioLetra) {
		
		JLabel label = new JLabel(texto);
		label.setForeground(Color.white);
		label.setFont(new Font("Andale mono", 1, tamanioLetra));
		
		return label;
		
	}
	
	public JLabel texto(String texto) {
		
		JLabel label = new JLabel(texto);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Andale mono", 1, dimPan.tamanioLetra(18)));
		
		return label;
		
	}
	
	public JLabel texto(String texto, int tamanioLetra, Color color) {
		
		JLabel label = new JLabel(texto);
		label.setForeground(color);
		label.setFont(new Font("Andale mono", 1, tamanioLetra));
		
		return label;
		
	}

}
