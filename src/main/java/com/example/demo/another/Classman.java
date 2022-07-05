//package com.example.demo.models;
//
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "classman",
//        uniqueConstraints = {
//                @UniqueConstraint(name = "classman_email_unique", columnNames = "email")
//        }
//)
//@Getter
//@Setter
//@NoArgsConstructor
//public class Classman {
//    @Id
//    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
//    @Column(name = "id", updatable = false)
//    private Long id;
//
//    @Column(name = "first_name", nullable = false, columnDefinition = "TEXT")
//    private String firstName;
//
//    @Column(name = "last_name", nullable = false, columnDefinition = "TEXT")
//    private String lastName;
//
//    @Column(name = "email", nullable = false, columnDefinition = "TEXT")
//    private String email;
//
//    @Column(name = "age")
//    private Integer age;
//
//    public Classman(Long id, String firstName, String lastName, String email, Integer age) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.age = age;
//    }
//
//    public Classman(String firstName, String lastName, String email, Integer age) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.age = age;
//    }
//}
