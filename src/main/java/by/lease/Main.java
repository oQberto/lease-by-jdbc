package by.lease;

import by.lease.dao.impl.RentalDaoImpl;
import by.lease.entity.Rental;
import by.lease.util.EntityManagerUtil;
import org.hibernate.Session;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (Session session = EntityManagerUtil.getSession()) {
            RentalDaoImpl rentalDao = new RentalDaoImpl(Rental.class, session);
            List<Rental> allRentalByCityId = rentalDao.findAllRentalByCityId(1L);
            System.out.println(allRentalByCityId);
        }
    }
}