package com.chainbox.inventorydb.inventorydbservice.Controller;

import com.chainbox.inventorydb.inventorydbservice.EntityTables.tb_products;
import com.chainbox.inventorydb.inventorydbservice.Repository.product_repository;
import com.chainbox.inventorydb.inventorydbservice.Services.Product_services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Products {

    @Autowired
    private Product_services products_service;


    @RequestMapping(method = RequestMethod.POST , value = "products/add")
    public List<tb_products> addProduct(@RequestBody tb_products products){
        return products_service.add_product(products);
    }

    @RequestMapping(method = RequestMethod.GET,value="products/all_products")
    public List<tb_products> getAllProducts(){
        return products_service.getAllProducts();
    }

    @RequestMapping(method = RequestMethod.GET,value = "products/client_products/{client_id}")
    public List<tb_products> get_client_products(@PathVariable Integer client_id){
        return products_service.get_client_products(client_id);
    }

}
