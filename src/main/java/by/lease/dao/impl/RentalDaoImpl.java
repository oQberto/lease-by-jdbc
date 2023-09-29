package by.lease.dao.impl;

import by.lease.dao.RentalDao;
import by.lease.entity.Address;
import by.lease.entity.Rental;

import java.util.List;
import java.util.Optional;

public class RentalDaoImpl implements RentalDao {

    @Override
    public List<Rental> findAll() {
        return null;
    }

    @Override
    public Rental findById(Long id) {
        return null;
    }

    @Override
    public void save(Rental entity) {

    }

    @Override
    public Rental update(Rental entity) {
        return null;
    }

    @Override
    public void delete(Long id) {

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
