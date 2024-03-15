package dev.mehdi.school;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Builder
public class SchoolWithStudentsDto {
    private String name;
    private String email;
    private List<StudentDto> students;
}
