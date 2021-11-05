package tung.daongoc.upload.services;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import tung.daongoc.upload.error.ResourcesNotFoundException;
import tung.daongoc.upload.model.FileEntity;
import tung.daongoc.upload.model.FileResponse;
import tung.daongoc.upload.repository.FileRepository;

@Service
public class FileServiceImpl implements FileService {

    @Autowired
    private FileRepository fileRepository;

    @Override
    public FileEntity store(MultipartFile file, String description) throws IOException {
        FileEntity fileEntity = FileEntity.builder().withName(StringUtils.cleanPath(file.getOriginalFilename()))
                .withType(file.getContentType()).withContent(file.getBytes()).withDescription(description).build();
        return fileRepository.save(fileEntity);
    }

    @Override
    public FileEntity getFile(Long id) {
        return fileRepository.findById(id)
                .orElseThrow(() -> new ResourcesNotFoundException("File not found for this file"));
    }

    @Override
    public List<FileResponse> getFiles() {
        return fileRepository.findAll().stream().map(fileEntity -> FileResponse.builder().withName(fileEntity.getName())
                .withDescription(fileEntity.getDescription()).withType(fileEntity.getType())
                .withSize(fileEntity.getContent().length).withUrl(ServletUriComponentsBuilder.fromCurrentContextPath()
                        .path("/files/").path(String.valueOf(fileEntity.getId())).toString())
                .build()).collect(Collectors.toList());
    }

}
