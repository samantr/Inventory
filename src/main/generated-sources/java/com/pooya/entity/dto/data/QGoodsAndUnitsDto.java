package com.pooya.entity.dto.data;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * com.pooya.entity.dto.data.QGoodsAndUnitsDto is a Querydsl Projection type for GoodsAndUnitsDto
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QGoodsAndUnitsDto extends ConstructorExpression<GoodsAndUnitsDto> {

    private static final long serialVersionUID = 788115806L;

    public QGoodsAndUnitsDto(com.querydsl.core.types.Expression<Integer> qId, com.querydsl.core.types.Expression<String> qCode, com.querydsl.core.types.Expression<String> qName, com.querydsl.core.types.Expression<Integer> gId, com.querydsl.core.types.Expression<String> gCode, com.querydsl.core.types.Expression<String> gName) {
        super(GoodsAndUnitsDto.class, new Class<?>[]{int.class, String.class, String.class, int.class, String.class, String.class}, qId, qCode, qName, gId, gCode, gName);
    }

}

