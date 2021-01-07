package com.pooya.service.data;

import com.pooya.common.service.BaseDataService;
import com.pooya.common.service.BaseService;
import com.pooya.entity.dto.data.GoodsInInventoryDataDto;

import java.util.List;
import java.util.Map;

public interface GoodsInInventoryDataService extends BaseDataService<GoodsInInventoryDataDto> {

    public List<GoodsInInventoryDataDto> findAll(Map<String, Object> map);
}
