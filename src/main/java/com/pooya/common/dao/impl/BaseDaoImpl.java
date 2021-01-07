package com.pooya.common.dao.impl;

import com.pooya.common.entity.BaseEntity;
import com.pooya.common.dao.BaseDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public abstract class BaseDaoImpl<T extends BaseEntity> implements BaseDao<T> {


    @PersistenceContext
    EntityManager em;



    public T persistNew(T item) {
        em.persist(item);
        return item;
    }

    public T mergeItem(T item) {
        em.merge(item);
        return item;
    }

    public void removeItem(T item) {
        em.remove(em.contains(item) ? item : em.merge(item));
    }

}
