package com.pooya.web.controller;

import com.pooya.common.error.CustomeException;
import com.pooya.entity.dto.QuantityUnitDto;
import com.pooya.enums.FormState;
import com.pooya.service.service.QuantityUnitService;
import com.pooya.web.model.QuantityUnitModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class QuantityUnitDetailController extends BaseDetail implements Serializable {

    final static Logger logger = LoggerFactory.getLogger(QuantityUnitDetailController.class);

    @Autowired
    private QuantityUnitService quantityUnitService;

    @Inject
    private QuantityUnitModel quantityUnitModel;

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


    public void initParameter(){

        quantityUnitModel.setQuantityUnitDto ((QuantityUnitDto)quantityUnitService.find(quantityUnitModel.makeMap()).get(0));
        if(quantityUnitModel.getRecId() == 0)
        {
            setDisabled(false);
            quantityUnitModel.clearDto();
        }else
        {
            if(quantityUnitModel.getFormState() == FormState.EDIT)
                setDisabled(false);
            else
                setDisabled(true);
        }
    }


    public void save()
    {
        try
        {
            quantityUnitModel.setEntity();
            if(quantityUnitModel.getRecId()==0)
                quantityUnitModel.setQuantityUnit(quantityUnitService.persistNew(quantityUnitModel.getQuantityUnit()));
            else
                quantityUnitModel.setQuantityUnit(quantityUnitService.merge(quantityUnitModel.getQuantityUnit()));

            quantityUnitModel.setDto();
            navigate();

        }catch (CustomeException cex)
        {
            logger.error(cex.getMessage(),cex);
            cex.showErrors();
        }catch (Exception e)
        {
            logger.error(e.getMessage(),e);
            CustomeException cex = new CustomeException();
            cex.addMessage("Unkown Error");
            cex.showErrors();
        }

     }


    public void navigate()
    {
        navigationUrl = "/pages/quantityUnitIndex.xhtml?faces-redirect=true";

        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.getApplication().getNavigationHandler().handleNavigation(facesContext,null,navigationUrl);
    }


}
