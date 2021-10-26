package com.example.btvn.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.btvn.model.Employee;

@Service
public class StorageService {
    @Value("${upload.path}")
    private String path;

    public void uploadFile(MultipartFile file, Employee employee) {
        if (file.isEmpty()) {
            throw new RuntimeException("Failed to store empty file");
        }

        String fileName = file.getOriginalFilename();
        employee.setPhotoName(employee.getId() + fileName.substring(fileName.indexOf(".")));

        try {
            var is = file.getInputStream();
            Files.copy(is, Paths.get(path + employee.getPhotoName())/*.resolve(employee.getPhotoName())*/, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            var msg = String.format("Failed to store file %s", employee.getPhotoName());
            throw new RuntimeException(msg, e);
        }

    }

    public void deleteFile(String fileName) {
        try {
            Files.delete(Paths.get(path + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
