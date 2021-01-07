package com.pooya.web.model;

import com.pooya.entity.dto.QuantityUnitDto;
import com.pooya.entity.dto.data.GoodsAndUnitsDto;
import com.pooya.entity.entity.Goods;
import com.pooya.enums.FormState;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.text.Normalizer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Named
@ViewScoped
public class GoodsModel extends BaseModel implements Serializable  {

    private Integer qId;
    private String qCode;
    private String qName;

    private Integer gId;
    private String gCode;
    private String gName;

    private Goods goods;

    private GoodsAndUnitsDto goodsAndUnitsDto;

    private List<GoodsAndUnitsDto> goodsAndUnitsDtos;
    private QuantityUnitDto quantityUnitDto;
    private List<QuantityUnitDto> filterdQuantityUnitDtos;

    public List<QuantityUnitDto> getFilterdQuantityUnitDtos() {
        return filterdQuantityUnitDtos;
    }

    public void setFilterdQuantityUnitDtos(List<QuantityUnitDto> filterdQuantityUnitDtos) {
        this.filterdQuantityUnitDtos = filterdQuantityUnitDtos;
    }

    public QuantityUnitDto getQuantityUnitDto() {
        return quantityUnitDto;
    }

    public void setQuantityUnitDto(QuantityUnitDto quantityUnitDto) {
        this.quantityUnitDto = quantityUnitDto;
    }

    public List<GoodsAndUnitsDto> getGoodsAndUnitsDtos() {
        return goodsAndUnitsDtos;
    }

    public void setGoodsAndUnitsDtos(List<GoodsAndUnitsDto> goodsAndUnitsDtos) {
        this.goodsAndUnitsDtos = goodsAndUnitsDtos;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public GoodsAndUnitsDto getGoodsAndUnitsDto() {
        return goodsAndUnitsDto;
    }

    public void setGoodsAndUnitsDto(GoodsAndUnitsDto goodsAndUnitsDto) {
        this.goodsAndUnitsDto = goodsAndUnitsDto;
    }

    public Integer getqId() {
        return qId;
    }

    public void setqId(Integer qId) {
        this.qId = qId;
    }

    public String getqCode() {
        return qCode;
    }

    public void setqCode(String qCode) {
        this.qCode = qCode;
    }

    public String getqName() {
        return qName;
    }

    public void setqName(String qName) {
        this.qName = qName;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getgCode() {
        return gCode;
    }

    public void setgCode(String gCode) {
        this.gCode = gCode;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }


    @Override
    public void setEntity() {
        goods = new Goods();
        goods.setId(recId==0 ? null : recId);
        goods.setCode(goodsAndUnitsDto.getgCode());
        goods.setName(goodsAndUnitsDto.getgName());
        goods.setQuantityUnitId(goodsAndUnitsDto.getqId());
    }

    @Override
    public void setDto() {

        goodsAndUnitsDto.setgId(goods.getId());
        goodsAndUnitsDto.setgCode(goods.getCode());
        goodsAndUnitsDto.setgName(goods.getName());
        goodsAndUnitsDto.setqId(goods.getQuantityUnitId());
    }

    public Map makeMap(){

        map = new HashMap<>();
        map.put( "qId",qId);
        map.put( "qCode",qCode);
        map.put( "qName",qName);
        map.put( "gId", recId == 0 ? null : recId);
        map.put( "gCode",gCode);
        map.put( "gName",gName);

        return map;
    }

    public void clearDto()
    {
/*        goodsAndUnitsDto.setqName(null);
        goodsAndUnitsDto.setqId(null);
        goodsAndUnitsDto.setqCode(null);
        goodsAndUnitsDto.setgId(null);
        goodsAndUnitsDto.setgName(null);
        goodsAndUnitsDto.setgCode(null);*/

        goodsAndUnitsDto = new GoodsAndUnitsDto();
    }
}
