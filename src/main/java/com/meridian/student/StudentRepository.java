package com.meridian.student;
import org.springframework.data.jpa.repository.JpaRepository; import java.util.*;
public interface StudentRepository extends JpaRepository<Student,Long>{ boolean existsByEmailIgnoreCase(String email); Optional<Student> findByEmailIgnoreCase(String email); }
