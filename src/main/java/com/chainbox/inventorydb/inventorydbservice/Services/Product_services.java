package com.chainbox.inventorydb.inventorydbservice.Services;

import com.chainbox.inventorydb.inventorydbservice.EntityTables.tb_products;
import com.chainbox.inventorydb.inventorydbservice.Repository.product_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Product_services {

    @Autowired
    private product_repository product_repo;


      public List<tb_products> getAllProducts(){
        List<tb_products> products=new ArrayList<>();
        product_repo.findAll().forEach(products::add);

        return  products;

    }

    public List<tb_products> add_product(tb_products products){
        product_repo.save(products);
        return getAllProducts();
    }

    public List<tb_products> get_client_products(Integer client_id){
        List<tb_products> products=new ArrayList<>();
        List<tb_products> products_filtered=null;
        product_repo.findAll().forEach(products::add);
        products_filtered=products.stream().filter(tb_products -> tb_products.getClient_id()==client_id).collect(Collectors.toList());
        return  products_filtered;



    }
}
