package com.pooya.web.controller;

import com.pooya.web.Gazelle;

import javax.faces.context.FacesContext;

public abstract class BaseDetail extends Gazelle {

    boolean disabled;
    String navigationUrl;

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public String getNavigationUrl() {
        return navigationUrl;
    }

    public void setNavigationUrl(String navigationUrl) {
        this.navigationUrl = navigationUrl;
    }

    public abstract void initParameter();
    public abstract void save() throws Exception;
    public abstract void navigate();


}
