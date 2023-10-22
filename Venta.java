/**
 * La clase Venta representa la gestión de ventas en la tienda.
 */
public class Venta {
    int total = 0; // El monto total de ventas
    int subTotalDulces; // El monto total de ventas de productos de la categoría "Dulce"
    int subTotalSnack; // El monto total de ventas de productos de la categoría "Snack"
    int subTotalBebida; // El monto total de ventas de productos de la categoría "Bebida"
    double comision; // La comisión aplicada a las ventas de productos de la categoría "Dulce"
    String categoria; // La categoría de producto para la que se realiza el cálculo

    /**
     * Establece el monto total de ventas o el subtotal de ventas para una categoría específica.
     * 
     * @param total     El monto total de ventas.
     * @param categoria La categoría de producto para la que se establece el subtotal.
     */
    public void setTotal(int total, String categoria) {
        if (categoria == null) {
            this.total = total;
        } else if (categoria.equals("Snack")) {
            this.subTotalSnack += total;
        } else if (categoria.equals("Bebida")) {
            this.subTotalBebida += total;
        } else if (categoria.equals("Dulce")) {
            this.subTotalDulces += total;
        }
    }

    /**
     * Obtiene el monto total de ventas o el subtotal de ventas para una categoría específica.
     * 
     * @param categoria La categoría de producto para la que se obtiene el monto total o subtotal.
     * @return El monto total de ventas o subtotal de ventas de la categoría especificada.
     */
    public int getTotal(String categoria) {
        if (categoria == null) {
            return total;
        } else if (categoria.equals("Bebida")) {
            return subTotalBebida;
        } else if (categoria.equals("Snack")) {
            return subTotalSnack;
        } else if (categoria.equals("Dulce")) {
            comision = (int) (subTotalDulces * 0.20);
            return (int) (subTotalDulces - comision);
        } else {
            return 0;
        }
    }

    /**
     * Obtiene la comisión aplicada a las ventas de productos de la categoría "Dulce".
     * 
     * @return La comisión calculada como el 20% del monto total de ventas de productos de la categoría "Dulce".
     */
    public double getComision() {
        comision = (int) (subTotalDulces * 0.20);
        return comision;
    }
}
