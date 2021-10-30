package com.example.uploadfile.service;

import com.example.uploadfile.error.ResourceNotFoundException;
import com.example.uploadfile.model.FileEntity;
import com.example.uploadfile.model.FileResponse;
import com.example.uploadfile.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FileServiceImpl implements FileService {
    @Autowired
    private FileRepository fileRepository;

    @Override
    public FileEntity store(MultipartFile file, String description) {
        FileEntity fileEntity = null;
        try {
            fileEntity = FileEntity.builder().withName(StringUtils.cleanPath(file.getOriginalFilename()))
                    .withType(file.getContentType()).withDescription(description).withContent(file.getBytes()).build();
            return fileRepository.save(fileEntity);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public FileEntity getFile(Long id) {
        return fileRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("File not found for this this file: " + id));
    }

    @Override
    public List<FileResponse> getFiles() {
        return fileRepository.findAll().stream().map(fileEntity -> FileResponse.builder()
                .withName(fileEntity.getName())
                .withType(fileEntity.getType())
                .withDescription(fileEntity.getDescription())
                .withSize(fileEntity.getContent().length)
                .withUrl(ServletUriComponentsBuilder.fromCurrentContextPath().path("/files/").path("" + fileEntity.getId()).toString())
                .build()).collect(Collectors.toList());
    }
}
