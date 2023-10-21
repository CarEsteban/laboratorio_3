public class Snack extends Producto {

    int gramos;
    String sabor, tamanio;
    
    
    public Snack(int iD, int cant_disponibles, int precio, int comision, String nombre, int gramos, String sabor, String tamanio) {
        super(iD, cant_disponibles, precio, comision, nombre);
        this.gramos=gramos;
        this.sabor=sabor;
        this.tamanio=tamanio;
        categoria="Snack";
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
    
    
    public int getGramos() {
        return gramos;
    }

    public String getSabor() {
        return sabor;
    }

    public String getTamanio() {
        return tamanio;
    }


    @Override
    public String toString() {
        return super.toString() + 
               ", Gramos: " + this.gramos +
               ", Sabor: " + this.sabor + 
               ", Tamaño: " + this.tamanio ;
    }


    

}
