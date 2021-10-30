package com.example.uploadfile.service;

import com.example.uploadfile.model.FileEntity;
import com.example.uploadfile.model.FileResponse;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface FileService {
    FileEntity store(MultipartFile file,String description);
    FileEntity getFile(Long id);
    List<FileResponse> getFiles();
}
