package com.minhan.car.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StringRequest {
    @NotEmpty(message = "Chuỗi không hợp lệ")
    private String str;
}
