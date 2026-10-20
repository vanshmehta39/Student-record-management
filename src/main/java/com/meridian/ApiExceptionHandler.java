package com.meridian;
import org.springframework.http.*; import org.springframework.web.bind.MethodArgumentNotValidException; import org.springframework.web.bind.annotation.*; import java.util.*;
@RestControllerAdvice public class ApiExceptionHandler {
 @ExceptionHandler(NoSuchElementException.class) ResponseEntity<Map<String,String>> missing(NoSuchElementException e){return error(HttpStatus.NOT_FOUND,e.getMessage());}
 @ExceptionHandler({IllegalArgumentException.class,MethodArgumentNotValidException.class}) ResponseEntity<Map<String,String>> invalid(Exception e){String m=e instanceof MethodArgumentNotValidException v?v.getBindingResult().getFieldErrors().stream().findFirst().map(x->x.getField()+": "+x.getDefaultMessage()).orElse("Invalid request"):e.getMessage();return error(HttpStatus.BAD_REQUEST,m);}
 @ExceptionHandler(Exception.class) ResponseEntity<Map<String,String>> other(Exception e){return error(HttpStatus.INTERNAL_SERVER_ERROR,"The request could not be completed.");}
 private ResponseEntity<Map<String,String>> error(HttpStatus s,String message){return ResponseEntity.status(s).body(Map.of("error",message));}
}
