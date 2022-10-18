package futbol;

public abstract class Futbolista implements Comparable<Futbolista>{

	private static String nombre;
	private static int edad;
	private  static  String posicion;
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;

	}

	public Futbolista() {
    }

    // Impresion 
	public static void main(String args[]) {

		System.out.println("El futbolista " + nombre + " tiene " + edad + ", y juega de "+ posicion);	
	}
	
	//getters 
	public  String getNombre(){
		return nombre;
	}
	public  String getPosicion() {
		return posicion;
	}
	public  int getEdad() {
		return edad;
	}
	// Metodo jugarManos
	public boolean  jugarConLasManos(){
		return true;
		}
	
	// Metodo compare
	public boolean equals(Object a, Object b){
			return false;
		}
}

