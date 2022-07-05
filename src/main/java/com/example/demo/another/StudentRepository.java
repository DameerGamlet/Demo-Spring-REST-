//package com.example.demo.repositories;
//
//import com.example.demo.models.Student;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import java.util.Optional;
//
//@Repository
//public interface StudentRepository extends JpaRepository<Student, Long> {
//    @Query(value = "SELECT s.* FROM student s WHERE s.email = :a", nativeQuery = true)
//    Optional<Student> findStudentByEmail(@Param("a") String email);
//}
