package com.pooya.service.data.impl;

import com.pooya.common.service.BaseDataService;
import com.pooya.common.service.impl.BaseDataServiceImpl;
import com.pooya.dao.data.GoodsInInventoryDataDao;
import com.pooya.entity.dto.data.GoodsInInventoryDataDto;
import com.pooya.service.data.GoodsInInventoryDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class GoodsInInventoryDataServiceImpl extends BaseDataServiceImpl<GoodsInInventoryDataDto> implements GoodsInInventoryDataService{

    @Autowired
    GoodsInInventoryDataDao dao;

    @Override
    public List<GoodsInInventoryDataDto> findAll(Map<String, Object> map) {
        return dao.findAll(map);
    }
}
