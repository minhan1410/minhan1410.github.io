package tung.daongoc.upload.error;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class APIError {
    private Date timestamp;
    private String message;
    private String details;
}
