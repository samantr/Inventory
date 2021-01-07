package com.pooya.entity.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QInventoryTransaction is a Querydsl query type for InventoryTransaction
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QInventoryTransaction extends EntityPathBase<InventoryTransaction> {

    private static final long serialVersionUID = 1554625477L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QInventoryTransaction inventoryTransaction = new QInventoryTransaction("inventoryTransaction");

    public final NumberPath<Float> amount = createNumber("amount", Float.class);

    public final NumberPath<Integer> gdsToInventoryId = createNumber("gdsToInventoryId", Integer.class);

    public final QGoodsToInventory goodsToInventory;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final DateTimePath<java.util.Date> transactionTime = createDateTime("transactionTime", java.util.Date.class);

    public final BooleanPath transactionType = createBoolean("transactionType");

    public QInventoryTransaction(String variable) {
        this(InventoryTransaction.class, forVariable(variable), INITS);
    }

    public QInventoryTransaction(Path<? extends InventoryTransaction> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QInventoryTransaction(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QInventoryTransaction(PathMetadata metadata, PathInits inits) {
        this(InventoryTransaction.class, metadata, inits);
    }

    public QInventoryTransaction(Class<? extends InventoryTransaction> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.goodsToInventory = inits.isInitialized("goodsToInventory") ? new QGoodsToInventory(forProperty("goodsToInventory"), inits.get("goodsToInventory")) : null;
    }

}

