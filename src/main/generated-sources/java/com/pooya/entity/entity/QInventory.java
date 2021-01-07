package com.pooya.entity.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QInventory is a Querydsl query type for Inventory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QInventory extends EntityPathBase<Inventory> {

    private static final long serialVersionUID = 1036658009L;

    public static final QInventory inventory = new QInventory("inventory");

    public final StringPath code = createString("code");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public QInventory(String variable) {
        super(Inventory.class, forVariable(variable));
    }

    public QInventory(Path<? extends Inventory> path) {
        super(path.getType(), path.getMetadata());
    }

    public QInventory(PathMetadata metadata) {
        super(Inventory.class, metadata);
    }

}

