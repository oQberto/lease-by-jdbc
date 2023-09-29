package by.lease.dao.impl;

import by.lease.dao.AddressDao;
import by.lease.entity.Address;
import jakarta.persistence.EntityManager;

public class AddressDaoImpl extends BaseDaoImpl<Long, Address> implements AddressDao {

    public AddressDaoImpl(Class<Address> clazz, EntityManager entityManager) {
        super(clazz, entityManager);
    }
}
