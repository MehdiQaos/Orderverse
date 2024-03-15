package dev.mehdi.school;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "school")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @Builder
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
}
