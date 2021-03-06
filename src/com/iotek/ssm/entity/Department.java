package com.iotek.ssm.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Department {
	private int did;
	private String deptName;
	private Date createTime;
	private Set<Position> positions = new HashSet<Position>();
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	
	
	public Set<Position> getPositions() {
		return positions;
	}
	public void setPositions(Set<Position> positions) {
		this.positions = positions;
	}
	public Department() {
		super();
	}
	
	
	
	public Department(int did, String deptName, Date createTime, Set<Position> positions) {
		super();
		this.did = did;
		this.deptName = deptName;
		this.createTime = createTime;
		this.positions = positions;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", deptName=" + deptName + ", createTime=" + createTime + ", positions="
				+ positions + "]";
	}
	
	

}
