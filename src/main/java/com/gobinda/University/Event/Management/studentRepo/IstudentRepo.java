package com.gobinda.University.Event.Management.studentRepo;

import com.gobinda.University.Event.Management.modelStudent.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IstudentRepo extends CrudRepository<Student,Integer> {
}
