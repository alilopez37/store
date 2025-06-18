package infraestructure.repository;

import domain.model.Inventario;
import domain.model.Producto;
import domain.repository.InventarioRepository;

import java.util.*;

public class InMemoryInventarioRepository implements InventarioRepository {
    private final Inventario store = new Inventario();
    @Override
    public boolean save(Producto product) {
        return  store.addProducto(product);
    }

    @Override
    public Optional<Producto> findById(int id) {
        return store.findById(id);
    }

    @Override
    public ArrayList<Producto> findAll() {
        return store.getProducts();
    }

    @Override
    public boolean delete(int id) {
        return store.removeProducto(id);
    }
}
