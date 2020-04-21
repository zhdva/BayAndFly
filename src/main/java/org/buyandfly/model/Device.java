package org.buyandfly.model;

import javax.persistence.*;

@Entity
@Table(name = "devices")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String type;

    private String title;

    private long price;

    @Column(name = "number_of_passengers")
    private int numberOfPassengers;

    private String material;

    @Column(name = "max_speed")
    private int maxSpeed;

    private String equipment;

    private String dimensions;

    private int weight;

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public long getPrice() {
        return price;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public String getMaterial() {
        return material;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getEquipment() {
        return equipment;
    }

    public String getDimensions() {
        return dimensions;
    }

    public int getWeight() {
        return weight;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setPrice(final int price) {
        this.price = price;
    }

    public void setNumberOfPassengers(final int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setMaterial(final String material) {
        this.material = material;
    }

    public void setMaxSpeed(final int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setEquipment(final String equipment) {
        this.equipment = equipment;
    }

    public void setDimensions(final float length, final float width, final float height) {
        this.dimensions = Float.toString(length) + "x" + Float.toString(width) + "x" + Float.toString(height) + " м";
    }

    public void setWeight(final int weight) {
        this.weight = weight;
    }
}
