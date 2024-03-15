package dev.mehdi.school;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schools")
public class SchoolController {
    private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }


    @GetMapping("/{id}")
    public ResponseEntity<School> getSchool(@PathVariable Long id) {
        return ResponseEntity.ok(schoolService.getSchool(id).orElseThrow());
    }

    @GetMapping
    public ResponseEntity<List<School>> getAll() {
        return ResponseEntity.ok(schoolService.getSchools());
    }

    @PostMapping
    public ResponseEntity<School> saveSchool(@RequestBody School school) {
        return new ResponseEntity<>(schoolService.saveSchool(school), HttpStatus.CREATED);
    }

    @GetMapping("/with-students/{id}")
    public ResponseEntity<SchoolWithStudentsDto> getSchoolWithStudents(@PathVariable Long id) {
        return ResponseEntity.ok(schoolService.getSchoolWithStudents(id));
    }
}
