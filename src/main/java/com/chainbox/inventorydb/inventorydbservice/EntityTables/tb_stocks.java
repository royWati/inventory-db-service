package com.chainbox.inventorydb.inventorydbservice.EntityTables;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
public class tb_stocks {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer stock_movement_id;
    private Integer product_id;
    private String movement_type;
    private Integer quantity_moved;

    @UpdateTimestamp
    private LocalDateTime date_of_movement;

    public tb_stocks(){

    }

    public tb_stocks(Integer product_id, String movement_type, Integer quantity_moved) {
        this.product_id = product_id;
        this.movement_type = movement_type;
        this.quantity_moved = quantity_moved;

    }

    public Integer getStock_movement_id() {
        return stock_movement_id;
    }

    public void setStock_movement_id(Integer stock_movement_id) {
        this.stock_movement_id = stock_movement_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getMovement_type() {
        return movement_type;
    }

    public void setMovement_type(String movement_type) {
        this.movement_type = movement_type;
    }

    public Integer getQuantity_moved() {
        return quantity_moved;
    }

    public void setQuantity_moved(Integer quantity_moved) {
        this.quantity_moved = quantity_moved;
    }

}
