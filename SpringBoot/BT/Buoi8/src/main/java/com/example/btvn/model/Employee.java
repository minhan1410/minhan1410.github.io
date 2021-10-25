package com.example.btvn.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;

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
    @NotBlank(message = "Không được để trống")
    private String firstName, lastName, tiktok;

    private MultipartFile photo;

    public Employee(int id, String firstName, String lastName, String tiktok) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.tiktok = tiktok;

        Path path = Paths.get("src/main/resources/static/photos/");
        String name = id + ".jpg";
        String originalFileName = id + ".jpg";
        String contentType = "text/plain";
        byte[] content = null;
        try {
            content = Files.readAllBytes(path);
        } catch (final IOException e) {
        }
        this.photo = new MockMultipartFile(name,
                originalFileName, contentType, content);

    }

    public boolean matchWithKeyword(String keyword) {
        String keywordLowerCase = keyword.toLowerCase();
        return ((firstName + lastName).toLowerCase().contains(keywordLowerCase));
    }
}