package com.pooya.dao.data.impl;

import com.pooya.common.data.Identifiable;
import com.pooya.dao.data.GoodsAndUnitsDao;
import com.pooya.entity.dto.data.GoodsAndUnitsDto;
import com.pooya.entity.dto.data.QGoodsAndUnitsDto;
import com.pooya.entity.entity.QGoods;
import com.pooya.entity.entity.QQuantityUnit;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Map;

@Repository
public class GoodsAndUnitsDaoImpl implements GoodsAndUnitsDao {

    @PersistenceContext
    EntityManager em;


    public  List<GoodsAndUnitsDto> findByFilter(Map<String, Object> params)
    {
        JPAQuery<GoodsAndUnitsDto> query = new JPAQuery<GoodsAndUnitsDto>(em);
        QQuantityUnit qQuantityUnit = QQuantityUnit.quantityUnit;
        QGoods qGoods = QGoods.goods;

        BooleanBuilder builder = new BooleanBuilder();

        if(params!=null)
        {
            if (params.get("qId")!=null)
                builder.and(qGoods.quantityUnitId.eq((Integer)params.get("qId")));
            if (params.get("gId")!=null)
                builder.and(qGoods.id.eq((Integer)params.get("gId")));
            if (params.get("qCode") != null)
                builder.and(qQuantityUnit.code.contains(params.get("qcode").toString()));
            if (params.get("qName") != null)
                builder.and(qQuantityUnit.name.contains(params.get("qName").toString()));
            if (params.get("gCode") != null)
                builder.and(qGoods.code.contains(params.get("gCode").toString()));
            if (params.get("gName") != null)
                builder.and(qGoods.name.contains(params.get("gName").toString()));

        }


        return query.from(qGoods).innerJoin(qGoods.quantityUnit, qQuantityUnit).where(builder).select(new QGoodsAndUnitsDto(qQuantityUnit.id, qQuantityUnit.code, qQuantityUnit.name,qGoods.id, qGoods.code, qGoods.name)).fetch();
    }

}
