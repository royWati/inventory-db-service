package com.chainbox.inventorydb.inventorydbservice.Repository;

import com.chainbox.inventorydb.inventorydbservice.EntityTables.tb_counties;
import org.springframework.data.repository.CrudRepository;

public interface counties_repository extends CrudRepository<tb_counties,Integer> {

}
