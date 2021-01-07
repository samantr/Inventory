package com.pooya.entity.dto.data;

import com.pooya.common.data.Identifiable;
import com.querydsl.core.annotations.QueryProjection;

public class GoodsAndUnitsDto implements Identifiable{

    private Integer qId;
    private String qCode;
    private String qName;

    private Integer gId;
    private String gCode;
    private String gName;

    @QueryProjection
    public GoodsAndUnitsDto(Integer qId ,String qCode, String qName, Integer gId, String gCode, String gName) {
        this.qId = qId;
        this.qCode = qCode;
        this.qName = qName;
        this.gId = gId;
        this.gCode = gCode;
        this.gName = gName;
    }

    public GoodsAndUnitsDto() {
    }

    public Integer getqId() {
        return qId;
    }

    public void setqId(Integer qId) {
        this.qId = qId;
    }

    public String getqCode() {
        return qCode;
    }

    public void setqCode(String qCode) {
        this.qCode = qCode;
    }

    public String getqName() {
        return qName;
    }

    public void setqName(String qName) {
        this.qName = qName;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getgCode() {
        return gCode;
    }

    public void setgCode(String gCode) {
        this.gCode = gCode;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    @Override
    public String toString() {
        return "GoodsAndUnitsDto{" +
                "qId=" + qId +
                ", qCode='" + qCode + '\'' +
                ", qName='" + qName + '\'' +
                ", gId=" + gId +
                ", gCode='" + gCode + '\'' +
                ", gName='" + gName + '\'' +
                '}';
    }
}
