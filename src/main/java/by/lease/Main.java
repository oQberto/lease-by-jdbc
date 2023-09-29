package by.lease;

import by.lease.dao.impl.RentalDaoImpl;
import by.lease.entity.Rental;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("by.lease")) {

            RentalDaoImpl rentalDao = new RentalDaoImpl(Rental.class, entityManagerFactory.createEntityManager());
            List<Rental> allRentalByCityId = rentalDao.findAllRentalByCityId(1L);
            System.out.println(allRentalByCityId);
        }
    }
}