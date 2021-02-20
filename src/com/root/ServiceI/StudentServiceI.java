package com.root.ServiceI;

import java.util.List;

import com.root.model.Student;

public interface StudentServiceI 
{
public void addStudent(Student student); 
public List<Student> loginStudent(String studentEmail, String studentMobileNo);
public List<Student> deleteStudent(Integer studentrollNo);
public List<Student> newStudentRegistration(Student student);
public List<Student> editStudent(Integer studentrollNo);
public List<Student> updateStudent(Student student);

}