package controlador;

import java.awt.Toolkit;

public class DimensionesPantalla {
	
	private final int X, Y;
	private int x, y, tamanioLetra;
	
	public DimensionesPantalla() {

		X = Toolkit.getDefaultToolkit().getScreenSize().width;
		Y = Toolkit.getDefaultToolkit().getScreenSize().height;
		
		x = 0;
		y = 0;
		
		tamanioLetra = 0;
		
	}
	
	public final int DX(float porcentaje) {
		
		float tasa = porcentaje / 100;
		
		x = (int) Math.ceil(X * tasa);
		return x;
	}
	
	public final int DY(float porcentaje) {
		
		float tasa = porcentaje / 100;
		
		y = (int) Math.round(Y * tasa);
		
		return y;
	}
	
	
	public final int tamanioLetra(float tamanioEquivalente) {
		tamanioLetra = (int) Math.round(X * (tamanioEquivalente / 1000));
		return tamanioLetra;
	}
	
}
