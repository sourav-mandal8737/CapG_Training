package Reflection_Api;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class EmployeeDriver {
	public static void main(String[] args) throws Exception{
		Class<Employee> employeeClass=Employee.class;
		
		//fetching all the field names of a class
		Field[] fields=employeeClass.getDeclaredFields();
		
		for(Field field:fields) {
			System.out.println(field.getName());
	
		}
		
		System.out.println("-----------------------------------------------");
		
		//changing the value of a field of a particular object
		Employee e=new Employee(1,"Rohit",30000,26);

		Field f=employeeClass.getDeclaredField("name");
		
		f.setAccessible(true);
		f.set(e,"Ram");
		System.out.println(f.get(e));
		f.setAccessible(false);
		System.out.println(e.getName());
		
		System.out.println("-------------------------------------------");
		
		Method[] methods=employeeClass.getDeclaredMethods();
		for(Method method:methods) {
			System.out.println(method.getName());
		}
		
		System.out.println("---------------------------");
		
		for(Method method:methods) {
			if(method.isAnnotationPresent(Deprecated.class)) {
				System.out.println(method.getName());
				System.out.println(method.invoke(e));
			}
		}
	}

}
