package com.pooya.web.model;

import com.pooya.entity.dto.QuantityUnitDto;
import com.pooya.entity.entity.QuantityUnit;
import com.pooya.enums.FormState;
import com.pooya.service.service.QuantityUnitService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Named
@ViewScoped
public class QuantityUnitModel extends BaseModel implements Serializable  {

    private String code;
    private String name;


    private List<QuantityUnitDto> quantityUnitDtos;

    private QuantityUnitDto quantityUnitDto;

    private QuantityUnit quantityUnit;


    public List<QuantityUnitDto> getQuantityUnitDtos() {
        return quantityUnitDtos;
    }

    public void setQuantityUnitDtos(List<QuantityUnitDto> quantityUnitDtos) {
        this.quantityUnitDtos = quantityUnitDtos;
    }

    public QuantityUnit getQuantityUnit() {
        return quantityUnit;
    }

    public void setQuantityUnit(QuantityUnit quantityUnit) {
        this.quantityUnit = quantityUnit;
    }

    @Override
    public void setEntity()
    {
        quantityUnit = new QuantityUnit();
        quantityUnit.setId(recId == 0 ? null : recId );
        quantityUnit.setCode(quantityUnitDto.getCode());
        quantityUnit.setName(quantityUnitDto.getName());
    }

    @Override
    public void setDto()
    {
        quantityUnitDto.setId(quantityUnit.getId());
        quantityUnitDto.setCode(quantityUnit.getCode());
        quantityUnitDto.setName(quantityUnit.getName());
    }
    public QuantityUnitDto getQuantityUnitDto() {
        return quantityUnitDto;
    }

    public void setQuantityUnitDto(QuantityUnitDto quantityUnitDto) {
        this.quantityUnitDto = quantityUnitDto;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Map makeMap(){
        map = new HashMap<>();
        map.put("id", recId == 0 ? null : recId );
        map.put("code", code);
        map.put("name", name);

        return map;
    }

    @Override
    public void clearDto() {
        quantityUnitDto = new QuantityUnitDto();
    }
}
