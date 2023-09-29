package by.lease.dao;

import java.util.List;
import java.util.Optional;

public interface BaseDao <K, E> {

    List<E> findAll();

    Optional<E> findById(K id);

    void save(E entity);

    E update(E entity);

    void delete(K id);
}
