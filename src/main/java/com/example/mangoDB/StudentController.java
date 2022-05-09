package com.example.mangoDB;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/student")
@RequiredArgsConstructor
public class  StudentController {
    private final StudentService studentService ;

    @GetMapping(path="{-id}")
    public Optional<Student> getStudentById (@PathVariable String id)
    { return studentService.getStudentById(id); }

    @GetMapping("/byName/{firstName}")
    public Student getStudentByName (@PathVariable String firstName)
    { return studentService.getStudentByName(firstName); }

    @GetMapping
    public List<Student> getAllStudents ()
    {return studentService.getAllStudents();}

    @PostMapping
    public Student addStudent(@RequestBody Student student)
    { return studentService.insertStudent(student);}

    @DeleteMapping(path="{id}")
    public void deleteStudentById(@PathVariable String id)
    { studentService.deleteStudentById(id);}


    @PutMapping(path="{id}")
    public Student updateStudent(@PathVariable String id,@RequestBody Student studentUpdated)
    { return studentService.updateStudentbyID(id,studentUpdated); }

}
