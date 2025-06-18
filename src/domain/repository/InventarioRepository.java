package domain.repository;

import domain.model.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface InventarioRepository {
    boolean save(Producto producto);
    Optional<Producto> findById(int id);
    ArrayList<Producto> findAll();
    boolean delete(int id);
}