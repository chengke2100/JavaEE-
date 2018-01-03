package com.iotek.ssm.entity;

import java.util.Date;

public class User {
	private int uid;
	private String userName;
	private String password;
	private int type;//用户类型
	private Date entryDate;//入职时间
	private Department department;
	private Position position;
	private String resignationReason;//离职原因
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public Date getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getResignationReason() {
		return resignationReason;
	}
	public void setResignationReason(String resignationReason) {
		this.resignationReason = resignationReason;
	}
	
	public User() {
		super();
	}
	
	public User(int uid, String userName, String password, int type, Date entryDate, Department department,
			Position position, String resignationReason) {
		super();
		this.uid = uid;
		this.userName = userName;
		this.password = password;
		this.type = type;
		this.entryDate = entryDate;
		this.department = department;
		this.position = position;
		this.resignationReason = resignationReason;
	}
	
	public User(String userName, String password, int type, Date entryDate) {
		super();
		this.userName = userName;
		this.password = password;
		this.type = type;
		this.entryDate = entryDate;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", userName=" + userName + ", password=" + password + ", type=" + type
				+ ", entryDate=" + entryDate + ", department=" + department + ", position=" + position
				+ ", resignationReason=" + resignationReason + "]";
	}
	
	
}
