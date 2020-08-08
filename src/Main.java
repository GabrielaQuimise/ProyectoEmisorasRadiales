
public class Main {

	public static void main(String[] args) {
		
		EmisoraFM ef1 = new EmisoraFM(80.0);
		EmisoraFM ef2 = new EmisoraFM(108.0);
		EmisoraFM ef3 = new EmisoraFM(90.5);
		
		ef1.encender();
		ef1.avanzarCanal();
		ef1.display();
		
		ef2.encender();
		ef2.avanzarCanal();
		ef2.apagar();   //no lee el siguiente proceso porque está apagado
		ef2.avanzarCanal();
		ef2.display();
		
		ef3.encender();
		ef3.avanzarCanal();
		ef3.display();
}
}