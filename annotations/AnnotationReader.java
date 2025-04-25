package annotations;

import java.lang.reflect.Method;

public class AnnotationReader {
	public static void main(String[] args) {
//		MyService service = new MyService();
//		Class<?> clazz = service.getClass();
		
		Class<MyService> meta = MyService.class;
		
		for(Method method: meta.getDeclaredMethods()) {
			if(method.isAnnotationPresent(Info.class)) {
				Info info = method.getAnnotation(Info.class);
				System.out.println("Method: "+method.getName());
				System.out.println("Name: "+info.name());
				System.out.println("Version: "+info.version());
			}
		}
	}
}
