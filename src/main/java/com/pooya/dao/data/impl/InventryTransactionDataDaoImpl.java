package com.pooya.dao.data.impl;

import com.pooya.common.dao.impl.BaseDaoImpl;
import com.pooya.dao.data.InventoryTransactionDataDao;
import com.pooya.entity.dto.data.InventoryTransactionData;
import com.pooya.entity.dto.data.QGoodsInInventoryDataDto;
import com.pooya.entity.dto.data.QInventoryTransactionData;
import com.pooya.entity.entity.*;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.QueryFactory;
import com.querydsl.core.Tuple;
import com.querydsl.core.types.dsl.*;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.sql.SQLExpressions;
import com.querydsl.sql.WindowFunction;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.beans.Expression;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.querydsl.core.group.GroupBy.groupBy;

@Repository
public class InventryTransactionDataDaoImpl implements InventoryTransactionDataDao {

    @PersistenceContext
    EntityManager em;


    public List<InventoryTransactionData> fetchInventoryTransactions(Integer id) {
        JPAQuery<InventoryTransactionData> query = new JPAQuery<InventoryTransactionData>(em);
        List<InventoryTransactionData> results;
        QInventoryTransaction qInventoryTransaction = QInventoryTransaction.inventoryTransaction;
        QInventory qInventory = QInventory.inventory;
        QGoods qGoods = QGoods.goods;
        QQuantityUnit qQuantityUnit = QQuantityUnit.quantityUnit;
        QGoodsToInventory qGoodsToInventory = QGoodsToInventory.goodsToInventory;

        BooleanBuilder builder = new BooleanBuilder();
        builder.and(qInventory.id.eq(id));

        SimpleExpression<Float> remAmount = SQLExpressions.sum(qInventoryTransaction.amount)
                .over()
                .partitionBy(qInventoryTransaction.gdsToInventoryId)
                .orderBy(qInventoryTransaction.transactionTime.asc())
                .as("remAmount");
        com.querydsl.sql.WindowFunction function ;

        results = query.from(qInventoryTransaction)
                .innerJoin(qInventoryTransaction.goodsToInventory,qGoodsToInventory)
                .innerJoin(qGoodsToInventory.inventory, qInventory)
                .innerJoin(qGoodsToInventory.goods, qGoods)
                .innerJoin(qGoods.quantityUnit, qQuantityUnit)
                .where(builder)
                .select(makeQInventoryTransactionData( qInventoryTransaction, qInventory, qGoods, qQuantityUnit, remAmount)).fetch();


        return results;

    }


    public List<InventoryTransactionData> fetchAmounts()
    {
       JPAQuery<InventoryTransactionData> query = new JPAQuery<InventoryTransactionData>(em);
        List<InventoryTransactionData> results;



        QInventoryTransaction qInventoryTransaction = QInventoryTransaction.inventoryTransaction;
        results = query.from(qInventoryTransaction)
                .select((new QInventoryTransactionData(getRemain(qInventoryTransaction))) ).fetch();



        return results;
    }


    public List<InventoryTransactionData> fetchAmounts(int i)
    {
        JPAQuery<?> query1 = new JPAQuery<>(em);
        List<Tuple> result;
        QInventoryTransaction qInventoryTransaction = QInventoryTransaction.inventoryTransaction;

        result = query1.from(qInventoryTransaction)
                .select(new QInventoryTransactionData(qInventoryTransaction.gdsToInventoryId,qInventoryTransaction.amount,qInventoryTransaction.transactionType,qInventoryTransaction.transactionTime) ,getRemain1(qInventoryTransaction)).fetch();
        return null;
    }


    private com.querydsl.core.types.Expression<Float> getRemain(QInventoryTransaction qInventoryTransaction)
    {
        JPAQuery<Float> query = new JPAQuery<Float>(em);

        QInventoryTransaction qInventoryTransaction1 = new QInventoryTransaction("invTrn");

        query.from(qInventoryTransaction1)
                .where(qInventoryTransaction1.transactionTime.loe(qInventoryTransaction.transactionTime)
                        .and(qInventoryTransaction1.gdsToInventoryId.eq(qInventoryTransaction.gdsToInventoryId)))
                .groupBy(qInventoryTransaction1.goodsToInventory)
                .select(qInventoryTransaction1.amount.sum());
        com.querydsl.core.types.Expression<Float> expression = query;
        return expression;
    }

    private com.querydsl.jpa.impl.JPAQuery<Float> getRemain1(QInventoryTransaction qInventoryTransaction)
    {
        JPAQuery<Float> query = new JPAQuery<Float>(em);

        QInventoryTransaction qInventoryTransaction1 = new QInventoryTransaction("invTrn");

        query.from(qInventoryTransaction1)
                .where(qInventoryTransaction1.transactionTime.loe(qInventoryTransaction.transactionTime)
                        .and(qInventoryTransaction1.gdsToInventoryId.eq(qInventoryTransaction.gdsToInventoryId)))
                .groupBy(qInventoryTransaction1.goodsToInventory)
                .select(qInventoryTransaction1.amount.sum());
        return query;
    }

    private QInventoryTransactionData makeQInventoryTransactionData(QInventoryTransaction qInventoryTransaction,QInventory qInventory,QGoods qGoods,QQuantityUnit qQuantityUnit,SimpleExpression<Float> remAmount){
        return new QInventoryTransactionData(
                qInventoryTransaction.id,
                qGoods.id,
                qGoods.quantityUnitId,
                qGoods.code,
                qGoods.name,
                qInventory.id,
                qInventory.code,
                qInventory.name,
                qQuantityUnit.code,
                qQuantityUnit.name,
                qInventoryTransaction.amount,
                qInventoryTransaction.transactionType,
                qInventoryTransaction.transactionTime,
                remAmount);
    }


}
