package com.pooya.entity.dto;

import com.pooya.entity.entity.GoodsToInventory;
import com.querydsl.core.annotations.QueryProjection;

import java.util.List;

public class InventoryDto {

    private Integer id;
    private String code;
    private String name;

    public InventoryDto() {
    }

    @QueryProjection
    public InventoryDto(Integer id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
