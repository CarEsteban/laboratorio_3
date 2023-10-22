/**
 * La clase abstracta Producto es una base para representar productos en la tienda.
 */
public abstract class Producto {
    int ID; // Identificador único del producto
    int cant_disponibles; // Cantidad de productos disponibles en inventario
    int cant_vendidos; // Cantidad de productos vendidos
    int precio; // Precio unitario del producto
    double comision; // Comisión aplicada al producto
    String nombre; // Nombre del producto
    String pais; // País de origen del producto
    String categoria; // Categoría del producto
    boolean estado; // Estado del producto

    /**
     * Constructor de la clase Producto.
     * 
     * @param iD             El identificador único del producto.
     * @param cant_disponibles La cantidad de productos disponibles en inventario.
     * @param precio         El precio unitario del producto.
     * @param comision       La comisión aplicada al producto.
     * @param nombre         El nombre del producto.
     */
    public Producto(int iD, int cant_disponibles, int precio, double comision, String nombre) {
        this.ID = iD;
        this.cant_disponibles = cant_disponibles;
        this.precio = precio;
        this.comision = comision;
        this.nombre = nombre;
        estado = true;
    }

    /**
     * Establece el estado del producto.
     * 
     * @param estado El estado del producto.
     */
    public abstract void setEstado(boolean estado);

    /**
     * Establece la cantidad de productos vendidos.
     * 
     * @param cant_vendidos La cantidad de productos vendidos.
     */
    public abstract void setCant_vendidos(int cant_vendidos);

    /**
     * Obtiene el identificador único del producto.
     * 
     * @return El identificador único del producto.
     */
    public abstract int getID();

    /**
     * Obtiene el nombre del producto.
     * 
     * @return El nombre del producto.
     */
    public abstract String getNombre();

    /**
     * Obtiene la cantidad de productos disponibles en inventario.
     * 
     * @return La cantidad de productos disponibles.
     */
    public abstract int getDisponibles();

    /**
     * Obtiene la cantidad de productos vendidos.
     * 
     * @return La cantidad de productos vendidos.
     */
    public abstract int getVendidos();

    /**
     * Obtiene el estado del producto.
     * 
     * @return El estado del producto.
     */
    public abstract String getEstado();

    /**
     * Obtiene el precio unitario del producto.
     * 
     * @return El precio unitario del producto.
     */
    public abstract int getPrecio();

    /**
     * Obtiene la comisión aplicada al producto.
     * 
     * @return La comisión aplicada al producto.
     */
    public abstract double getComision();

    /**
     * Obtiene la categoría del producto.
     * 
     * @return La categoría del producto.
     */
    public abstract String getCategoria();

    /**
     * Genera una representación en cadena del objeto Producto.
     * 
     * @return Una cadena que contiene los atributos del producto.
     */
    public String toString() {
        return "ID: " + ID + ", Nombre: " + nombre + ", País: " + pais + ", Categoría: " + categoria
                + ", Cantidad Disponibles: " + cant_disponibles + ", Cantidad Vendidos: " + cant_vendidos
                + ", Precio: " + precio + ", Comisión: " + comision + ", Estado: " + estado;
    }
}
