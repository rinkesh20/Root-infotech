package com.root.dto;

import com.root.model.User;

public class ResponceDTO 
{
private String timestamp;
private String responceMsg;
private String responceCode;
private User record;
public String getTimestamp() {
	return timestamp;
}
public void setTimestamp(String timestamp) {
	this.timestamp = timestamp;
}
public String getResponceMsg() {
	return responceMsg;
}
public void setResponceMsg(String responceMsg) {
	this.responceMsg = responceMsg;
}
public String getResponceCode() {
	return responceCode;
}
public void setResponceCode(String responceCode) {
	this.responceCode = responceCode;
}
public User getRecord() {
	return record;
}
public void setRecord(User record) {
	this.record = record;
}



}
