package com.pooya.dao.dao;

import com.pooya.common.dao.BaseDao;
import com.pooya.entity.dto.QuantityUnitDto;
import com.pooya.entity.entity.QuantityUnit;

import java.util.List;
import java.util.Map;

public interface QuantityUnitDao extends BaseDao<QuantityUnit>{

    public List<QuantityUnitDto> find(Map<String, Object> map);
}
