package com.pooya.dao.data;

import com.pooya.common.dao.BaseDataDao;
import com.pooya.entity.dto.data.GoodsInInventoryDataDto;

import java.util.List;
import java.util.Map;

public interface GoodsInInventoryDataDao extends BaseDataDao<GoodsInInventoryDataDto> {

    public List<GoodsInInventoryDataDto> findAll(Map<String,Object> map);

}
