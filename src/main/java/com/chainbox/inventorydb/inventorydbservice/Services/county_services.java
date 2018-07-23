package com.chainbox.inventorydb.inventorydbservice.Services;

import com.chainbox.inventorydb.inventorydbservice.EntityTables.tb_counties;
import com.chainbox.inventorydb.inventorydbservice.Repository.counties_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class county_services {

    @Autowired
    private counties_repository counties_repo;


    public List<tb_counties> getAllCounties(){
        List<tb_counties> counties=new ArrayList<>();
        counties_repo.findAll().forEach(counties::add);

        return  counties;

    }

    public List<tb_counties>  add_county(tb_counties counties){
        counties_repo.save(counties);
        return getAllCounties();
    }
}
