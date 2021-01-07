package com.pooya.service.service.impl;

import com.pooya.common.service.impl.BaseServiceImpl;
import com.pooya.dao.dao.QuantityUnitDao;
import com.pooya.entity.dto.QuantityUnitDto;
import com.pooya.entity.entity.QuantityUnit;
import com.pooya.service.service.QuantityUnitService;
import com.pooya.common.error.CustomeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.faces.application.FacesMessage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class QuantityUnitServiceImpl extends BaseServiceImpl<QuantityUnit> implements QuantityUnitService {

    @Autowired
    QuantityUnitDao dao;

    @Override
    @Transactional
    public List<QuantityUnitDto> find(Map<String, Object> map) {
        return dao.find(map);
    }

    @Override
    @Transactional
    public QuantityUnit persistNew(QuantityUnit item) {

        validate(item);
        return super.persistNew(item);
    }

    public void validate(QuantityUnit quantityUnit)
    {
        Map<String, Object> map = new HashMap<>();
        FacesMessage facesMessage = new FacesMessage("duplication");

        map.put("code",quantityUnit.getCode());
        if (dao.find(map).size()>0)
        {
            CustomeException customeException = new CustomeException();
            customeException.addMessage("Code is duplicate");
            throw customeException;
        }
    }

}
