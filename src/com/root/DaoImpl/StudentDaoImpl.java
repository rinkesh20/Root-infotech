package com.root.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.root.DaoI.StudentDaoI;
import com.root.model.Student;
@Repository
public class StudentDaoImpl implements StudentDaoI 
{
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void addStudent(Student student) 
	{
		Session session=sessionFactory.openSession();
		session.save(student);
		session.beginTransaction().commit();
		
	}
	@Override
	public List<Student> loginStudent(String studentEmail, String studentMobileNo) 
	{
		if(studentEmail.equalsIgnoreCase("root@gmail.com") && studentMobileNo.equalsIgnoreCase("root"))
		{
			Session session =sessionFactory.openSession();
			String query="from Student";
			TypedQuery typequery= session.createQuery(query);
			List<Student> studentList=typequery.getResultList();
			return studentList;
		}
		else
		{
			Session session =sessionFactory.openSession();
			String query="from Student where studentEmail='"+studentEmail+"' and studentMobileNo='"+studentMobileNo+"'";
			TypedQuery typequery= session.createQuery(query);
			Student student=(Student)typequery.getSingleResult();
			List<Student> studentList=new ArrayList<Student>();
			studentList.add(student);
			return studentList;
		}
		
		
	}
	
	@Override
	public List<Student> deleteStudent(Integer studentrollNo) 
	{
		Session session= sessionFactory.openSession();
		Student student= session.get(Student.class, studentrollNo);
		session.delete(student);
		session.beginTransaction().commit();
		
		String query="from Student";
		TypedQuery typequery= session.createQuery(query);
		List<Student> studentList=typequery.getResultList();
		return studentList;
	}
	
	@Override
	public List<Student> newStudentRegistration(Student student) 
	{
		Session session=sessionFactory.openSession();
		session.save(student);
		session.beginTransaction().commit();
		
		String query="from Student";
		TypedQuery typequery= session.createQuery(query);
		List<Student> studentList=typequery.getResultList();
		return studentList;
	}
	@Override
	public List<Student> editStudent(Integer studentrollNo) 
	{
		Session session= sessionFactory.openSession();
		Student student= session.get(Student.class, studentrollNo);
		List<Student> studentList=new ArrayList<Student>();
		studentList.add(student);
		return studentList;
	}
	@Override
	public List<Student> updateStudent(Student student) 
	{
		Session session= sessionFactory.openSession();
		session.update(student);
		session.beginTransaction().commit();
		String query="from Student";
		TypedQuery typequery= session.createQuery(query);
		List<Student> studentList=typequery.getResultList();
		return studentList;
		
	}
	

}
