package com.meridian.student;
import com.meridian.dsa.StudentBST; import jakarta.validation.Valid; import org.springframework.http.*; import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController @RequestMapping("/api/students") public class StudentController {
 private final StudentService service; public StudentController(StudentService s){service=s;}
 @GetMapping public List<Student> list(@RequestParam(required=false)String q,@RequestParam(required=false)String department,@RequestParam(required=false)String year,@RequestParam(required=false)String status,@RequestParam(required=false)String sort){return service.list(q,department,year,status,sort);}
 @GetMapping("/{id}") public Student get(@PathVariable long id){return service.get(id);}
 @GetMapping("/search-by-id/{id}") public StudentBST.SearchResult searchId(@PathVariable long id){return service.bstSearch(id);}
 @PostMapping public ResponseEntity<Student> create(@Valid @RequestBody Student s){return ResponseEntity.status(HttpStatus.CREATED).body(service.create(s));}
 @PutMapping("/{id}") public Student update(@PathVariable long id,@Valid @RequestBody Student s){return service.update(id,s);}
 @DeleteMapping("/{id}") @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable long id){service.delete(id);}
}
