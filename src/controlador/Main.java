package controlador;
import controlador.*;
import vista.Plantilla;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Plantilla p = new Plantilla("<html>SISTEMA DE REGISTRO Y <br>MANTENIMIENTO DE EQUIPOS <br>DE REFRIGERACION Y AIRE ACONDICIONADO</html>", 
//				"Ingenieria Mecanica - Registro y mantenimiento de equipos");
		Plantilla p =  new Plantilla("Centro de Refrigeración", "Registro - Mantenimiento");
		p.setVisible(true);
	}

}
