package tung.daongoc.upload.error;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import tung.daongoc.upload.model.MessageResponse;

@ControllerAdvice
public abstract class FileUploadExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ResourcesNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(ResourcesNotFoundException ex, WebRequest request) {
        APIError notFoundError = new APIError(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(notFoundError, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public ResponseEntity<?> handlemaxUploadSizeExceededException(MaxUploadSizeExceededException ex) {
        return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new MessageResponse(ex.getMessage()));
    }
}
