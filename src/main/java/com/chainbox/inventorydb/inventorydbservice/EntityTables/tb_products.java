package com.chainbox.inventorydb.inventorydbservice.EntityTables;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class tb_products {
    public tb_products(){

    }
    public tb_products(String product_name, Integer client_id, Integer active_status) {
        this.product_name = product_name;
        this.client_id = client_id;
        this.active_status = active_status;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer product_id;
    private String product_name;
    private Integer client_id;
    private Integer active_status;


    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Integer getClient_id() {
        return client_id;
    }

    public void setClient_id(Integer client_id) {
        this.client_id = client_id;
    }

    public Integer getActive_status() {
        return active_status;
    }

    public void setActive_status(Integer active_status) {
        this.active_status = active_status;
    }


}
