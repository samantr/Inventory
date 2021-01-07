package com.pooya.common.error;

import org.primefaces.PrimeFaces;
import org.primefaces.context.RequestContext;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CustomeException extends RuntimeException{

    private FacesMessage  fasesMsg;
    private String msg;
    private PrimeFaces primeFaces = PrimeFaces.current();
    private List<ErrorObject> errorObjectList = new ArrayList<ErrorObject>();

    public List<ErrorObject> getErrorObjectList() {
        return errorObjectList;
    }

    public void setErrorObjectList(List<ErrorObject> errorObjectList) {
        this.errorObjectList = errorObjectList;
    }

    public String getMsg() {
        return msg;
    }

    public void showErrors()
    {
        primeFaces.executeScript("PF('errDlg').show()");
    }


    public void addMessage(String message)
    {
        this.msg = message;
        fasesMsg = new FacesMessage(message);
        FacesContext facesContext = FacesContext.getCurrentInstance();
        if (facesContext != null)
            facesContext.addMessage(null,fasesMsg);
        else {
            ErrorObject errorObject = new ErrorObject();
            errorObject.setErrorCode(null);
            errorObject.setErrorCode(message);
            errorObjectList.add(errorObject);
        }
    }

}
