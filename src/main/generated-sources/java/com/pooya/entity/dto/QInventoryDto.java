package com.pooya.entity.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * com.pooya.entity.dto.QInventoryDto is a Querydsl Projection type for InventoryDto
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QInventoryDto extends ConstructorExpression<InventoryDto> {

    private static final long serialVersionUID = -120793318L;

    public QInventoryDto(com.querydsl.core.types.Expression<Integer> id, com.querydsl.core.types.Expression<String> code, com.querydsl.core.types.Expression<String> name) {
        super(InventoryDto.class, new Class<?>[]{int.class, String.class, String.class}, id, code, name);
    }

}

