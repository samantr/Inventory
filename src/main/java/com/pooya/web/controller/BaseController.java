package com.pooya.web.controller;

import com.pooya.web.Gazelle;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;

public abstract class BaseController extends Gazelle {

    String navigationUrl;

    String getNavigationUrl() {
        return navigationUrl;
    }

    void setNavigationUrl(String navigationUrl) {
        this.navigationUrl = navigationUrl;
    }

    @PostConstruct
    public abstract void init();

    public abstract void deleteItem();

    public abstract void navigate();

}
