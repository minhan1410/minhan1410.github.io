package com.minhan.car.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Min(value=1, message="Id bat dau tu 1")
    private int id;
    @NotBlank(message = "Model không để trống")
    private String model;
    @NotBlank(message = "Manufacturer không để trống")
    private String manufacturer;
    private int price;
    private int sales;
    private String photo;
}
