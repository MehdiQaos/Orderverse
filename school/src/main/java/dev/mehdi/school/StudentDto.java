package dev.mehdi.school;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class StudentDto {
    private String firstName;
    private String lastName;
    private String email;
}