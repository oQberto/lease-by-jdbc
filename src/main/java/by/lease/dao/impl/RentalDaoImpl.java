package by.lease.dao.impl;

import by.lease.dao.RentalDao;
import by.lease.entity.Address;
import by.lease.entity.Rental;
import com.querydsl.jpa.impl.JPAQuery;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

import static by.lease.entity.QAddress.address;
import static by.lease.entity.QCity.city;
import static by.lease.entity.QRental.rental;
import static by.lease.entity.QStreet.street;


public class RentalDaoImpl extends BaseDaoImpl<Long, Rental> implements RentalDao {

    public RentalDaoImpl(Class<Rental> clazz, EntityManager entityManager) {
        super(clazz, entityManager);
    }

    @Override
    public List<Rental> findAllRentalByCityId(Long id) {
        return new JPAQuery<Rental>(entityManager)
                .select(rental)
                .from(rental)
                .join(rental.address, address)
                .join(address.city, city)
                .where(city.id.eq(id))
                .fetch();
    }

    @Override
    public List<Rental> findAllRentalByStreetName(String name) {
        return new JPAQuery<Rental>(entityManager)
                .select(rental)
                .from(rental)
                .join(rental.address, address)
                .join(address.street, street)
                .where(street.name.eq(name))
                .fetch();
    }

    @Override
    public Optional<Rental> findRentalByAddress(Address address) {
        return Optional.ofNullable(
                new JPAQuery<Rental>(entityManager)
                        .select(rental)
                        .from(rental)
                        .where(rental.address.eq(address))
                        .fetchOne()
        );
    }
}
