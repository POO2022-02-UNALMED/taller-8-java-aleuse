package futbol;


public class Portero extends Futbolista{
    private static final String posicion = "Portero";
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad,  short golesRecibidos, byte dorsal){
        super(nombre, edad, posicion );
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    // Impresion
    public static void main(String args[]) {
		System.out.println("El futbolistaaa " );	
	}
    // Getters
    public short getGolesRecibidos() {
        return golesRecibidos;
    }
    public byte getDorsal(){
        return this.dorsal;
    }
    // Comparacion
    @Override
    public int compareTo(Futbolista arg0) {
        int valor = 0;

        valor = (this.getGolesRecibidos() - golesRecibidos);
    
        return Math.abs(valor);
    }
}
