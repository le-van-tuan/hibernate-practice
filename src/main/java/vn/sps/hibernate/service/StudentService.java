package vn.sps.hibernate.service;

import vn.sps.hibernate.entity.Student;

import java.util.List;

public interface StudentService {
    /**
     * @return
     */
    List<Student> findAll();

    void insertStudent();
}
