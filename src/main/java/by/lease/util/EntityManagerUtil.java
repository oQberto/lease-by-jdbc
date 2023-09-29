package by.lease.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.Session;

public class EntityManagerUtil {
    private static EntityManagerFactory entityManagerFactory;

    static {
        init();
    }

    private static void init(){
        entityManagerFactory = Persistence.createEntityManagerFactory("by.lease");
    }

    public static EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

    public static Session getSession() {
        return entityManagerFactory.createEntityManager().unwrap(Session.class);
    }
}
