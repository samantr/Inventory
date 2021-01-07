package com.pooya.entity.dto;

import com.pooya.entity.entity.Goods;
import com.pooya.entity.entity.Inventory;
import com.querydsl.core.annotations.QueryProjection;

public class GoodsToInventoryDto {

    private Integer id;
    private Integer gdsId;
    private Integer inventoryId;

    public GoodsToInventoryDto() {
    }

    @QueryProjection
    public GoodsToInventoryDto(Integer id, Integer gdsId, Integer inventoryId) {
        this.id = id;
        this.gdsId = gdsId;
        this.inventoryId = inventoryId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGdsId() {
        return gdsId;
    }

    public void setGdsId(Integer gdsId) {
        this.gdsId = gdsId;
    }

    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

}
