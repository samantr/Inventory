package com.pooya.dao.dao;

import com.pooya.common.dao.BaseDao;
import com.pooya.entity.dto.GoodsDto;
import com.pooya.entity.dto.InventoryDto;
import com.pooya.entity.entity.Goods;
import com.pooya.entity.entity.Inventory;

import java.util.List;
import java.util.Map;

public interface GoodsDao extends BaseDao<Goods> {

    public List<GoodsDto> findGoodsList(Map<String, Object> map);

}
