package com.safziy.hibernate.model;

public class Student {
	private long sid;
	private String sname;
	private String gender;
	private long birth;

	public Student() {
	}

	public Student(long sid, String sname, String gender, long birth) {
		this.sid = sid;
		this.sname = sname;
		this.gender = gender;
		this.birth = birth;
	}

	public long getSid() {
		return sid;
	}

	public void setSid(long sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getBirth() {
		return birth;
	}

	public void setBirth(long birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", gender=" + gender + ", birth=" + birth + "]";
	}

}
