package domain.model;

public class ItemCarritoCompra {
    static private int idItemCompra=0;
    private int idProducto;
    private int cantidad;

    public ItemCarritoCompra(int idProducto, int cantidad) {
        idItemCompra++;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
    }
}
