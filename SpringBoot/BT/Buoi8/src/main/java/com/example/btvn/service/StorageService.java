package com.example.btvn.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
public class StorageService {
    @Value("${upload.path}")
    private String path;

    public void uploadFile(MultipartFile file, String fileNameID) {

        if (file.isEmpty()) {
            throw new RuntimeException("Failed to store empty file");
        }

        String fileName = file.getOriginalFilename();
        fileNameID += fileName.substring(fileName.indexOf("."));


        try {
            var is = file.getInputStream();
            Files.copy(is, Paths.get(path + fileNameID), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            var msg = String.format("Failed to store file %s", fileName);
            throw new RuntimeException(msg, e);
        }
    }
}
