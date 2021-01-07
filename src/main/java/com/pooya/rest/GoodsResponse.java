package com.pooya.rest;

import com.pooya.common.error.ErrorObject;
import com.pooya.entity.dto.data.GoodsAndUnitsDto;

import java.util.List;

public class GoodsResponse {
    private List<GoodsAndUnitsDto> goodsAndUnitsDtos;
    private List<ErrorObject> errorObjects;

    public List<GoodsAndUnitsDto> getGoodsAndUnitsDtos() {
        return goodsAndUnitsDtos;
    }

    public void setGoodsAndUnitsDtos(List<GoodsAndUnitsDto> goodsAndUnitsDtos) {
        this.goodsAndUnitsDtos = goodsAndUnitsDtos;
    }

    public List<ErrorObject> getErrorObjects() {
        return errorObjects;
    }

    public void setErrorObjects(List<ErrorObject> errorObjects) {
        this.errorObjects = errorObjects;
    }
}
