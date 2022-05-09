package com.example.mangoDB;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@NoArgsConstructor
@Data
@Document(collection="student")
public class Student {
    @Id
    private String id;
    private String firstName ;
    private String lastName ;
    private Gender gender ;
    private LocalDateTime createdAt=LocalDateTime.now();

    public Student(String firstname, String lastname, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;


    }
}
