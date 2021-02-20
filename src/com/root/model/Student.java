package com.root.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer studentrollNo;
private String studentFirstName;
private String studentMiddletName;
private String studentLastName;
private String studentGender;
private String studentDob;
private String studentEmail;
private String studentMobileNo;
private String studentAdharNumber;
private String studentQualification;
private String studentAddress;
private String studentCity;
private Integer studentPinCode;
private String studentTaluka;
private String studentDistrict;
private String studentState;
private String studentCountry;

public String getStudentQualification() {
	return studentQualification;
}
public void setStudentQualification(String studentQualification) {
	this.studentQualification = studentQualification;
}
public Integer getStudentrollNo() {
	return studentrollNo;
}
public void setStudentrollNo(Integer studentrollNo) {
	this.studentrollNo = studentrollNo;
}
public String getStudentFirstName() {
	return studentFirstName;
}
public void setStudentFirstName(String studentFirstName) {
	this.studentFirstName = studentFirstName;
}
public String getStudentMiddletName() {
	return studentMiddletName;
}
public void setStudentMiddletName(String studentMiddletName) {
	this.studentMiddletName = studentMiddletName;
}
public String getStudentLastName() {
	return studentLastName;
}
public void setStudentLastName(String studentLastName) {
	this.studentLastName = studentLastName;
}
public String getStudentGender() {
	return studentGender;
}
public void setStudentGender(String studentGender) {
	this.studentGender = studentGender;
}
public String getStudentDob() {
	return studentDob;
}
public void setStudentDob(String studentDob) {
	this.studentDob = studentDob;
}
public String getStudentEmail() {
	return studentEmail;
}
public void setStudentEmail(String studentEmail) {
	this.studentEmail = studentEmail;
}
public String getStudentMobileNo() {
	return studentMobileNo;
}
public void setStudentMobileNo(String studentMobileNo) {
	this.studentMobileNo = studentMobileNo;
}
public String getStudentAdharNumber() {
	return studentAdharNumber;
}
public void setStudentAdharNumber(String studentAdharNumber) {
	this.studentAdharNumber = studentAdharNumber;
}
public String getStudentAddress() {
	return studentAddress;
}
public void setStudentAddress(String studentAddress) {
	this.studentAddress = studentAddress;
}
public String getStudentCity() {
	return studentCity;
}
public void setStudentCity(String studentCity) {
	this.studentCity = studentCity;
}
public Integer getStudentPinCode() {
	return studentPinCode;
}
public void setStudentPinCode(Integer studentPinCode) {
	this.studentPinCode = studentPinCode;
}
public String getStudentTaluka() {
	return studentTaluka;
}
public void setStudentTaluka(String studentTaluka) {
	this.studentTaluka = studentTaluka;
}
public String getStudentDistrict() {
	return studentDistrict;
}
public void setStudentDistrict(String studentDistrict) {
	this.studentDistrict = studentDistrict;
}
public String getStudentState() {
	return studentState;
}
public void setStudentState(String studentState) {
	this.studentState = studentState;
}
public String getStudentCountry() {
	return studentCountry;
}
public void setStudentCountry(String studentCountry) {
	this.studentCountry = studentCountry;
}

}
