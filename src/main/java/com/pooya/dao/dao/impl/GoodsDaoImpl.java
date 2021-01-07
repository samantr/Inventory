package com.pooya.dao.dao.impl;

import com.pooya.common.dao.impl.BaseDaoImpl;
import com.pooya.dao.dao.GoodsDao;
import com.pooya.entity.dto.GoodsDto;
import com.pooya.entity.dto.QGoodsDto;
import com.pooya.entity.entity.Goods;
import com.pooya.entity.entity.QGoods;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Map;

@Repository
public class GoodsDaoImpl extends BaseDaoImpl<Goods> implements GoodsDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<GoodsDto> findGoodsList(Map<String, Object> map) {

        JPAQuery<QGoodsDto> qGoodsDtoJPAQuery = new JPAQuery<QGoodsDto>();
        QGoods qGoods = QGoods.goods;

        BooleanBuilder builder = new BooleanBuilder();


        return null;
    }
}
