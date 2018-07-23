package com.chainbox.inventorydb.inventorydbservice.Repository;

import com.chainbox.inventorydb.inventorydbservice.EntityTables.tb_stocks;
import org.springframework.data.repository.CrudRepository;

public interface stock_repository extends CrudRepository<tb_stocks,String> {
}
