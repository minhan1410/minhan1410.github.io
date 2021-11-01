package tung.daongoc.upload.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "with", toBuilder = true)
public class FileResponse {
    private String name;
    private String type;
    private String description;
    private int size;
    private String url;
}
