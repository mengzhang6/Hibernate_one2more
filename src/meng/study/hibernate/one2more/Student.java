package meng.study.hibernate.one2more;

import java.io.Serializable;

/**
 * 学生类
 * 
 * @author mengzhang6
 *
 */
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	private int sid;
	private String sname;
	private String sex;

	public Student(String sname, String sex) {
		this.sname = sname;
		this.sex = sex;
	}

	// 无参构造方法
	public Student() {
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sex=" + sex
				+ "]";
	}

}
