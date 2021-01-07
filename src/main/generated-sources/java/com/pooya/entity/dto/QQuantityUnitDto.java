package com.pooya.entity.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * com.pooya.entity.dto.QQuantityUnitDto is a Querydsl Projection type for QuantityUnitDto
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QQuantityUnitDto extends ConstructorExpression<QuantityUnitDto> {

    private static final long serialVersionUID = 1733097241L;

    public QQuantityUnitDto(com.querydsl.core.types.Expression<Integer> id, com.querydsl.core.types.Expression<String> code, com.querydsl.core.types.Expression<String> name) {
        super(QuantityUnitDto.class, new Class<?>[]{int.class, String.class, String.class}, id, code, name);
    }

}

