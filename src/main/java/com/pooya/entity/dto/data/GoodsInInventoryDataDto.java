package com.pooya.entity.dto.data;

import com.pooya.common.data.Identifiable;
import com.querydsl.core.annotations.QueryProjection;

public class GoodsInInventoryDataDto implements Identifiable{
    private Integer id;

    private Integer goodsId;
    private Integer goodsQuantityUnitId;
    private String goodsCode;
    private String goodsName;

    private Integer inventoryId;
    private String inventoryCode;
    private String inventoryName;

    private String quantityUnitCode;
    private String quantityUnitName;

    @QueryProjection
    public GoodsInInventoryDataDto(Integer id, Integer goodsId, Integer goodsQuantityUnitId, String goodsCode, String goodsName, Integer inventoryId, String inventoryCode, String inventoryName, String quantityUnitCode, String quantityUnitName) {
        this.id = id;
        this.goodsId = goodsId;
        this.goodsQuantityUnitId = goodsQuantityUnitId;
        this.goodsCode = goodsCode;
        this.goodsName = goodsName;
        this.inventoryId = inventoryId;
        this.inventoryCode = inventoryCode;
        this.inventoryName = inventoryName;
        this.quantityUnitCode = quantityUnitCode;
        this.quantityUnitName = quantityUnitName;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsQuantityUnitId() {
        return goodsQuantityUnitId;
    }

    public void setGoodsQuantityUnitId(Integer goodsQuantityUnitId) {
        this.goodsQuantityUnitId = goodsQuantityUnitId;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getInventoryCode() {
        return inventoryCode;
    }

    public void setInventoryCode(String inventoryCode) {
        this.inventoryCode = inventoryCode;
    }

    public String getInventoryName() {
        return inventoryName;
    }

    public void setInventoryName(String inventoryName) {
        this.inventoryName = inventoryName;
    }

    public String getQuantityUnitCode() {
        return quantityUnitCode;
    }

    public void setQuantityUnitCode(String quantityUnitCode) {
        this.quantityUnitCode = quantityUnitCode;
    }

    public String getQuantityUnitName() {
        return quantityUnitName;
    }

    public void setQuantityUnitName(String quantityUnitName) {
        this.quantityUnitName = quantityUnitName;
    }

    @Override
    public String toString() {
        return "GoodsInInventoryDataDto{" +
                "id=" + id +
                ", goodsId=" + goodsId +
                ", goodsQuantityUnitId=" + goodsQuantityUnitId +
                ", goodsCode='" + goodsCode + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", inventoryId=" + inventoryId +
                ", inventoryCode='" + inventoryCode + '\'' +
                ", inventoryName='" + inventoryName + '\'' +
                ", quantityUnitCode='" + quantityUnitCode + '\'' +
                ", quantityUnitName='" + quantityUnitName + '\'' +
                '}';
    }
}
