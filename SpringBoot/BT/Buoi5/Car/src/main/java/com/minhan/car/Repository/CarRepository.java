package com.minhan.car.Repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.minhan.car.Model.Car;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class CarRepository {
    private ArrayList<Car> cars = new ArrayList<>();

    public CarRepository() {
        try {
            File file = ResourceUtils.getFile("classpath:static/car.json");
            ObjectMapper mapper = new ObjectMapper();
            cars.addAll(mapper.readValue(file, new TypeReference<List<Car>>() {
            }));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Car> getAll() {
        return cars;
    }

    public void add(Car car) {
        if (!get(car.getId()).isPresent()) {
            cars.add(car);
        }else{
            throw new RuntimeException("Loi id da ton tai");
        }
    }

    public List<Car> searchModel(String str) {
        return cars.stream().filter(car -> car.getModel().contains(str)).collect(Collectors.toList());
    }

    public List<Car> searchManufacturer(String str) {
        return cars.stream().filter(car -> car.getManufacturer().contains(str)).collect(Collectors.toList());
    }

    public List<Car> searchPrice(String str) {
        return cars.stream().filter(car -> String.valueOf(car.getPrice()).equals(str)).collect(Collectors.toList());
    }

    public void deleteByID(int id) {
        Optional<Car> optionalCar = get(id);
        if (optionalCar.isPresent() && cars.size() >= 1) {
            cars.remove(optionalCar.get());
        }else{
            throw new RuntimeException("Loi id da ton tai hoac khong con phan tu");
        }
    }

    public void edit(Car t) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getId() == t.getId()) {
                cars.set(i, t);
            }
        }
    }

    public Optional<Car> get(int id) {
        return cars.stream().filter(i -> i.getId() == id).findFirst();
    }

    public void update(Car car) {
        get(car.getId()).ifPresent(existcar -> {
            existcar.setPhoto(car.getPhoto());
            existcar.setModel(car.getModel());
            existcar.setManufacturer(car.getManufacturer());
            existcar.setPrice(car.getPrice());
            existcar.setSales(car.getSales());
        });
    }
}

