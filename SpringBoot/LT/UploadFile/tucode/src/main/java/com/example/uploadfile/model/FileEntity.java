package com.example.uploadfile.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "files")
@Data
@NoArgsConstructor
@Builder(setterPrefix = "with", toBuilder = true) //thay @AllArgsConstructor
public class FileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "file_id")
    private Long id;
    private String name, type, description;
    @Lob
    private byte[] content;
}
