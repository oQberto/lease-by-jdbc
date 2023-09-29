package by.lease.dao;

import by.lease.entity.Address;
import by.lease.entity.Rental;

import java.util.List;
import java.util.Optional;

public interface RentalDao extends BaseDao<Long, Rental> {

    List<Rental> findAllRentalByCityId(Long id);

    List<Rental> findAllRentalByStreetName(String name);

    Optional<Rental> findRentalByAddress(Address address);
}
