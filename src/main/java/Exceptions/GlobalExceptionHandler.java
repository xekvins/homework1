package Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<String> handleEmployeeNotFound(EmployeeNotFoundException e) {
        return new ResponseEntity<>("Employee not found", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(EmployeeStorageIsFullException.class)
    public ResponseEntity<String> handleEmployeeStorageIsFull(EmployeeStorageIsFullException e) {
        return new ResponseEntity<>("Employee storage is full", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(EmployeeAlreadyAddedException.class)
    public ResponseEntity<String> handleEmployeeAlreadyAdded(EmployeeAlreadyAddedException e) {
        return new ResponseEntity<>("Employee already added", HttpStatus.BAD_REQUEST);
    }
}
