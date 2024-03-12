package kz.singularity.gitpractice;

import java.util.ArrayList;
import java.util.List;
import kz.singularity.gitpractice.entity.School;
import kz.singularity.gitpractice.entity.Student;
import kz.singularity.gitpractice.service.SchoolRepository;
import kz.singularity.gitpractice.service.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class GitpracticeApplication implements CommandLineRunner {

  private final SchoolRepository schoolRepository;
  private final StudentRepository studentRepository;

  public static void main(String[] args) {
    SpringApplication.run(GitpracticeApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Student s1 = new Student(1L, "Name1", "Surname1", "email1", 22, 33);
    Student s2 = new Student(2L, "Name2", "Surname2", "email2", 34, 34);
    Student s3 = new Student(3L, "Name3", "Surname3", "email3", 99, 33);
    List<Student> studentList = new ArrayList<>();
    studentList.add(s1);
    studentList.add(s2);
    studentList.add(s3);
    studentRepository.saveAll(studentList);

    School school1 = new School(1L, "SchoolName", 300);
    School school2 = new School(2L, "WW", 900);
    List<School> schoolList = new ArrayList<>();
    schoolList.add(school1);
    schoolList.add(school2);
    schoolRepository.save(school1);
    schoolRepository.save(school2);

//    schoolRepository.saveAll(schoolList);

    System.out.println("st1: " + s1.toString());
    System.out.println("st2: " + s2.toString());
    System.out.println("st3: " + s3.toString());

    System.out.println("school1: " + school1.toString());
    System.out.println("school2: " + school2.toString());

    System.out.println("find by age 33: " + studentRepository.findStudentsByAge(33));
    System.out.println("find by first name (Name1): " + studentRepository.findStudentsByFirstName("Name1"));

    System.out.println("find school by name WW: " + schoolRepository.findSchoolsBySchoolName("WW"));
    System.out.println("find student quantity by school ID 1: " + schoolRepository.findAllByStudentQuantity(1L));

  }
}
