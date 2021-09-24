package com.minhan.car.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private int id;
    @NotEmpty(message = "Model không hợp lệ")
    private String model;
    @NotEmpty(message = "Manufacturer không hợp lệ")
    private String manufacturer;
    private int price;
    private int sales;
    private String photo;
}
