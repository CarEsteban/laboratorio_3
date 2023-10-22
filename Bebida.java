/**
 * La clase Bebida es una subclase de Producto que representa productos de la categoría "Bebida".
 */
public class Bebida extends Producto {
    int mililitros; // Volumen de la bebida en mililitros
    String tipo; // Tipo de bebida (por ejemplo, refresco, agua, etc.)

    /**
     * Constructor de la clase Bebida.
     * 
     * @param iD             El identificador único del producto.
     * @param cant_disponibles La cantidad de productos disponibles en inventario.
     * @param precio         El precio unitario del producto.
     * @param comision       La comisión aplicada al producto.
     * @param nombre         El nombre del producto.
     * @param mililitros     El volumen de la bebida en mililitros.
     * @param tipo           El tipo de bebida.
     */
    public Bebida(int iD, int cant_disponibles, int precio, double comision, String nombre, int mililitros, String tipo) {
        super(iD, cant_disponibles, precio, comision, nombre);
        this.mililitros = mililitros;
        this.tipo = tipo;
        categoria = "Bebida";
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
     * Obtiene el volumen de la bebida en mililitros.
     * 
     * @return El volumen de la bebida en mililitros.
     */
    public int getMililitros() {
        return mililitros;
    }

    /**
     * Obtiene el tipo de bebida.
     * 
     * @return El tipo de bebida (por ejemplo, refresco, agua, etc.).
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Genera una representación en cadena del objeto Bebida, incluyendo información adicional sobre el volumen y el tipo de bebida.
     * 
     * @return Una cadena que contiene los atributos del producto y detalles sobre la bebida.
     */
    @Override
    public String toString() {
        return super.toString() + ", Mililitros: " + this.mililitros + ", Tipo: " + this.tipo;
    }
}
