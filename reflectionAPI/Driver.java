package reflectionAPI;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Driver {
	
	public static void main(String[] args) throws Exception {
		Class<Employee> employee = Employee.class;
		Field[] fields = employee.getDeclaredFields();
		
		for(Field field:fields) {
			System.out.println(field.getName());
		}
		
		Employee e = new Employee("Trisha",05,21,100000);
		
		Field f = employee.getDeclaredField("name");
		
		f.setAccessible(true);
		f.set(e, "Ram");
		System.out.println(f.get(e));
		
		f.setAccessible(false);
		System.out.println(e.getName());
		System.out.println("---------------------------------------------");
		
		Method[] methods = employee.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method.getName());
		}
		System.out.println("---------------------------=------------------");
		for(Method method : methods) {
			if(method.isAnnotationPresent(Deprecated.class)) {
				System.out.println(method.getName());
				System.out.println(method.invoke(e));
			}
			
		}
	}

}
