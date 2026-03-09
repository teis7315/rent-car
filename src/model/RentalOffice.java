package model;

import java.util.ArrayList;

public class RentalOffice {
    private Long id;
    private String address;
    private int feeForDelivery;
    ArrayList<Car> cars;
    ArrayList<Rental> rentals;

    public RentalOffice(Long id, String address, int feeForDelivery, ArrayList<Car> cars, ArrayList<Rental> rentals) {
        this.id = id;
        this.address = address;
        this.feeForDelivery = feeForDelivery;
        this.cars = cars;
        this.rentals = rentals;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFeeForDelivery() {
        return feeForDelivery;
    }

    public void setFeeForDelivery(int feeForDelivery) {
        this.feeForDelivery = feeForDelivery;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public ArrayList<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(ArrayList<Rental> rentals) {
        this.rentals = rentals;
    }
}
