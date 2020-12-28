package com.livecoding.dio.delivery.delivery.model;

import javax.persistence.*;

@Entity
@Table(name = "delivery")
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long deliveryId;
    @Column(name = "orderId", nullable = false)
    private long orderId;
    @Column(name = "customerId", nullable = false)
    private long customerId;
    @Column(name = "address", nullable = false)
    private String address;
    @Column(name = "shippingValue", nullable = false)
    private long shippingValue;

    public Delivery() {
    }

    public Delivery(long deliveryId, long orderId, long customerId, String address, long shippingValue) {
        this.deliveryId = deliveryId;
        this.orderId = orderId;
        this.customerId = customerId;
        this.address = address;
        this.shippingValue = shippingValue;
    }

    public long getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(long deliveryId) {
        this.deliveryId = deliveryId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getShippingValue() {
        return shippingValue;
    }

    public void setShippingValue(long shippingValue) {
        this.shippingValue = shippingValue;
    }

    public String toString() {
        return "Delivery [deliveryId=" + deliveryId + ", orderId=" + orderId + ", customerId=" + customerId + ", address=" + address
                + ", shippingValue=" + shippingValue +"]";
    }
}
