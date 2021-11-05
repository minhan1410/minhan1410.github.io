package tung.daongoc.upload.services;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import tung.daongoc.upload.model.FileEntity;
import tung.daongoc.upload.model.FileResponse;

public interface FileService {
    FileEntity store(MultipartFile file, String description) throws IOException;

    FileEntity getFile(Long id);

    List<FileResponse> getFiles();
}
