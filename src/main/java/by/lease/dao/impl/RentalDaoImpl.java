package by.lease.dao.impl;

import by.lease.dao.RentalDao;
import by.lease.entity.Address;
import by.lease.entity.Rental;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;


public class RentalDaoImpl extends BaseDaoImpl<Long, Rental> implements RentalDao {

    public RentalDaoImpl(Class<Rental> clazz, EntityManager entityManager) {
        super(clazz, entityManager);
    }

    @Override
    public List<Rental> findAllRentalByCityId(Long id) {
        return null;
    }

    @Override
    public List<Rental> findAllRentalByStreetName(String name) {
        return null;
    }

    @Override
    public Optional<Rental> findRentalByAddress(Address address) {
        return Optional.empty();
    }
}
