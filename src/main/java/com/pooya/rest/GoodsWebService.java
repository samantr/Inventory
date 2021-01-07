package com.pooya.rest;

import com.pooya.common.error.CustomeException;
import com.pooya.service.data.GoodsAndUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.misc.BASE64Decoder;

import javax.ws.rs.HeaderParam;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/GoodsService")
public class GoodsWebService {

    @Autowired
    private GoodsAndUnitService goodsAndUnitService;

    @GetMapping("/GetPreviewGoods")
    @PostMapping("/PostPreviewGoods")
    public GoodsResponse getGoods(GoodsRequest request , @RequestHeader("Authorization") String authString)
    {
        Map<String, Object> map = new HashMap<>();
        GoodsResponse response = new GoodsResponse();

        map.put("gCode", request.getCode());
        map.put("gName", request.getName());
        map.put("qName", request.getUnitName());

        try
        {
            response.setGoodsAndUnitsDtos(goodsAndUnitService.findByFilter(map));
        }catch (CustomeException e)
        {
            response.setErrorObjects(e.getErrorObjectList());
        }

        return response;
    }


}
