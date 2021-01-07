package com.pooya.web.controller;

import com.pooya.entity.dto.QuantityUnitDto;
import com.pooya.service.service.QuantityUnitService;
import com.pooya.web.Gazelle;
import com.pooya.web.model.QuantityUnitModel;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class QuantityUnitController extends BaseController implements Serializable {

    @Autowired
    private QuantityUnitService quantityUnitService;

    @Inject
    private QuantityUnitModel quantityUnitModel;

    private final static String formName = "quantityUnitForm.xhtml";

    public static String getFormName() {
        return formName;
    }

    public QuantityUnitController() {
        System.out.println("ssss");
    }

    @Override
    @PostConstruct
    public void init()
    {
        quantityUnitModel.setQuantityUnitDtos(quantityUnitService.find(quantityUnitModel.makeMap()));
    }


    public QuantityUnitService getQuantityUnitService() {
        return quantityUnitService;
    }

    public void setQuantityUnitService(QuantityUnitService quantityUnitService) {
        this.quantityUnitService = quantityUnitService;
    }

    public QuantityUnitModel getQuantityUnitModel() {
        return quantityUnitModel;
    }


    public void setQuantityUnitModel(QuantityUnitModel quantityUnitModel) {
        this.quantityUnitModel = quantityUnitModel;
    }

    @Override
    public void deleteItem()
    {
        quantityUnitModel.setQuantityUnitDto((QuantityUnitDto) quantityUnitService.find(quantityUnitModel.makeMap()).get(0));
        quantityUnitModel.setEntity();
        quantityUnitService.removeItem(quantityUnitModel.getQuantityUnit());
        quantityUnitModel.setRecId(0);
        init();
    }

    public void navigate()
    {
        navigationUrl = "/pages/quantityUnitDetail.xhtml?faces-redirect=true&recId="+quantityUnitModel.getRecId()+"&formState=" + quantityUnitModel.getFormState();

        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.getApplication().getNavigationHandler().handleNavigation(facesContext,null,navigationUrl);
    }
}
