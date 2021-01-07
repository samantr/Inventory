package com.pooya.entity.dto.data;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * com.pooya.entity.dto.data.QGoodsInInventoryDataDto is a Querydsl Projection type for GoodsInInventoryDataDto
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QGoodsInInventoryDataDto extends ConstructorExpression<GoodsInInventoryDataDto> {

    private static final long serialVersionUID = 262748615L;

    public QGoodsInInventoryDataDto(com.querydsl.core.types.Expression<Integer> id, com.querydsl.core.types.Expression<Integer> goodsId, com.querydsl.core.types.Expression<Integer> goodsQuantityUnitId, com.querydsl.core.types.Expression<String> goodsCode, com.querydsl.core.types.Expression<String> goodsName, com.querydsl.core.types.Expression<Integer> inventoryId, com.querydsl.core.types.Expression<String> inventoryCode, com.querydsl.core.types.Expression<String> inventoryName, com.querydsl.core.types.Expression<String> quantityUnitCode, com.querydsl.core.types.Expression<String> quantityUnitName) {
        super(GoodsInInventoryDataDto.class, new Class<?>[]{int.class, int.class, int.class, String.class, String.class, int.class, String.class, String.class, String.class, String.class}, id, goodsId, goodsQuantityUnitId, goodsCode, goodsName, inventoryId, inventoryCode, inventoryName, quantityUnitCode, quantityUnitName);
    }

}

