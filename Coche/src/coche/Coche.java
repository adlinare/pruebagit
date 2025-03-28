
package coche;

public class Coche {

    /**
     * Atributo nombre, para el modelo de coche
     */
	private String nombre;
	/**
	 * Atributo precio, para el precio de coche por unidad
	 */
    private double precio;
    /**
     * Atributo precioIVA, precio del coche incluyendo el IVA
     */
    private double precioIVA;
    /**
     * Atributo stock, numero de coches con los que contamos
     */
    private int stock;

    /**
     * Constructor vacio para incializar la instancia Coche
     */
    public Coche ()
    {
    }
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    // coche
    
    /**
     * Constructor con el que inicializamos un vehiculo con todos los parámetros
     * @param nom, nombre del vehiculo
     * @param precio, valor del precio sin IVA
     * @param stock, numero de vehiculos con los que contamos
     */
   
    public Coche (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
   // Método para asignar el nombre del coche
    /**
     * Método para asignarle el nombre al coche (setter)
     * @param nom, nombre del vehiculo
     */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
    // Método que me devuelve el nombre del coche
    /**
     * Método que devuelve el nombre del vehiculo
     * @return nombre, nombre del vehiculo tipo String
     */
    public String obtenerNombre()
    {
        return nombre;
    }

    // Método que me devuelve el stock de coches disponible en cada momento
    /**
     * Método para saber el número de coches con los que disponemos
     * @return stock, número de vehiculos tipo int
     */
     public int obtenerStock ()
    {
        return stock;
    }

    /* Método para comprar coches. Modifica el stock.
     * Este método va a ser probado con Junit
     */
     
     /**
      * Método para comprar un coche
      * @param cantidad, int cantidad de coches que se compran
      * @throws Exception, error no se pueden comprar numeros negativos
      */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de coches");
        stock = stock + cantidad;
    }

    /**
     * Método para vender los vehiculos que tenemos en el stock
     * @param cantidad, cantidad de vehiculos tipo int
     * @throws Exception, error vender cantidades negativas no está permitido
     */
    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de coches");
        if (obtenerStock()< cantidad)
            throw new Exception ("No se hay suficientes coches para vender");
        stock = stock - cantidad;
    }
    
}  
   
    

