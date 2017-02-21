package meng.study.hibernate.one2more;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 班级类
 * 
 * @author mengzhang6
 *
 */
public class Grade implements Serializable {

	private static final long serialVersionUID = 1L;
	private int gid;
	private String gname;
	private String gdesc;
	// 一个班级包含多个学生，单向一对多
	private Set<Student> students = new HashSet<Student>();

	// 要有 无参构造方法
	public Grade() {
	}

	public Grade(String gname, String gdesc) {
		this.gname = gname;
		this.gdesc = gdesc;
	}

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getGdesc() {
		return gdesc;
	}

	public void setGdesc(String gdesc) {
		this.gdesc = gdesc;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Grade [gid=" + gid + ", gname=" + gname + ", gdesc=" + gdesc
				+ ", students=" + students + "]";
	}

}
