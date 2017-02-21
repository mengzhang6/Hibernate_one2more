package meng.study.hibernate.test;

import meng.study.hibernate.one2more.Grade;
import meng.study.hibernate.one2more.HibernateUtils;
import meng.study.hibernate.one2more.Student;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class One2MoreTest {

	/**
	 * 单向一对多
	 * 新建一个班级对象和两个学生对象，并将这两个学生对象放到此班级中
	 */
	@Test
	public void testSave() {
		Grade grade = new Grade("物联网12", "**学院2012级物联网工程");
		Student stu1 = new Student("张明", "男");
		Student stu2 = new Student("张花", "女");
		grade.getStudents().add(stu1);
		grade.getStudents().add(stu2);

		Session session = HibernateUtils.getSession();
		// 开启事务
		Transaction transaction = session.beginTransaction();
		session.save(grade);
		session.save(stu1);
		session.save(stu2);
		// 提交事务
		transaction.commit();
		HibernateUtils.closeSession(session);
	}
	
	/**
	 * 获取班级id为1的班级信息
	 */
	@Test
	public void testSelect() {
		Session session = HibernateUtils.getSession();
		Grade grade = (Grade)session.get(Grade.class, 1);
		System.out.println(grade);
		HibernateUtils.closeSession(session);
	}
	
	/**
	 * 新建一个班级，并将班级1中的学生1移到新建班级中
	 */
	@Test
	public void testUpdate() {
		Grade grade = new Grade("软件12", "**学院2012级软件工程");
		Session session = HibernateUtils.getSession();
		// 开启事务
		Transaction transaction = session.beginTransaction();
		Student student = (Student)session.get(Student.class, 1);
		grade.getStudents().add(student);
		session.save(grade);
		// 提交事务
		transaction.commit();
		HibernateUtils.closeSession(session);
	}
	
	

}
