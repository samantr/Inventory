package com.pooya.dao.data;

import com.pooya.common.dao.BaseDataDao;
import com.pooya.entity.dto.data.GoodsAndUnitsDto;

import java.util.List;
import java.util.Map;

public interface GoodsAndUnitsDao extends BaseDataDao<GoodsAndUnitsDto> {

    public  List<GoodsAndUnitsDto> findByFilter(Map<String, Object> params);
}

