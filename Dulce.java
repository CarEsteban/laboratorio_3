public class Dulce extends Producto {

    boolean esDietetico;
    
    
    public Dulce(int iD, int cant_disponibles, int precio, double comision, String nombre, boolean esDietetico) {
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

    public double getComision() {
        return comision;
    }

    public String getCategoria() {
        return categoria;
    }

    public String EsDietetico() {
        if(esDietetico){
            return "El producto es dietético";
        }else{
            return "El producto NO es dietético";
        }
    }


    @Override
    public String toString() {
        return super.toString() + 
               ", Es dieteico: " + this.EsDietetico() ;
    }

    

}
