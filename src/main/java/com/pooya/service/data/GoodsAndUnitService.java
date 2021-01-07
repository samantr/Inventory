package com.pooya.service.data;

import com.pooya.common.data.Identifiable;
import com.pooya.common.service.BaseDataService;
import com.pooya.common.service.impl.BaseDataServiceImpl;
import com.pooya.entity.dto.QuantityUnitDto;
import com.pooya.entity.dto.data.GoodsAndUnitsDto;

import java.util.List;
import java.util.Map;

public interface GoodsAndUnitService extends BaseDataService<GoodsAndUnitsDto> {

    public  List<GoodsAndUnitsDto> findByFilter(Map<String, Object> params);
}
