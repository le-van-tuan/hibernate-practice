package vn.sps.hibernate.responsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.sps.hibernate.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

}
