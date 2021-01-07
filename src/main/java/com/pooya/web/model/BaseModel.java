package com.pooya.web.model;

import com.pooya.common.data.Identifiable;
import com.pooya.enums.FormState;

import java.util.Map;

public abstract class BaseModel {

    Map<String,Object> map;
    FormState formState = FormState.INSERT;
    Integer recId = 0;

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public FormState getFormState() {
        return formState;
    }

    public void setFormState(FormState formState) {
        this.formState = formState;
    }

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public abstract void setEntity();
    public abstract void setDto();
    public abstract Map makeMap();

    public abstract void clearDto();

}
