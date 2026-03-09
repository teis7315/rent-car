package model;

import java.util.ArrayList;

public class Model {
    private Long id;
    private String name;
    private int pricePerDay;
    ArrayList<Car> cars;

    public Model(Long id, String name, int pricePerDay, ArrayList<Car> cars) {
        this.id = id;
        this.name = name;
        this.pricePerDay = pricePerDay;
        this.cars = cars;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }
}
