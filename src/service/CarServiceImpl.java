package service;

import model.Car;
import repository.CarRepository;
import repository.ICarRepository;

import java.util.ArrayList;

public class CarServiceImpl implements ICarService{

    private ICarRepository repository;
    public CarServiceImpl() {
        repository = CarRepository.getCarRepository();
    }

    @Override
    public Car findById(Long id) {
        return null;
    }

    public void add(Car car) {
        repository.add(car);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public ArrayList findAll() {
        return repository.findAll();
    }

    public void update(Car car) {
        repository.update(car);
    }


}