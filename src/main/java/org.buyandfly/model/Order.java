package org.buyandfly.model;

import java.sql.Date;
import java.util.List;

public class Order {

    private long id;
    private List<Product> devices;
    private int price;
    private Date createdDate;

    public void addDevice(final Device device, final int amount) {
        devices.add(new Product(device, amount));
        setPrice();
    }

    public List<Product> getDevices() {
        return devices;
    }

    public int getPrice() {
        return price;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    private void setPrice() {
        int newPrice = 0;
        for (Product p: devices) {
            newPrice += p.getPrice();
        }
        price = newPrice;
    }

    public void setCreatedDate(final Date date) {
        this.createdDate = date;
    }

    private class Product {

        private final Device device;
        private final int amount;
        private final int price;

        public Product(final Device device, final int amount) {
            this.device = device;
            this.amount = amount;
            this.price = device.getPrice() * amount;
        }

        public Device getDevice() {
            return device;
        }

        public int getAmount() {
            return amount;
        }

        public int getPrice() {
            return price;
        }
    }
}


