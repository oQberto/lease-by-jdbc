package by.lease.dao.impl;

import by.lease.dao.AboutDao;
import by.lease.entity.About;
import jakarta.persistence.EntityManager;

public class AboutDaoImpl extends BaseDaoImpl<Long, About> implements AboutDao {

    public AboutDaoImpl(Class<About> clazz, EntityManager entityManager) {
        super(clazz, entityManager);
    }
}
