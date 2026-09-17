package tw.brad.hibernate.tutor;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.mindrot.jbcrypt.BCrypt;

import tw.brad.hibernate.dao.AccountDao;
import tw.brad.hibernate.entity.Account;
import tw.brad.hibernate.util.HibernateUtil;

public class Brad11 {
	public static void main(String[] args) {
		AccountDao dao = new AccountDao();
		
		Account account = new Account();
		account.setName("test2");
		account.setEmail("test2@brad.tw");
		account.setPasswd(BCrypt.hashpw("12345678", BCrypt.gensalt()));
		
//		dao.addAccount(account);
//		System.out.println(account.getId());
		
		Account a2 = dao.findById(8);
		if (a2 != null) {
			System.out.println(a2.getEmail());
			a2.setName("newTest2");
			dao.updateAccount(a2);
		}
	}
}