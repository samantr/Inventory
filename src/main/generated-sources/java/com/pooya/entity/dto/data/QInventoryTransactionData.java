package com.pooya.entity.dto.data;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

import com.querydsl.core.types.Expression;

/**
 * com.pooya.entity.dto.data.QInventoryTransactionData is a Querydsl Projection type for InventoryTransactionData
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QInventoryTransactionData extends ConstructorExpression<InventoryTransactionData> {

    private static final long serialVersionUID = 1757963609L;

    public QInventoryTransactionData(Expression<?> expression) {
        super(InventoryTransactionData.class, new Class<?>[]{Expression.class}, expression);
    }

    public QInventoryTransactionData(Expression<Integer> id, Expression<Integer> goodsId, Expression<Integer> goodsQuantityUnitId, Expression<String> goodsCode, Expression<String> goodsName, Expression<Integer> inventoryId, Expression<String> inventoryCode, Expression<String> inventoryName, Expression<String> quantityUnitCode, Expression<String> quantityUnitName, Expression<Float> amount, Expression<Boolean> transactionType, Expression<? extends java.util.Date> transactionTime, Expression<Float> remainingAmount) {
        super(InventoryTransactionData.class, new Class<?>[]{int.class, int.class, int.class, String.class, String.class, int.class, String.class, String.class, String.class, String.class, float.class, boolean.class, java.util.Date.class, float.class}, id, goodsId, goodsQuantityUnitId, goodsCode, goodsName, inventoryId, inventoryCode, inventoryName, quantityUnitCode, quantityUnitName, amount, transactionType, transactionTime, remainingAmount);
    }

    public QInventoryTransactionData(SimpleExpression<? extends com.querydsl.jpa.impl.JPAQuery<Float>> query) {
        super(InventoryTransactionData.class, new Class<?>[]{com.querydsl.jpa.impl.JPAQuery.class}, query);
    }

    public QInventoryTransactionData(Expression<Integer> gdsToInventory, Expression<Float> amount, Expression<Boolean> transactionType, Expression<? extends java.util.Date> transactionTime) {
        super(InventoryTransactionData.class, new Class<?>[]{int.class, float.class, boolean.class, java.util.Date.class}, gdsToInventory, amount, transactionType, transactionTime);
    }

    public QInventoryTransactionData(NumberExpression<Float> remainingAmount) {
        super(InventoryTransactionData.class, new Class<?>[]{float.class}, remainingAmount);
    }

}

