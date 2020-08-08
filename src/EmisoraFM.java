
public class EmisoraFM {
	
	public boolean encendido;
	public double canal;
	
	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public double getCanal() {
		return canal;
	}

	public void setCanal(double canal) {
		this.canal = canal;
	}
	

	public void encender() {
		encendido = true;
	}
	
	public void apagar() {
		encendido = false;	
		System.out.println("La emisora se apagó");
		
	}
	
	//Constructor
	
	public EmisoraFM(double canal) {
		super();
		this.canal = canal;
	}

	public void avanzarCanal() {
		if(encendido && canal < 108 ) 
			canal = canal + 0.5;
			setCanal(canal);
		
		if (encendido && canal == 108) {
			canal = 80;
			setCanal(canal);
		}
	}
	
	public void disminuirCanal() {
		if(encendido && canal > 80 && canal <= 108) {
			canal = canal - 0.5;
			setCanal(canal);
		}
		if (encendido && canal == 80) {
			canal = 108;
			setCanal(canal);
			
		}
	}
	public void display() {
			System.out.println("Su frecuencia de radio es: " + canal);
	}
	
	
	
	
}
