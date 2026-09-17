package tw.brad.hibernate.tutor;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import jakarta.persistence.Id;
import tw.brad.hibernate.entity.Account;

public class Brad0 {

	public static void main(String[] args) {
		Class<Account> aClass = Account.class;
		
		System.out.println(aClass);
		System.out.println(aClass.getName());
		System.out.println(aClass.getSimpleName());
		
		Field[] fields = aClass.getDeclaredFields();
		for (Field field: fields) {
			System.out.println(field.getName() + ":" +
						field.getType().getName() + ":" 
						+ field.isAnnotationPresent(Id.class));
			if (field.isAnnotationPresent(Id.class)) {
				System.out.println();
			}
		}
		System.out.println("-------");
		Method[] methods = aClass.getDeclaredMethods();
		for(Method method: methods) {
			System.out.println(method.getName());
		}
	}

}
