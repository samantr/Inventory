package com.pooya.service.service;

import com.pooya.common.service.BaseService;
import com.pooya.entity.dto.QuantityUnitDto;
import com.pooya.entity.entity.QuantityUnit;

import java.util.List;
import java.util.Map;

public interface QuantityUnitService extends BaseService<QuantityUnit>{

    public List<QuantityUnitDto> find(Map<String, Object> map);
}
