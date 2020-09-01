package taller3.televisores;

public class TV {
	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	static int numTV;
	
	public TV (Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	
	public static int getNumTV () {
		return numTV;
	}
	
	public Marca getMarca () {
	    return marca;
	}
	  
	public void setMarca (Marca marca) {
		this.marca = marca;
	}
	
	public Control getControl () {
	    return control;
	}
	  
	public void setControl (Control control) {
		this.control = control;
	}
	
	public int getPrecio () {
	    return precio;
	}
	  
	public void setPrecio (int precio) {
		this.precio = precio;
	}
	
	public int getVolumen () {
	    return volumen;
	}
	  
	public void setVolumen (int volumen) {
		this.volumen = volumen;
	}
	
	public int getCanal () {
	    return canal;
	}
	  
	public void setCanal (int canal) {
		this.canal = canal;
	}
	
	public void turnOn () {
		estado = true;
	}
	
	public void turnOff () {
		estado = false;
	}
	
	public boolean getEstado () {
		return estado;
	}
	
	public void canalUp () {
		if (estado) {
			if (canal < 120) {
				canal++;
			}
		}
	}
	
	public void canalDown () {
		if (estado) {
			if (canal > 1) {
				canal--;
			} 
		}
	}
	
	public void volumenUp () {
		if (estado) {
			if (volumen < 7) {
				volumen++;
			} 
		}
	}
	
	public void volumenDown () {
		if (estado) {
			if (volumen > 0) {
				volumen--;
			} 
		}
	}
	
}