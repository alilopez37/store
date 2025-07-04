package domain.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class CarritoCompra {
    private int idCarritoCompra;
    private LocalDateTime fechaCompra;
    private ArrayList<ItemCarritoCompra> listaProductos;
    public CarritoCompra() {
        listaProductos = new ArrayList<>();
    }
    public float total() {
        return 0.0f;
    }
}
