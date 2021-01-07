package com.pooya.entity.dto.data;

import com.pooya.common.data.Identifiable;
import com.querydsl.core.annotations.QueryProjection;
import com.querydsl.core.types.Expression;
import com.querydsl.jpa.impl.JPAQuery;

import java.util.Date;

public class InventoryTransactionData implements Identifiable{

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


    private Integer gdsToInventory;
    private float amount;
    private boolean transactionType;
    private Date transactionTime;

    private Float remainingAmount;

    JPAQuery<Float> query;

    Expression<Float> expression;

    @QueryProjection
    public InventoryTransactionData(Expression<Float> expression) {
        this.expression = expression;
    }

    @QueryProjection
    public InventoryTransactionData(JPAQuery<Float> query) {
        this.query = query;
    }

    public Integer getGdsToInventory() {
        return gdsToInventory;
    }

    public void setGdsToInventory(Integer gdsToInventory) {
        this.gdsToInventory = gdsToInventory;
    }

    public JPAQuery<Float> getQuery() {
        return query;
    }

    public void setQuery(JPAQuery<Float> query) {
        this.query = query;
    }

    @QueryProjection
    public InventoryTransactionData(Float remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    @QueryProjection
    public InventoryTransactionData(Integer id, Integer goodsId, Integer goodsQuantityUnitId, String goodsCode, String goodsName, Integer inventoryId, String inventoryCode, String inventoryName, String quantityUnitCode, String quantityUnitName, float amount, boolean transactionType, Date transactionTime, Float remainingAmount) {
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
        this.amount = amount;
        this.transactionType = transactionType;
        this.transactionTime = transactionTime;
        this.remainingAmount = remainingAmount;
    }

    @QueryProjection
    public InventoryTransactionData(Integer gdsToInventory , float amount, boolean transactionType, Date transactionTime) {
        this.gdsToInventory = gdsToInventory;
        this.amount = amount;
        this.transactionType = transactionType;
        this.transactionTime = transactionTime;
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

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public boolean isTransactionType() {
        return transactionType;
    }

    public void setTransactionType(boolean transactionType) {
        this.transactionType = transactionType;
    }

    public Date getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(Date transactionTime) {
        this.transactionTime = transactionTime;
    }

    public Float getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(Float remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    @Override
    public String toString() {
        return "InventoryTransactionData{" +
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
                ", amount=" + amount +
                ", transactionType=" + transactionType +
                ", transactionTime=" + transactionTime +
                ", remainingAmount=" + remainingAmount +
                '}';
    }
}
