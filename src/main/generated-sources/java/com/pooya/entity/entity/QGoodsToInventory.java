package com.pooya.entity.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QGoodsToInventory is a Querydsl query type for GoodsToInventory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QGoodsToInventory extends EntityPathBase<GoodsToInventory> {

    private static final long serialVersionUID = 400257358L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QGoodsToInventory goodsToInventory = new QGoodsToInventory("goodsToInventory");

    public final NumberPath<Integer> gdsId = createNumber("gdsId", Integer.class);

    public final QGoods goods;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final QInventory inventory;

    public final NumberPath<Integer> inventoryId = createNumber("inventoryId", Integer.class);

    public final ListPath<InventoryTransaction, QInventoryTransaction> inventoryTransactions = this.<InventoryTransaction, QInventoryTransaction>createList("inventoryTransactions", InventoryTransaction.class, QInventoryTransaction.class, PathInits.DIRECT2);

    public QGoodsToInventory(String variable) {
        this(GoodsToInventory.class, forVariable(variable), INITS);
    }

    public QGoodsToInventory(Path<? extends GoodsToInventory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QGoodsToInventory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QGoodsToInventory(PathMetadata metadata, PathInits inits) {
        this(GoodsToInventory.class, metadata, inits);
    }

    public QGoodsToInventory(Class<? extends GoodsToInventory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.goods = inits.isInitialized("goods") ? new QGoods(forProperty("goods"), inits.get("goods")) : null;
        this.inventory = inits.isInitialized("inventory") ? new QInventory(forProperty("inventory")) : null;
    }

}

