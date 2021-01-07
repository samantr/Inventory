package com.pooya.entity.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * com.pooya.entity.dto.QInventoryTransactionDto is a Querydsl Projection type for InventoryTransactionDto
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QInventoryTransactionDto extends ConstructorExpression<InventoryTransactionDto> {

    private static final long serialVersionUID = 1641353734L;

    public QInventoryTransactionDto(com.querydsl.core.types.Expression<Integer> id, com.querydsl.core.types.Expression<Integer> gdsToInventoryId, com.querydsl.core.types.Expression<Float> amount, com.querydsl.core.types.Expression<Boolean> transactionType, com.querydsl.core.types.Expression<? extends java.util.Date> TransactionTime) {
        super(InventoryTransactionDto.class, new Class<?>[]{int.class, int.class, float.class, boolean.class, java.util.Date.class}, id, gdsToInventoryId, amount, transactionType, TransactionTime);
    }

}

