/**
 * La clase Dulce es una subclase de Producto que representa productos de la categoría "Dulce".
 */
public class Dulce extends Producto {
    boolean esDietetico; // Indica si el producto es dietético

    /**
     * Constructor de la clase Dulce.
     * 
     * @param iD             El identificador único del producto.
     * @param cant_disponibles La cantidad de productos disponibles en inventario.
     * @param precio         El precio unitario del producto.
     * @param comision       La comisión aplicada al producto.
     * @param nombre         El nombre del producto.
     * @param esDietetico    Indica si el producto es dietético.
     */
    public Dulce(int iD, int cant_disponibles, int precio, double comision, String nombre, boolean esDietetico) {
        super(iD, cant_disponibles, precio, comision, nombre);
        this.esDietetico = esDietetico;
        categoria = "Dulce";
    }

    /**
     * Establece el estado del producto.
     * 
     * @param estado El estado del producto.
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * Establece la cantidad de productos vendidos.
     * 
     * @param cant_vendidos La cantidad de productos vendidos.
     */
    public void setCant_vendidos(int cant_vendidos) {
        this.cant_vendidos = cant_vendidos;
    }

    /**
     * Obtiene el identificador único del producto.
     * 
     * @return El identificador único del producto.
     */
    public int getID() {
        return ID;
    }

    /**
     * Obtiene el nombre del producto.
     * 
     * @return El nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la cantidad de productos disponibles en inventario.
     * 
     * @return La cantidad de productos disponibles.
     */
    public int getDisponibles() {
        return cant_disponibles;
    }

    /**
     * Obtiene la cantidad de productos vendidos.
     * 
     * @return La cantidad de productos vendidos.
     */
    public int getVendidos() {
        return cant_vendidos;
    }

    /**
     * Obtiene el estado del producto como una cadena descriptiva.
     * 
     * @return Una cadena que describe el estado del producto.
     */
    public String getEstado() {
        if (estado) {
            return "Producto disponible";
        } else {
            return "Producto NO disponible";
        }
    }

    /**
     * Obtiene el precio unitario del producto.
     * 
     * @return El precio unitario del producto.
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Obtiene la comisión aplicada al producto.
     * 
     * @return La comisión aplicada al producto.
     */
    public double getComision() {
        return comision;
    }

    /**
     * Obtiene la categoría del producto.
     * 
     * @return La categoría del producto.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Obtiene si el producto es dietético como una cadena descriptiva.
     * 
     * @return Una cadena que indica si el producto es dietético o no.
     */
    public String EsDietetico() {
        if (esDietetico) {
            return "El producto es dietético";
        } else {
            return "El producto NO es dietético";
        }
    }

    /**
     * Genera una representación en cadena del objeto Dulce, incluyendo información adicional sobre si es dietético.
     * 
     * @return Una cadena que contiene los atributos del producto y su condición dietética.
     */
    @Override
    public String toString() {
        return super.toString() + ", Es dietético: " + this.EsDietetico();
    }
}
