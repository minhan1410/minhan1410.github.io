package com.example.uploadfile.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "files")
@Data
@NoArgsConstructor
@Builder(setterPrefix = "with",toBuilder = true) //thay @AllArgsConstructor
public class FileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name,type,description;
    private byte[] content;
}
