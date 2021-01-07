package com.pooya.dao.dao.impl;

import com.pooya.common.dao.impl.BaseDaoImpl;
import com.pooya.dao.dao.QuantityUnitDao;
import com.pooya.entity.dto.QQuantityUnitDto;
import com.pooya.entity.dto.QuantityUnitDto;
import com.pooya.entity.entity.QQuantityUnit;
import com.pooya.entity.entity.QuantityUnit;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Map;


@Repository
public class QuantityUnitDaoImpl extends BaseDaoImpl<QuantityUnit> implements QuantityUnitDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<QuantityUnitDto> find(Map<String, Object> map) {

        JPAQuery<QuantityUnitDto> query = new  JPAQuery<QuantityUnitDto>(em);
        QQuantityUnit qQuantityUnit = QQuantityUnit.quantityUnit;
        BooleanBuilder builder = new BooleanBuilder();

        if (map != null) {
            if (map.get("id")!=null)
                builder.and(qQuantityUnit.id.eq(Integer.parseInt(map.get("id").toString())));

            if (map.get("code")!=null)
                builder.and(qQuantityUnit.code.contains(map.get("code").toString()));

            if (map.get("name")!=null)
                builder.and(qQuantityUnit.name.contains(map.get("name").toString()));
        }

        query.from(qQuantityUnit).where(builder).select(new QQuantityUnitDto(qQuantityUnit.id,qQuantityUnit.code,qQuantityUnit.name));

        return query.fetch();
    }
}
