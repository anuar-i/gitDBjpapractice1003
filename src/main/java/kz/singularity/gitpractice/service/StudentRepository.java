package kz.singularity.gitpractice.service;

import java.util.List;
import kz.singularity.gitpractice.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <Student, Long> {

  List<Student> findStudentsByFirstName(String firstName);

  List<Student> findStudentsByAge(int age);

}
