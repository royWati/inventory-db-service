package com.chainbox.inventorydb.inventorydbservice.Controller;


import com.chainbox.inventorydb.inventorydbservice.EntityTables.tb_counties;
import com.chainbox.inventorydb.inventorydbservice.Services.Product_services;
import com.chainbox.inventorydb.inventorydbservice.Services.county_services;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectSerializer;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class counties {

    @Autowired
    private county_services county_service;

    @RequestMapping(method = RequestMethod.POST , value = "counties/add")
    public List<tb_counties> addcounty(@RequestBody tb_counties counties){

        return county_service.add_county(counties);

    }

    @RequestMapping(method = RequestMethod.GET,value="counties/all_counties")
    public List<tb_counties> getAllProducts(){
        return county_service.getAllCounties();
    }
}
