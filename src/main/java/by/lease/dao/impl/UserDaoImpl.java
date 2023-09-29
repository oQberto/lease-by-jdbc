package by.lease.dao.impl;

import by.lease.dao.UserDao;
import by.lease.entity.User;
import jakarta.persistence.EntityManager;

public class UserDaoImpl extends BaseDaoImpl<Long, User> implements UserDao {

    public UserDaoImpl(Class<User> clazz, EntityManager entityManager) {
        super(clazz, entityManager);
    }
}
