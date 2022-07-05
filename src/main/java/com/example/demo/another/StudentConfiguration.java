//package com.example.demo.configurations;
//
//import com.example.demo.models.Student;
//import com.example.demo.repositories.StudentRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.List;
//
//@Configuration
//public class StudentConfiguration {
//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository repository) {
//        return args -> {
//            Student dg = new Student(
//                    "Damir Gubaidulin",
//                    "gubaidulin.dam@gmail.com",
////                    421,
//                    LocalDate.of(2001, Month.JANUARY, 15)
//            );
//            Student dk = new Student(
//                    "D K",
//                    "k.d@gmail.com",
////                    421,
//                    LocalDate.of(2000, Month.JULY, 3)
//            );
//            Student vg = new Student(
//                    "Valeriy Gubaidulin",
//                    "gubaidulin.val@gmail.com",
////                    531,
//                    LocalDate.of(1998, Month.SEPTEMBER, 9)
//            );
//
//            repository.saveAll(
//                    List.of(dg, dk, vg)
//            );
//        };
//    }
//}
