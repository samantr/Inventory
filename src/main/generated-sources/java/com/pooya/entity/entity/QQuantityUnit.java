package com.pooya.entity.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QQuantityUnit is a Querydsl query type for QuantityUnit
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QQuantityUnit extends EntityPathBase<QuantityUnit> {

    private static final long serialVersionUID = 895388562L;

    public static final QQuantityUnit quantityUnit = new QQuantityUnit("quantityUnit");

    public final StringPath code = createString("code");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public QQuantityUnit(String variable) {
        super(QuantityUnit.class, forVariable(variable));
    }

    public QQuantityUnit(Path<? extends QuantityUnit> path) {
        super(path.getType(), path.getMetadata());
    }

    public QQuantityUnit(PathMetadata metadata) {
        super(QuantityUnit.class, metadata);
    }

}

