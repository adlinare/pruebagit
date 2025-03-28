
package coche;

/**
 *
 * @author Adrián Linares Utrera
 * @version 1.0 
 * Este proyecto es el ejemplo de implementación de instancias del
 *          Objeto Coche para un consecionario, encontraremos métodos como
 *          obtener stock para saber
 */
public class Main {

	public static void main(String[] args) {
		
		/**
		 * Variable Coche que es para declarar instancias de Coche
		 */
		Coche miCoche;
		
		/**
		 *  Variable que alamcena el stock con el que contemos para poder mostrarlo
		 */
		int stockActual;
		
		/**
		 * Declaración de un coche mediante el constructor con todos los parámetros
		 */
		miCoche = new Coche("Opel", 12000, 500);
		try {
			System.out.println("Venta de Coches");
			miCoche.vender(300);
		} catch (Exception e) {
			System.out.print("Fallo al vender");
		}

		try {
			System.out.println("Compra de Coches");
			miCoche.comprar(500);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}
		stockActual = miCoche.obtenerStock();
		System.out.println("El stock actual es" + stockActual);
	}

}
