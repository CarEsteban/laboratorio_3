public abstract class Producto {
    int ID, cant_disponibles, cant_vendidos, precio, comision;
    String nombre, pais, categoria;
    boolean estado;
    public Producto(int iD, int cant_disponibles, int precio, int comision, String nombre) {
        this.ID = iD;
        this.cant_disponibles = cant_disponibles;
        this.precio = precio;
        this.comision = comision;
        this.nombre = nombre;
        estado=true;
    }

    public abstract void setEstado(boolean estado);

    public abstract void setCant_vendidos(int cant_vendidos);
    
    public abstract int getID();

    public abstract String getNombre();

    public abstract int getDisponibles();

    public abstract int getVendidos();

    public abstract String getEstado();

    public abstract int getPrecio();

    public abstract int getComision();

    public abstract String getCategoria();

    @Override
    public String toString() {
        return "Producto [ID=" + ID + ", cant_disponibles=" + cant_disponibles + ", cant_vendidos=" + cant_vendidos
                + ", precio=" + precio + ", comision=" + comision + ", nombre=" + nombre + ", pais=" + pais
                + ", categoria=" + categoria + ", estado=" + estado + "]";
    }

    

}
