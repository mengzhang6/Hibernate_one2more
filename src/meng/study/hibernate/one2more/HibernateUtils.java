package meng.study.hibernate.one2more;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate工具类
 * 
 * @author mengzhang6
 *
 */
public class HibernateUtils {

	private static SessionFactory sessionFactory;
	private static Session session;

	static {
		// 配置对象
		Configuration configuration = new Configuration().configure();
		// 服务对象
		StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		// 会话工厂对象
		sessionFactory = configuration
				.buildSessionFactory(standardServiceRegistry);
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static Session getSession() {
		session = sessionFactory.openSession();
		return session;
	}

	public static void closeSession(Session session) {
		if (session != null) {
			session.close();
		}
	}

}
