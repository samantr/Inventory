package com.pooya.dao.data.impl;

import com.pooya.dao.data.GoodsInInventoryDataDao;
import com.pooya.entity.dto.data.GoodsInInventoryDataDto;
import com.pooya.entity.dto.data.QGoodsInInventoryDataDto;
import com.pooya.entity.entity.QGoods;
import com.pooya.entity.entity.QGoodsToInventory;
import com.pooya.entity.entity.QInventory;
import com.pooya.entity.entity.QQuantityUnit;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Map;

@Repository
public class GoodsInInventoryDataDaoImpl implements GoodsInInventoryDataDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public List<GoodsInInventoryDataDto> findAll(Map<String, Object> map) {

        JPAQuery<GoodsInInventoryDataDto> query = new JPAQuery<GoodsInInventoryDataDto>(em);

        QGoodsToInventory goodsToInventory = QGoodsToInventory.goodsToInventory;
        QGoods goods = QGoods.goods;
        QInventory inventory = QInventory.inventory;
        QQuantityUnit quantityUnit = QQuantityUnit.quantityUnit;

        BooleanBuilder builder = null;

        if(map.get("goodsCode") != null)
            builder.and(goods.code.contains(map.get("goodsCode").toString()));

        if(map.get("goodsName") != null)
            builder.and(goods.code.contains(map.get("goodsName").toString()));

        if(map.get("inventoryCode") != null)
            builder.and(goods.code.contains(map.get("inventoryCode").toString()));

        if(map.get("inventoryName") != null)
            builder.and(goods.code.contains(map.get("inventoryName").toString()));



        return query.from(goodsToInventory)
                .innerJoin(goodsToInventory.goods,goods)
                .innerJoin(goodsToInventory.inventory,inventory)
                .innerJoin(goods.quantityUnit,quantityUnit)
                .where(builder)
                .select(new QGoodsInInventoryDataDto(goodsToInventory.id,
                        goods.id,
                        goods.quantityUnitId,
                        goods.code,
                        goods.name,
                        inventory.id,
                        inventory.code,
                        inventory.name,
                        quantityUnit.code,
                        quantityUnit.name))
                .fetch();
    }
}
