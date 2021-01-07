package com.pooya.entity.dto;


import com.querydsl.core.annotations.QueryProjection;

import java.util.Date;

public class InventoryTransactionDto {

    private Integer id;
    private Integer gdsToInventoryId;
    private float amount;
    private boolean transactionType;
    private Date transactionTime;

    @QueryProjection
    public InventoryTransactionDto(Integer id, Integer gdsToInventoryId, float amount, boolean transactionType, Date TransactionTime) {
        this.id = id;
        this.gdsToInventoryId = gdsToInventoryId;
        this.amount = amount;
        this.transactionType = transactionType;
        this.transactionTime = TransactionTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGdsToInventoryId() {
        return gdsToInventoryId;
    }

    public void setGdsToInventoryId(Integer gdsToInventoryId) {
        this.gdsToInventoryId = gdsToInventoryId;
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
}
