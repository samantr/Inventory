package com.pooya.common.dao;

import com.pooya.common.entity.BaseEntity;

public interface BaseDao<T extends BaseEntity> {


    public T persistNew(T item);

    public T mergeItem(T item);

    public void removeItem(T item) ;


}
