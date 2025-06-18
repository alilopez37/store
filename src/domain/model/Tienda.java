package domain.model;

public class Tienda {
    private int idTienda;
    private String nombre;
    private Inventario inventario;
    private BitacoraVentas bitacoraVentas;

    public Tienda() {
        inventario = new Inventario();
        bitacoraVentas = new BitacoraVentas();
    }
}
