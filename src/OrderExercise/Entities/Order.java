package OrderExercise.Entities;

import enumerate.Entities.OrderStatus;

import java.util.Date;

public class Order {

    private Integer quantity;

    private double price;

    private Client client;

    public Order(Date date, OrderStatus status, Client client) {

    }

    public Order(Integer quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {

    }

}
