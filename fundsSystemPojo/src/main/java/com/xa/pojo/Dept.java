package com.xa.pojo;

import java.io.Serializable;

public class Dept implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*deptno | int(11)
	dname  | varchar(20)
	loc    | varchar(20)*/
	private int deptno;
	private String dname;
	private String loc;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Dept{" +
				"deptno=" + deptno +
				", dname='" + dname + '\'' +
				", loc='" + loc + '\'' +
				'}';
	}
}
