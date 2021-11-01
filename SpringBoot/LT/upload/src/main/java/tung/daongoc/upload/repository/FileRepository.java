package tung.daongoc.upload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tung.daongoc.upload.model.FileEntity;

@Repository
public interface FileRepository extends JpaRepository<FileEntity, Long> {

}
