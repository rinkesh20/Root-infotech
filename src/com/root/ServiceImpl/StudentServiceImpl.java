package com.root.ServiceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.root.DaoI.StudentDaoI;
import com.root.ServiceI.StudentServiceI;
import com.root.model.Student;


@Service
public class StudentServiceImpl implements StudentServiceI
{
	@Autowired
	StudentDaoI studentDao;

	@Override
	public void addStudent(Student student) 
	{
		studentDao.addStudent(student);
		
	}

	@Override
	public List<Student> loginStudent(String studentEmail, String studentMobileNo) {
		List<Student> studentList=studentDao.loginStudent(studentEmail, studentMobileNo);
		return studentList;
	}

	@Override
	public List<Student> deleteStudent(Integer studentrollNo) 
	{
	List<Student> studentList=studentDao.deleteStudent(studentrollNo);
		return studentList;
	}

	@Override
	public List<Student> newStudentRegistration(Student student) {
		List<Student> studentList=studentDao.newStudentRegistration(student);
		return studentList;
	}

	@Override
	public List<Student> editStudent(Integer studentrollNo) 
	{
		List<Student> studentList=studentDao.editStudent(studentrollNo);
		return studentList;
	}

	@Override
	public List<Student> updateStudent(Student student) 
	{
		List<Student> studentList=studentDao.updateStudent(student);
		return studentList;
	}

	
}
