package com.pooya.enums;

public enum FormState {

     VIEW(0,"view mode"),
     EDIT(1,"edit mode"),
     INSERT(2,"insert mode");

     private int value;
     private String desc;


    FormState(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
