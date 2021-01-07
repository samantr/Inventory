package com.pooya.entity.entity;

import com.pooya.common.entity.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "goods_to_inventory")
public class GoodsToInventory extends BaseEntity{

    @Id
    @Column(name = "goods_to_inventory_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "gds_id")
    private Integer gdsId;

    @Column(name = "inventory_id")
    private Integer inventoryId;

    @ManyToOne
    @JoinColumn(name = "inventory_id", updatable = false, insertable = false)
    private Inventory inventory;

    @ManyToOne
    @JoinColumn(name = "gds_id", updatable = false, insertable = false)
    private Goods goods;

    @OneToMany
    private List<InventoryTransaction> inventoryTransactions;

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

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public List<InventoryTransaction> getInventoryTransactions() {
        return inventoryTransactions;
    }

    public void setInventoryTransactions(List<InventoryTransaction> inventoryTransactions) {
        this.inventoryTransactions = inventoryTransactions;
    }
}
