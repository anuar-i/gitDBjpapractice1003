package kz.singularity.gitdbpractice.service;

import kz.singularity.gitdbpractice.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository <School, Long>{
  School findSchoolsBySchoolName(String schoolName);
  @Query("select s.studentQuantity from School s where s.id = :id")
  int findAllByStudentQuantity(Long id);


}
