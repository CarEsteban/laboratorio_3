public class Venta {
    int total, subTotalDulces, subTotalSnack, subTotalBebida, comision;
    String categoria;

    public void setTotal(int total, int comision, String categoria){

    }

    public int getTotal() {
        return total;
    }

    public int getSubTotal(String categoria) {
        if(categoria.equals("Bebida")){
            return subTotalBebida;
        }else if(categoria.equals("Snack")){
            return subTotalSnack;
        }else if(categoria.equals("Dulce")){
            return subTotalDulces;
        }else {
            return 0;
        }
    }

}
