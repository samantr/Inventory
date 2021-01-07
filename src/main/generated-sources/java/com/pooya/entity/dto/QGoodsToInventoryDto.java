package com.pooya.entity.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * com.pooya.entity.dto.QGoodsToInventoryDto is a Querydsl Projection type for GoodsToInventoryDto
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QGoodsToInventoryDto extends ConstructorExpression<GoodsToInventoryDto> {

    private static final long serialVersionUID = -985632291L;

    public QGoodsToInventoryDto(com.querydsl.core.types.Expression<Integer> id, com.querydsl.core.types.Expression<Integer> gdsId, com.querydsl.core.types.Expression<Integer> inventoryId) {
        super(GoodsToInventoryDto.class, new Class<?>[]{int.class, int.class, int.class}, id, gdsId, inventoryId);
    }

}

