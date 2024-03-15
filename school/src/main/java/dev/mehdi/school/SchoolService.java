package dev.mehdi.school;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolService {
    private final SchoolRepository schoolRepository;
    private final StudentClient studentClient;

    public SchoolService(SchoolRepository schoolRepository, StudentClient studentClient) {
        this.schoolRepository = schoolRepository;
        this.studentClient = studentClient;
    }

    public School saveSchool(School student) {
        return schoolRepository.save(student);
    }

    public Optional<School> getSchool(Long id) {
        return schoolRepository.findById(id);
    }

    public List<School> getSchools() {
        return schoolRepository.findAll();
    }

    public SchoolWithStudentsDto getSchoolWithStudents(Long id) {
        School school = schoolRepository.findById(id).orElseThrow();
        List<StudentDto> students = studentClient.getStudents(id);
        return SchoolWithStudentsDto.builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(students)
                .build();
    }
}
