/**
 * La clase Snack es una subclase de Producto que representa productos de la categoría "Snack".
 */
public class Snack extends Producto {
    int gramos; // Peso del snack en gramos
    String sabor; // Sabor del snack
    String tamanio; // Tamaño del snack (por ejemplo, pequeño, mediano, grande)

    /**
     * Constructor de la clase Snack.
     * 
     * @param iD             El identificador único del producto.
     * @param cant_disponibles La cantidad de productos disponibles en inventario.
     * @param precio         El precio unitario del producto.
     * @param comision       La comisión aplicada al producto.
     * @param nombre         El nombre del producto.
     * @param gramos         El peso del snack en gramos.
     * @param sabor          El sabor del snack.
     * @param tamanio        El tamaño del snack.
     */
    public Snack(int iD, int cant_disponibles, int precio, double comision, String nombre, int gramos, String sabor, String tamanio) {
        super(iD, cant_disponibles, precio, comision, nombre);
        this.gramos = gramos;
        this.sabor = sabor;
        this.tamanio = tamanio;
        categoria = "Snack";
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
     * Obtiene el peso del snack en gramos.
     * 
     * @return El peso del snack en gramos.
     */
    public int getGramos() {
        return gramos;
    }

    /**
     * Obtiene el sabor del snack.
     * 
     * @return El sabor del snack.
     */
    public String getSabor() {
        return sabor;
    }

    /**
     * Obtiene el tamaño del snack.
     * 
     * @return El tamaño del snack (por ejemplo, pequeño, mediano, grande).
     */
    public String getTamanio() {
        return tamanio;
    }

    /**
     * Genera una representación en cadena del objeto Snack, incluyendo información adicional sobre el peso, el sabor y el tamaño del snack.
     * 
     * @return Una cadena que contiene los atributos del producto y detalles sobre el snack.
     */
    @Override
    public String toString() {
        return super.toString() + ", Gramos: " + this.gramos + ", Sabor: " + this.sabor + ", Tamaño: " + this.tamanio;
    }
}
