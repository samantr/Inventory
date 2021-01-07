package com.pooya.entity.dto;

import com.pooya.entity.entity.GoodsToInventory;
import com.pooya.entity.entity.QuantityUnit;
import com.querydsl.core.annotations.QueryProjection;

import java.util.List;

public class GoodsDto {

    private Integer id;
    private Integer quantityUnitId;
    private String code;
    private String name;

    public GoodsDto() {
    }

    @QueryProjection
    public GoodsDto(Integer id, Integer quantityUnitId, String code, String name) {
        this.id = id;
        this.quantityUnitId = quantityUnitId;
        this.code = code;
        this.name = name;
    }




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantityUnitId() {
        return quantityUnitId;
    }

    public void setQuantityUnitId(Integer quantityUnitId) {
        this.quantityUnitId = quantityUnitId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
