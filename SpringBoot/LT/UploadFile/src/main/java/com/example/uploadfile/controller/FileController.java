package com.example.uploadfile.controller;

import com.example.uploadfile.model.FileEntity;
import com.example.uploadfile.model.FileResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FileController {
    @GetMapping("/files")
    public ResponseEntity<List<FileResponse>> getFiles() {
        List<FileResponse> files = new ArrayList<FileResponse>();
        return ResponseEntity.status(HttpStatus.OK).body(files);
    }

    @GetMapping("/file/{id}")
    public ResponseEntity<byte[]> getFile(@PathVariable Long id) {
        FileEntity fileEntity = null;
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=\"" + fileEntity.getName() + "\"")
                .body(fileEntity.getContent());
    }
}
