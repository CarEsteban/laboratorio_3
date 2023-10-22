public class Venta {
    int total=0, subTotalDulces, subTotalSnack, subTotalBebida, comision;
    String categoria;

    public void setTotal(int total, int comision, String categoria){
        if(categoria==null){
            this.total=total;
        }else if(categoria.equals("Snack")){
            this.subTotalSnack+=total;
        }else if(categoria.equals("Bebida")){
            this.subTotalBebida+=total;
        }else if(categoria.equals("Dulce")){
            this.subTotalDulces+=total;
            
        }
        
    }

    public int getTotal(String categoria) {
        if(categoria==null){
            return total;
        }else if(categoria.equals("Bebida")){
            return subTotalBebida;
        }else if(categoria.equals("Snack")){
            return subTotalSnack;
        }else if(categoria.equals("Dulce")){
            
            comision=(int) (subTotalDulces*.20);
            return subTotalDulces-comision;
        }else {
            return 0;
        }
    }

    public int getComision() {
        comision=(int) (subTotalDulces*.20);
        return comision;
    }

}
