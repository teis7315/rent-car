package controller;
import model.Car;
import service.CarServiceImpl;
import service.ICarService;
import java.util.ArrayList;
public class CarController {

    private ICarService service;
    public CarController() {
        service = new CarServiceImpl();
    }

    public void add(String dni, String name, String surname){
        Car car = new Car(dni, name, surname);
        service.add(car);

    }

    public void deleteById(Long id){
        service.deleteById(id);

    }

    public ArrayList findAll(){
        return service.findAll();
    }

    public Car findByDni(String dni){
        return service.findByDni(dni);
    }

    public void update(Long id, String dni, String name, String surname){
        Car car = new Car(id, dni, name, surname);
        service.update(car);
    }


}
