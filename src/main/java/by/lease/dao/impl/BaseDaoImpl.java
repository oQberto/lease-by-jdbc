package by.lease.dao.impl;

import by.lease.dao.BaseDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class BaseDaoImpl<K, E> implements BaseDao<K, E> {
    private final Class<E> clazz;
    private final EntityManager entityManager;

    @Override
    public List<E> findAll() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<E> criteriaQuery = criteriaBuilder.createQuery(clazz);
        Root<E> root = criteriaQuery.from(clazz);

        criteriaQuery.orderBy(criteriaBuilder.asc(root.get("id")));

        return entityManager
                .createQuery(criteriaQuery)
                .getResultList();
    }

    @Override
    public Optional<E> findById(K id) {
        return Optional.ofNullable(entityManager.find(clazz, id));
    }

    @Override
    public void save(E entity) {
        entityManager.persist(entity);
    }

    @Override
    public E update(E entity) {
        return entityManager.merge(entity);
    }

    @Override
    public void delete(K id) {
        E deletableEntity = entityManager.find(clazz, id);
        entityManager.remove(deletableEntity);
    }
}
