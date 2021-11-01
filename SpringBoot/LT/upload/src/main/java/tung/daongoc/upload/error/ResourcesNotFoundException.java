package tung.daongoc.upload.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourcesNotFoundException extends RuntimeException {

    public ResourcesNotFoundException(String message) {
        super(message);
    }

    public ResourcesNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
