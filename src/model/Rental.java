package model;

import java.util.Date;

public class Rental {
    private Long id;
    final Date startDate;
    final Date endDate;
    private Client client;
    private Car car;
    private RentalOffice rentalOffice;

    public Rental(Long id, Date startDate, Date endDate, Car car, RentalOffice rentalOffice) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.car = car;
        this.rentalOffice = rentalOffice;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public RentalOffice getRentalOffice() {
        return rentalOffice;
    }

    public void setRentalOffice(RentalOffice rentalOffice) {
        this.rentalOffice = rentalOffice;
    }

    public int getPricePerDay(){
        return car.getPricePerDay();
    }
}
