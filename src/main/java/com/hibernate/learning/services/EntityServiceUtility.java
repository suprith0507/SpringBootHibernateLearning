package com.hibernate.learning.services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.engine.spi.EntityEntry;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EntityServiceUtility {

    @PersistenceContext
    private EntityManager entityManager;

    public String getEntityState(Object entity) {
        // code here
        /* Session session =
                entityManager.unwrap(Session.class);

       EntityEntry entry =
                session.getPersistenceContext()
                        .getEntry(entity);*/ //works only for hibernate 5

        SharedSessionContractImplementor session =
                entityManager.unwrap(
                        SharedSessionContractImplementor.class);

        EntityEntry entry =
                session.getPersistenceContextInternal().getEntry(entity);


        if (entry != null) {
            return entry.getStatus().name(); //managed removed are still inside persistence context.
        }

        Object id =
                entityManager.getEntityManagerFactory()
                        .getPersistenceUnitUtil()
                        .getIdentifier(entity);

        if (id == null) {
            return "TRANSIENT"; // nothing in Persistence context means transient state
        }

        return "DETACHED"; // nothing in persistence context but id is present means detached state
    }

    public void printState(String name,
                           Object entity) {
        System.out.println(
                name + " -> "
                        + getEntityState(entity));
    }
}
