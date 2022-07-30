package com.springcore;

public class Tution {

	private String tutorname;

	@Override
	public String toString() {
		return "Tution [tutorname=" + tutorname + "]";
	}

	public Tution() {
		// TODO Auto-generated constructor stub
	}

	public String getTutorname() {
		return tutorname;
	}

	public void setTutorname(String tutorname) {
		this.tutorname = tutorname;
	}

	public Tution(String tutorname) {
		super();
		this.tutorname = tutorname;
	}

}
