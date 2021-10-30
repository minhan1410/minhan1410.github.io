package com.example.uploadfile.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "with",toBuilder = true)
public class FileResponse {
    private String name,type,description,url;
    private long size;
}
