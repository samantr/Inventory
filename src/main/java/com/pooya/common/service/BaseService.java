package com.pooya.common.service;

import com.pooya.common.entity.BaseEntity;

public interface BaseService<T extends BaseEntity> {

    public T persistNew(T item);

    public T merge(T item);

    public void removeItem(T item) ;
}
