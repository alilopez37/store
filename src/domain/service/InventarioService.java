package domain.service;

import domain.model.Producto;
import domain.repository.InventarioRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InventarioService {
    private final InventarioRepository repository;

    public InventarioService(InventarioRepository repository) {
        this.repository = repository;
    }

    public boolean addProduct(int id, String name, float price, int stock) {
        Producto product = new Producto(id, name, price, stock);
        return repository.save(product);
    }

    public ArrayList<Producto> listProducts() {
        return repository.findAll();
    }

    public Optional<Producto> getProduct(int id) {
        return repository.findById(id);
    }

    public void deleteProduct(int id) {
        repository.delete(id);
    }
}
