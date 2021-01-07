package com.pooya.common.service.impl;

import com.pooya.common.dao.BaseDao;
import com.pooya.common.entity.BaseEntity;
import com.pooya.common.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public abstract class BaseServiceImpl<T extends BaseEntity> implements BaseService<T> {


    @Autowired
    BaseDao<T> dao;

    @Transactional
    public T persistNew(T item) {
        return dao.persistNew(item);
    }

    @Transactional
    public T merge(T item) {
        return dao.mergeItem(item);
    }

    @Transactional
    public void removeItem(T item) {
        dao.removeItem(item);
    }
}
