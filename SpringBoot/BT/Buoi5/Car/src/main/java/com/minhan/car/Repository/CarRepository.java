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

@Repository
public class CarRepository {
    private ArrayList<Car> cars = new ArrayList<>();
    public CarRepository() {
        try {
            File file = ResourceUtils.getFile("classpath:static/car.json");
            ObjectMapper mapper = new ObjectMapper();
            cars.addAll(mapper.readValue(file, new TypeReference<List<Car>>(){}));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Car> getAll(){
        return cars;
    }
}

