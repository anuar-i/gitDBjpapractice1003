package kz.singularity.gitpractice;

import kz.singularity.gitpractice.entity.School;
import kz.singularity.gitpractice.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitpracticeApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(GitpracticeApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Student s1 = new Student(1L, "Name1", "Surname1", "email1", 22, 33);
    Student s2 = new Student(2L, "Name2", "Surname2", "email2", 34, 34);
    Student s3 = new Student(3L, "Name3", "Surname3", "email3", 99, 23);

    School school = new School(1L, "SchoolName", 300);
    School school2 = new School(2L, "WW", 900);

    System.out.println("st1 " + s1.toString());
    System.out.println("st2 " + s2.toString());
    System.out.println("st3 " + s3.toString());

    System.out.println("school1 " + school.toString());
    System.out.println("school2 " + school2.toString());




  }
}
