package com.pooya.web.controller;

import com.pooya.entity.dto.data.GoodsAndUnitsDto;
import com.pooya.service.data.GoodsAndUnitService;
import com.pooya.service.service.GoodsService;
import com.pooya.web.Gazelle;
import com.pooya.web.model.BaseModel;
import com.pooya.web.model.GoodsModel;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class GoodsController extends BaseController implements Serializable{

    @Autowired
    private GoodsAndUnitService goodsAndUnitService;

    @Autowired
    private GoodsService goodsService;

    @Inject
    private GoodsModel goodsModel;

    public GoodsAndUnitService getGoodsAndUnitService() {
        return goodsAndUnitService;
    }

    public void setGoodsAndUnitService(GoodsAndUnitService goodsAndUnitService) {
        this.goodsAndUnitService = goodsAndUnitService;
    }

    public GoodsService getGoodsService() {
        return goodsService;
    }

    public void setGoodsService(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    public GoodsModel getGoodsModel() {
        return goodsModel;
    }

    public void setGoodsModel(GoodsModel goodsModel) {
        this.goodsModel = goodsModel;
    }

    @Override
    @PostConstruct
    public void init() {
        goodsModel.setGoodsAndUnitsDtos( goodsAndUnitService.findByFilter(goodsModel.makeMap()));
    }

    @Override
    public void deleteItem() {

        goodsModel.setGoodsAndUnitsDto((GoodsAndUnitsDto) goodsAndUnitService.findByFilter(goodsModel.makeMap()).get(0));
        goodsModel.setEntity();
        goodsService.removeItem(goodsModel.getGoods());
        goodsModel.setRecId(0);
        init();

    }


    public void navigate()
    {
        navigationUrl = "/pages/goodsDetail.xhtml?faces-redirect=true&recId="+goodsModel.getRecId()+"&formState=" + goodsModel.getFormState();
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.getApplication().getNavigationHandler().handleNavigation(facesContext,null,navigationUrl);
    }
}
