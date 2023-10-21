public class Bebida extends Producto {

    int mililitros;
    String tipo;
    
    
    public Bebida(int iD, int cant_disponibles, int precio, int comision, String nombre, int mililitros, String tipo) {
        super(iD, cant_disponibles, precio, comision, nombre);
        this.mililitros=mililitros;
        this.tipo=tipo;
        categoria="Bebida";
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
    
    
    public int getMililitros() {
        return mililitros;
    }

    public String getTipo() {
        return tipo;
    }



    @Override
    public String toString() {
        return super.toString() + 
               ", Mililitros: " + this.mililitros +
                ", Tipo: " + this.tipo ;
    }

    

}
