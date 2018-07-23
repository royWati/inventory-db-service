package com.chainbox.inventorydb.inventorydbservice.Repository;

import com.chainbox.inventorydb.inventorydbservice.EntityTables.tb_products;
import org.springframework.data.repository.CrudRepository;



public interface product_repository extends CrudRepository<tb_products,Integer>{

}
