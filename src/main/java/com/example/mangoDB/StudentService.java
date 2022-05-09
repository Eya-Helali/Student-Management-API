package com.example.mangoDB;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository repository;

    public List<Student> getAllStudents ()
    { return repository.findAll();}

    public Student getStudentByName (String firstName)
    { return repository.findByFirstName(firstName);}


    public Optional<Student> getStudentById(String id)
    {return repository.findById(id);}

    public Student insertStudent(Student student)
    { return repository.save(student);}

    public  void deleteStudentById(String id)
    {     repository.deleteById(id);}

    public Student updateStudentbyID(String id , Student studentUpdated )
    {   studentUpdated.setId(id);
        return repository.save(studentUpdated); }

}
