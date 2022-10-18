package futbol;

public class Jugador extends Futbolista{

	public short golesMarcados;
	public byte dorsal;
	
	
	
	
	// Base
	public Jugador(){
		super();
	}

	//Parametrico
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal){
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;		
	}
	
    // Impresion
	public static void main(String args[]) {
				System.out.println("El futbolista");	
	}
	// Getters
	public short getGolesMarcados(){
		return this.golesMarcados;
	}
	public byte getDorsal(){
		return this.dorsal;
	}
	// interfaz comparable
	@Override
	public int compareTo(Futbolista arg0) {
		int valor = 0;
		valor = ( this.getEdad() - arg0.getEdad() );
		return Math.abs(valor);
	}			
}

