package by.lease.dao;

import java.util.List;

public interface BaseDao <K, E> {

    List<E> findAll();

    E findById(K id);

    void save(E entity);

    E update(E entity);

    void delete(K id);
}
