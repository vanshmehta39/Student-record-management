package com.meridian.student;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import java.math.BigDecimal; import java.time.*;
@Entity @Table(name="students", uniqueConstraints=@UniqueConstraint(columnNames="email"))
public class Student {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank @Column(nullable=false) private String fullName;
 @NotBlank @Email @Column(nullable=false,unique=true) private String email;
 @NotBlank @Pattern(regexp="^[0-9+() -]{7,20}$",message="Enter a valid phone number") @Column(nullable=false) private String phoneNumber;
 private String gender; @NotNull private LocalDate dateOfBirth; @NotBlank private String department; @NotBlank private String course; @NotBlank private String academicYear; @NotNull @Min(1) @Max(12) private Integer semester; @NotNull private LocalDate enrollmentDate;
 @NotNull @DecimalMin("0.0") @DecimalMax("100.0") private BigDecimal attendancePercentage;
 @NotNull @DecimalMin("0.0") @DecimalMax("10.0") private BigDecimal cgpa;
 @NotNull @Enumerated(EnumType.STRING) private StudentStatus status=StudentStatus.ACTIVE;
 @Column(nullable=false,updatable=false) private LocalDateTime createdAt;
 @PrePersist void created(){createdAt=LocalDateTime.now();}
 public Long getId(){return id;} public void setId(Long v){id=v;} public String getFullName(){return fullName;} public void setFullName(String v){fullName=v;} public String getEmail(){return email;} public void setEmail(String v){email=v;} public String getPhoneNumber(){return phoneNumber;} public void setPhoneNumber(String v){phoneNumber=v;} public String getGender(){return gender;} public void setGender(String v){gender=v;} public LocalDate getDateOfBirth(){return dateOfBirth;} public void setDateOfBirth(LocalDate v){dateOfBirth=v;} public String getDepartment(){return department;} public void setDepartment(String v){department=v;} public String getCourse(){return course;} public void setCourse(String v){course=v;} public String getAcademicYear(){return academicYear;} public void setAcademicYear(String v){academicYear=v;} public Integer getSemester(){return semester;} public void setSemester(Integer v){semester=v;} public LocalDate getEnrollmentDate(){return enrollmentDate;} public void setEnrollmentDate(LocalDate v){enrollmentDate=v;} public BigDecimal getAttendancePercentage(){return attendancePercentage;} public void setAttendancePercentage(BigDecimal v){attendancePercentage=v;} public BigDecimal getCgpa(){return cgpa;} public void setCgpa(BigDecimal v){cgpa=v;} public StudentStatus getStatus(){return status;} public void setStatus(StudentStatus v){status=v;} public LocalDateTime getCreatedAt(){return createdAt;} public void setCreatedAt(LocalDateTime v){createdAt=v;}
}
