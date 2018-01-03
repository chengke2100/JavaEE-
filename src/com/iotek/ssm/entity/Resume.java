package com.iotek.ssm.entity;

public class Resume {
	private int rid;
	private int uid;
	private String realName;
	private String sex;
	private int age;
	private String education;//学历
	private String phoneNumber;
	private String email;
	private Position position;//应聘职位
	private String politicalStatus;//政治面貌
	private String previousJob;//上份工作
	private String workExperience;//工作经验
	private String expectedSalary;//期望薪资
	private String hobbys;
	public Resume() {
		super();
	}
	public Resume(int rid, int uid, String realName, String sex, int age, String education, String phoneNumber,
			String email, Position position, String politicalStatus, String previousJob, String workExperience,
			String expectedSalary, String hobbys) {
		super();
		this.rid = rid;
		this.uid = uid;
		this.realName = realName;
		this.sex = sex;
		this.age = age;
		this.education = education;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.position = position;
		this.politicalStatus = politicalStatus;
		this.previousJob = previousJob;
		this.workExperience = workExperience;
		this.expectedSalary = expectedSalary;
		this.hobbys = hobbys;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public String getPoliticalStatus() {
		return politicalStatus;
	}
	public void setPoliticalStatus(String politicalStatus) {
		this.politicalStatus = politicalStatus;
	}
	public String getPreviousJob() {
		return previousJob;
	}
	public void setPreviousJob(String previousJob) {
		this.previousJob = previousJob;
	}
	public String getWorkExperience() {
		return workExperience;
	}
	public void setWorkExperience(String workExperience) {
		this.workExperience = workExperience;
	}
	public String getExpectedSalary() {
		return expectedSalary;
	}
	public void setExpectedSalary(String expectedSalary) {
		this.expectedSalary = expectedSalary;
	}
	public String getHobbys() {
		return hobbys;
	}
	public void setHobbys(String hobbys) {
		this.hobbys = hobbys;
	}
	@Override
	public String toString() {
		return "Resume [rid=" + rid + ", uid=" + uid + ", realName=" + realName + ", sex=" + sex + ", age=" + age
				+ ", education=" + education + ", phoneNumber=" + phoneNumber + ", email=" + email + ", position="
				+ position + ", politicalStatus=" + politicalStatus + ", previousJob=" + previousJob
				+ ", workExperience=" + workExperience + ", expectedSalary=" + expectedSalary + ", hobbys=" + hobbys
				+ "]";
	}
	
	
}
