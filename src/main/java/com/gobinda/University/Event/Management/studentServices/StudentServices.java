package com.gobinda.University.Event.Management.studentServices;

import com.gobinda.University.Event.Management.modelStudent.Department;
import com.gobinda.University.Event.Management.modelStudent.Student;
import com.gobinda.University.Event.Management.studentRepo.IstudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {
    @Autowired
    IstudentRepo istudentRepo;

    public String addStudent(List<Student> newStudent) {
        istudentRepo.saveAll(newStudent);
        return "Added";
    }

    public List<Student> getAllStudent() {
       return (List<Student>) istudentRepo.findAll();
    }
    public String removeStudent(Integer studentId){
        istudentRepo.deleteById(studentId);
        return "deleted";
    }

    public String updateStudent(Integer studentId, Department department) {
        Student presentStudent = istudentRepo.findById(studentId).orElse(null);
        if(presentStudent != null)
        {
            presentStudent.setDepartment(department);
            istudentRepo.save(presentStudent);
            return "Department updated!!";
        }
        else {
            return "Student not found!";
        }
    }

    public Student getStudent(Integer studentId) {
        Student foundStudent=istudentRepo.findById(studentId).orElse(null);
        if(foundStudent!=null){
            return foundStudent;
        }else {
            return null;
        }
    }
}
