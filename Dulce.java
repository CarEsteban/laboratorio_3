public class Dulce extends Producto {

    boolean esDietetico;
    
    
    public Dulce(int iD, int cant_disponibles, int precio, int comision, String nombre, boolean esDietetico) {
        super(iD, cant_disponibles, precio, comision, nombre);
        this.esDietetico=esDietetico;
        categoria="Dulce";
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setCant_vendidos(int cant_vendidos) {
        this.cant_vendidos = cant_vendidos;
    }
    
    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDisponibles() {
        return cant_disponibles;
    }

    public int getVendidos() {
        return cant_vendidos;
    }

    public String getEstado(){
        if(estado){
            return "Producto disponible";
        }else{
            return "Producto NO disponible";
        }
    }

    public int getPrecio() {
        return precio;
    }

    public int getComision() {
        return comision;
    }

    public String getCategoria() {
        return categoria;
    }
    
    public boolean EsDietetico() {
        return esDietetico;
    }


    @Override
    public String toString() {
        return "Producto [ID=" + ID + ", cant_disponibles=" + cant_disponibles + ", cant_vendidos=" + cant_vendidos
                + ", precio=" + precio + ", comision=" + comision + ", nombre=" + nombre + ", pais=" + pais
                + ", categoria=" + categoria + ", estado=" + estado + "]";
    }

    

}
