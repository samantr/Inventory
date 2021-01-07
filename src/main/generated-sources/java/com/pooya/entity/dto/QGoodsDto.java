package com.pooya.entity.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * com.pooya.entity.dto.QGoodsDto is a Querydsl Projection type for GoodsDto
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QGoodsDto extends ConstructorExpression<GoodsDto> {

    private static final long serialVersionUID = -306671008L;

    public QGoodsDto(com.querydsl.core.types.Expression<Integer> id, com.querydsl.core.types.Expression<Integer> quantityUnitId, com.querydsl.core.types.Expression<String> code, com.querydsl.core.types.Expression<String> name) {
        super(GoodsDto.class, new Class<?>[]{int.class, int.class, String.class, String.class}, id, quantityUnitId, code, name);
    }

}

