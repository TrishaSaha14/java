package annotations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class EmployeeDriver {
	public static void main(String[] args) throws Exception {
		Employee emp = new Employee();
		Class<?> cls = emp.getClass();
		
//		
		for(Field field:cls.getDeclaredFields()) {
			if(field.isAnnotationPresent(Salary.class)) {
				Salary annotation = field.getAnnotation(Salary.class);
				field.setAccessible(true);
				field.set(emp, annotation.salary());
				System.out.println(emp);
			}
		}
//		for(Method method: meta.getDeclaredMethods()) {
//			if(method.isAnnotationPresent(Info.class)) {
//				Info info = method.getAnnotation(Info.class);
//				System.out.println("Method: "+method.getName());
//				System.out.println("Name: "+info.name());
//				System.out.println("Version: "+info.version());
//			}
//		}
	}
}
