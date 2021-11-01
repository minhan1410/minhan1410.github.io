package tung.daongoc.upload.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import tung.daongoc.upload.model.FileEntity;
import tung.daongoc.upload.model.FileResponse;
import tung.daongoc.upload.model.MessageResponse;
import tung.daongoc.upload.services.FileService;

@RestController
public class FileController {
    @Autowired
    private FileService fileService;

    @GetMapping("/files")
    public ResponseEntity<List<FileResponse>> getFiles() {
        List<FileResponse> files = new ArrayList<FileResponse>();
        files = fileService.getFiles();
        return ResponseEntity.status(HttpStatus.OK).body(files);
    }

    @GetMapping("/files/{id}")
    public ResponseEntity<byte[]> getFile(@PathVariable Long id) {
        FileEntity fileEntity = new FileEntity();
        fileEntity = fileService.getFile(id);
        return ResponseEntity.status(HttpStatus.OK)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename =\"" + fileEntity.getName() + "\"")
                .body(fileEntity.getContent());
    }

    @PostMapping("/upload")
    public ResponseEntity<MessageResponse> uploadFile(@RequestParam("file") MultipartFile file,
            @RequestParam("description") String description) {
        String message = "";
        try {
            fileService.store(file, description);
            message = "Upload the file successfully: " + file.getOriginalFilename() + " !";
            return ResponseEntity.status(HttpStatus.OK).body(new MessageResponse(message));
        } catch (IOException e) {
            message = "Could not upload the file: " + file.getOriginalFilename() + " !";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new MessageResponse(message));
        }
    }
}
