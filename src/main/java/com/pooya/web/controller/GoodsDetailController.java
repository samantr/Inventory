package com.pooya.web.controller;

import com.pooya.entity.dto.data.GoodsAndUnitsDto;
import com.pooya.enums.FormState;
import com.pooya.service.data.GoodsAndUnitService;
import com.pooya.service.service.GoodsService;
import com.pooya.web.model.GoodsModel;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class GoodsDetailController extends BaseDetail implements Serializable {
    
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
    public void initParameter() {

        goodsModel.setGoodsAndUnitsDto ((GoodsAndUnitsDto) goodsAndUnitService.findByFilter(goodsModel.makeMap()).get(0));
        if(goodsModel.getRecId() == 0 || goodsModel.getRecId() == null)
        {
            goodsModel.clearDto();
            setDisabled(false);
        }else
        {
            if(goodsModel.getFormState() == FormState.EDIT)
                setDisabled(false);
            else
                setDisabled(true);
        }

    }

    @Override
    public void save() throws Exception {
        goodsModel.setEntity();

        if(goodsModel.getRecId()==0)
                goodsModel.setGoods(goodsService.persistNew(goodsModel.getGoods()));
        else
            goodsModel.setGoods(goodsService.merge(goodsModel.getGoods()));

        goodsModel.setDto();
        navigate();
    }


    @Override
    public void navigate() {
        navigationUrl = "/pages/goodsAndUnitIndex.xhtml?faces-redirect=true";
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.getApplication().getNavigationHandler().handleNavigation(facesContext,null,navigationUrl);
    }

    public void fillUnit()
    {
        goodsModel.getGoodsAndUnitsDto().setqId(goodsModel.getQuantityUnitDto().getId());
        goodsModel.getGoodsAndUnitsDto().setqName(goodsModel.getQuantityUnitDto().getName());
    }
}
