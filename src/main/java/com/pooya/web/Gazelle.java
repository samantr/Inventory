package com.pooya.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.Assert;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Set;


public class Gazelle {
    public Gazelle() {
        processInjectionBasedOnCurrentContext(this);
    }

    public static void processInjectionBasedOnCurrentContext(Object target) {
        Assert.notNull(target, "Target object must not be null");
        WebApplicationContext cc = ContextLoader.getCurrentWebApplicationContext();
        AutowiredAnnotationBeanPostProcessor bpp = new AutowiredAnnotationBeanPostProcessor();
        Set<Class<? extends Annotation>> annotationsToScan = new HashSet<>();
        annotationsToScan.add(Autowired.class);
        annotationsToScan.add(Value.class);
        bpp.setAutowiredAnnotationTypes(annotationsToScan);
        bpp.setBeanFactory(cc.getAutowireCapableBeanFactory());
        bpp.processInjection(target);
    }
}