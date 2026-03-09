package service;

import model.Car;
import model.Client;

import java.util.ArrayList;

public interface ICarService {
    Car findById(Long id);
    void add(Car car);
    void deleteById(Long id);
    ArrayList findAll();
    void update(Car car);
}
