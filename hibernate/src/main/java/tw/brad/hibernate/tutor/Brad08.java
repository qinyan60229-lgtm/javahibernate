package tw.brad.hibernate.tutor;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import tw.brad.hibernate.util.HibernateUtil;

public class Brad08 {
	public static void main(String[] args) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			Transaction transaction = session.beginTransaction();

			String sql = """
					SELECT * FROM account
					""";
			NativeQuery query = session.createNativeQuery(sql);
			List list = query.getResultList();
			
			int n = query.executeUpdate();
			System.out.println(n);
			
			transaction.commit();
		}
	}
}