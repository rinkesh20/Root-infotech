package com.root.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.root.ServiceI.StudentServiceI;
import com.root.model.Student;

@Controller
public class StudentController
{
	@Autowired
	StudentServiceI studentService;
	@RequestMapping(value = "/addStudent")
	public String addStudent(@ModelAttribute Student student)
	{
		studentService.addStudent(student);
		return "StudentLogin";
		
	}
	@RequestMapping (value = "/studentRegister")
	public String M1()
	{
		
		return "StudentRegistration";
		
	}
	@RequestMapping (value = "/")
	public String M2()
	{
		return "StudentLogin";
		
	}
	@RequestMapping (value = "/studentLogin")
	public ModelAndView loginStudent(@RequestParam String studentEmail, @RequestParam String studentMobileNo) 
	{
		List<Student> studentList=studentService.loginStudent(studentEmail, studentMobileNo);
		return new ModelAndView("StudentSuccess", "studentList", studentList);
		
	}
	@RequestMapping (value = "/deleteStudent")
	public ModelAndView deleteStudent(@RequestParam Integer studentrollNo) 
	{
		List<Student> studentList=studentService.deleteStudent(studentrollNo);
		return new ModelAndView("StudentSuccess", "studentList", studentList);
	}
	
	@RequestMapping(value = "/addNewRegistration")
	public String newStudent() 
	{
	
		return "NewStudentRegistration";
	}
	
	@RequestMapping(value = "/addNEWStudent")
	public ModelAndView addNewStudent(@ModelAttribute Student student) 
	{
		List<Student> studentList=studentService.newStudentRegistration(student);
		return new ModelAndView("StudentSuccess", "studentList", studentList);
		
	}
	
	@RequestMapping(value = "/editStudent")
	public ModelAndView editStudent(Integer studentrollNo) 
	{
		List<Student> studentList=studentService.editStudent(studentrollNo);
		return new ModelAndView("UpdateStudentDetails", "studentList", studentList);
	}
	
	@RequestMapping (value = "/updateStudentDetails")
	public ModelAndView updateStudent (@ModelAttribute Student student) 
	{
		List<Student> studentList=studentService.updateStudent(student);
		return new ModelAndView("StudentSuccess", "studentList", studentList);
		
	}
}
