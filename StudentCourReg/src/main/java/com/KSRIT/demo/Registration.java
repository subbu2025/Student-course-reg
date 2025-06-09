package com.KSRIT.demo;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "registrations")
public class Registration {

  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Student getStudent() {
	return student;
}

public void setStudent(Student student) {
	this.student = student;
}

public Course getCourse() {
	return course;
}

public void setCourse(Course course) {
	this.course = course;
}

public LocalDate getRegistrationDate() {
	return registrationDate;
}

public void setRegistrationDate(LocalDate registrationDate) {
	this.registrationDate = registrationDate;
}

	@ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    private LocalDate registrationDate;

    
}
