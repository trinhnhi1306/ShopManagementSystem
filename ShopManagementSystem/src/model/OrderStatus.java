/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author TRINH
 */
public class OrderStatus {
    private Integer statusId;
    private String description;
    private List<Order> Orders;

    public OrderStatus() {
    }

    public OrderStatus(Integer statusId, String description, List<Order> Orders) {
        this.statusId = statusId;
        this.description = description;
        this.Orders = Orders;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Order> getOrders() {
        return Orders;
    }

    public void setOrders(List<Order> Orders) {
        this.Orders = Orders;
    }
    
}
