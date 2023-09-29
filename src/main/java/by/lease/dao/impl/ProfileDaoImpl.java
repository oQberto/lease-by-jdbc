package by.lease.dao.impl;

import by.lease.dao.ProfileDao;
import by.lease.entity.Profile;
import jakarta.persistence.EntityManager;

public class ProfileDaoImpl extends BaseDaoImpl<Long, Profile> implements ProfileDao {

    public ProfileDaoImpl(Class<Profile> clazz, EntityManager entityManager) {
        super(clazz, entityManager);
    }
}
