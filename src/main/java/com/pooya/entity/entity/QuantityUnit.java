package com.pooya.entity.entity;

import com.pooya.common.entity.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "quantity_unit")
public class QuantityUnit extends BaseEntity {

    @Id
    @Column(name = "qnt_unt_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String code;
    private String name;

    //@OneToMany
   // private List<Goods> goodsList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  /*  public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }
*/
}
