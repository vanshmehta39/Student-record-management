package com.meridian.report;
import com.meridian.student.*; import org.springframework.web.bind.annotation.*; import java.math.*; import java.time.*; import java.util.*; import java.util.stream.*;
@RestController @RequestMapping("/api") public class ReportController {
 private final StudentService students; public ReportController(StudentService s){students=s;} private List<Student> all(){return students.snapshot();}
 @GetMapping("/dashboard/stats") public Map<String,Object> stats(){List<Student>a=all();LocalDate first=LocalDate.now().withDayOfMonth(1);return Map.of("totalStudents",a.size(),"addedThisMonth",a.stream().filter(s->s.getCreatedAt().toLocalDate().compareTo(first)>=0).count(),"averageAttendance",avg(a,Student::getAttendancePercentage),"averageCgpa",avg(a,Student::getCgpa));}
 @GetMapping("/reports/department-distribution") public Map<String,Long> departments(){return all().stream().collect(Collectors.groupingBy(Student::getDepartment,TreeMap::new,Collectors.counting()));}
 @GetMapping("/reports/status-distribution") public Map<String,Long> statuses(){return all().stream().collect(Collectors.groupingBy(s->s.getStatus().name(),TreeMap::new,Collectors.counting()));}
 @GetMapping("/reports/low-attendance") public List<Student> low(@RequestParam(defaultValue="75") BigDecimal threshold){return all().stream().filter(s->s.getAttendancePercentage().compareTo(threshold)<0).toList();}
 private BigDecimal avg(List<Student>a,java.util.function.Function<Student,BigDecimal> f){return a.isEmpty()?BigDecimal.ZERO:a.stream().map(f).reduce(BigDecimal.ZERO,BigDecimal::add).divide(BigDecimal.valueOf(a.size()),2,RoundingMode.HALF_UP);}
}
