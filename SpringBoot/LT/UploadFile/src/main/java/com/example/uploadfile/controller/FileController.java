package com.example.uploadfile.controller;

import com.example.uploadfile.model.FileEntity;
import com.example.uploadfile.model.FileResponse;
import com.example.uploadfile.model.MessageReponse;
import com.example.uploadfile.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class FileController {
    @Autowired
    private FileService fileService;

    @GetMapping("/files")
    public ResponseEntity<List<FileResponse>> getFiles() {
        return ResponseEntity.status(HttpStatus.OK).body(fileService.getFiles());
    }

    @GetMapping("/file/{id}")
    public ResponseEntity<byte[]> getFile(@PathVariable Long id) {
        FileEntity fileEntity = fileService.getFile(id);
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=\"" + fileEntity.getName() + "\"")
                .body(fileEntity.getContent());
    }

    @PostMapping("/upload")
    public ResponseEntity<MessageReponse> uploadFile(@RequestParam("file") MultipartFile file, @RequestParam("description") String description) {
        String message;
        try {
            fileService.store(file, description);
            message = "Upload file successfully: " + file.getOriginalFilename();
            return ResponseEntity.status(HttpStatus.OK).body(new MessageReponse(message));
        } catch (IOException e) {
            message = "Could not upload the file: " + file.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new MessageReponse(message));
        }
    }
}
