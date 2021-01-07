package com.pooya.service.data.impl;

import com.pooya.common.error.CustomeException;
import com.pooya.common.service.impl.BaseDataServiceImpl;
import com.pooya.dao.data.GoodsAndUnitsDao;
import com.pooya.entity.dto.data.GoodsAndUnitsDto;
import com.pooya.entity.entity.Goods;
import com.pooya.service.data.GoodsAndUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class GoodsAndUnitServiceImpl extends BaseDataServiceImpl<GoodsAndUnitsDto> implements GoodsAndUnitService {

    @Autowired
    GoodsAndUnitsDao dao;

    @Transactional
    public  List<GoodsAndUnitsDto> findByFilter(Map<String, Object> params)
    {
        if (params.get("gCode")!=null && params.get("gCode").equals("A"))
        {
            CustomeException customeException = new CustomeException();
            customeException.addMessage("bad input");
            customeException.addMessage("bad input A");
            throw customeException;
        }
        return dao.findByFilter(params);
    }
}
