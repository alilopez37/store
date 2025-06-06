package models;

import java.util.ArrayList;

public class BitacoraVentas {
    private ArrayList<CarritoCompra>  carritoCompras;
    public BitacoraVentas() {
        carritoCompras = new ArrayList<>();
    }

    public boolean addCarritoCompra(CarritoCompra c) {
        return carritoCompras.add(c);
    }
}
