package com.gobinda.University.Event.Management.studentController;

import com.gobinda.University.Event.Management.modelStudent.Department;
import com.gobinda.University.Event.Management.modelStudent.Student;
import com.gobinda.University.Event.Management.studentServices.StudentServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class StudentController {
    @Autowired
    StudentServices studentServices;
    @PostMapping("student")
    public String addStudent(@RequestBody @Valid List<Student> newStudent){
        return studentServices.addStudent(newStudent);
    }
    @GetMapping("allStudent")
    public List<Student> getAllStudent(){
        return studentServices.getAllStudent();
    }
    @DeleteMapping("student/studentId/{studentId}")
    public String deleteStudentbyId(@PathVariable Integer studentId){
        return studentServices.removeStudent(studentId);
    }
    @PutMapping("student/department")
    public String updateStudent(@RequestParam Integer studentId, @RequestParam Department department){
        return studentServices.updateStudent(studentId,department);
    }
    @GetMapping("student/details/studentId/{studentId}")
    public Student getStudent(@PathVariable Integer studentId){
        return studentServices.getStudent(studentId);
    }

}
