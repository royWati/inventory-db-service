package com.chainbox.inventorydb.inventorydbservice.Services;

import com.chainbox.inventorydb.inventorydbservice.Repository.stock_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class stock_services {

    @Autowired
    private stock_repository stock_repo;


}
