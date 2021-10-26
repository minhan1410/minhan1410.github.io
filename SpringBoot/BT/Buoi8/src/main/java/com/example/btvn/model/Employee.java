package com.example.btvn.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.mock.web.MockMultipartFile;

//https://www.baeldung.com/javax-validation
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @JsonIgnore  //Bỏ qua id khi nạp từ CSV
    private int id;

    @NotBlank(message = "Không chứa khoảng trống")
    @Size(min = 2, max = 50, message = "firstName or lastName phải từ 2 đến 50 ký tự")
    private String firstName, lastName;

    private MultipartFile photo;
    private String photoName;

    @NotBlank(message = "Không chứa khoảng trống")
    @URL(protocol = "https", message = "Link không đúng")
    private String tiktok;

    public Employee(int id, String firstName, String lastName, String tiktok) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.tiktok = tiktok;
        this.photoName = id + ".jpg";
    }

    public boolean matchWithKeyword(String keyword) {
        String keywordLowerCase = keyword.toLowerCase();
        return ((firstName + lastName).toLowerCase().contains(keywordLowerCase));
    }
}