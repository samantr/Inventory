package com.pooya.entity.entity;

import com.pooya.common.entity.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "inventory_transaction")
public class InventoryTransaction extends BaseEntity {

    @Id
    @Column(name = "transactoin_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "goods_to_inventory_id")
    private Integer gdsToInventoryId;
    private float amount;

    @Column(name = "transaction_type")
    private boolean transactionType;

    @Column(name = "transaction_time")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date transactionTime;



    @ManyToOne
    @JoinColumn(name = "goods_to_inventory_id", insertable = false, updatable = false)
    private GoodsToInventory goodsToInventory;

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

    public GoodsToInventory getGoodsToInventory() {
        return goodsToInventory;
    }

    public void setGoodsToInventory(GoodsToInventory goodsToInventory) {
        this.goodsToInventory = goodsToInventory;
    }

    public Date getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(Date transactionTime) {
        this.transactionTime = transactionTime;
    }
}
