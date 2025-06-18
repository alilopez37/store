package domain.model;

import java.util.ArrayList;
import java.util.Optional;

public class Inventario {
    private int id;
    private final ArrayList<Producto> products;
    public Inventario() {
        this.products = new ArrayList<>();
    }

    public boolean addProducto(Producto producto) {
        return products.add(producto);
    }
    public boolean removeProducto(int id) {
        Optional<Producto> product = Optional.empty();
        boolean flag = false;
        int x = 0;
        Producto producto;
        while (x< products.size() && !flag) {
            producto = products.get(x);
            if (producto.getId() == id) {
                products.remove(x);
                flag = true;
            }
            x++;
        }
        return flag;
    }
    public ArrayList<Producto> getProducts() {
        return products;
    }
    public Optional<Producto> findById(int id) {
        Optional<Producto> product = Optional.empty();
        boolean flag = false;
        int x = 0;
        Producto producto;
        while (x< products.size() && !flag) {
            producto = products.get(x);
            if (producto.getId() == id) {
                product = Optional.of(producto);
                flag = true;
            }
            x++;
        }
        return product;
    }
}
