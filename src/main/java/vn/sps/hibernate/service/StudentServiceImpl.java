package vn.sps.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.sps.hibernate.entity.Student;
import vn.sps.hibernate.responsitory.StudentRepository;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return this.studentRepository.findAll();
    }

    @Override
    public void insertStudent() {
        Student A = new Student();
        A.setId("dd5d12ca-d2bb-41f6-b9fa-83f4ea94b9fb");
        A.setAge(100);
        A.setFirstName("Teo Master");
        A.setLastName("Le");
        this.studentRepository.save(A);
    }
}
