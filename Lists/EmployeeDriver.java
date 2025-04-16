package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class EmployeeDriver {
	public static void main(String[] args) {
		ArrayList <Employee>employee=new ArrayList<Employee>();
		
		employee.add(new Employee(10,"Rohit"));
		employee.add(new Employee(1,"Naveen"));
		employee.add(new Employee(3,"Dhanish"));

		
		for(Employee e:employee) {
			System.out.println(e);
		}
		
		//System.out.println(employee);
		
		ArrayList<Integer>a1=new ArrayList<>();
		a1.add(10);
		a1.add(50);
		a1.add(30);
		a1.add(20);
		a1.add(90);
		
		/*for(int i:a1) {
			System.out.println(i);
		}*/
		//ConcurrentModificationException is created for manipulating arrayList
		//break is used to avoid after manipulating the arrayList
		/*for(int i:a1) {
			if(i==30) {
				Integer x=i;
				a1.remove(x);
				break;
			}
		}*/
		
		Iterator<Integer> itr = a1.iterator();

		while(itr.hasNext()) {
			int x=itr.next();
			if(x==30) {
				itr.remove();
			}
		}
		System.out.println(a1);
		


		//Iterator<Employee>emp=employee.iterator();
		/*while(emp.hasNext()) {
			Employee e=emp.next();
			if(e.name.equals("Naveen")) {
				emp.remove();
			}
		}
		System.out.println(employee);*/
		
		
		System.out.println("---------------------------------------------------------------------------------");
		//ListIterator
		
		ListIterator<Integer> list=a1.listIterator();
		//traversing in forward direction and it will take the iterator to last thats why we are not able to run the next loop without reseting the iterator
		
		while(list.hasNext()) {
			System.out.println("Index: "+list.nextIndex()+"   "+"Element: "+list.next());
		}
		//reseting the cursor back to first position
		while(list.hasPrevious()) {
			list.previous();
		}
		System.out.println("--------------------------------");

		while(list.hasNext()) {
			int index=list.nextIndex();
			if(index==1) {
				list.add(60);
			}
			int element=(Integer)list.next();

			if(element==50) {
				list.set(100);
			}
		}
		System.out.println(a1);
		
		
		ArrayList<Integer> e2=new ArrayList<Integer>();
		e2.add(10);
		e2.add(5);
		e2.add(2);
		e2.add(25);
		Collections.sort(e2);
		System.out.println(e2);
		
		System.out.println("-----------------------------------------------------------");
		//sorting based on id using comparable
		Collections.sort(employee);
		System.out.println(employee);
		//sorting based on name using comparator
		
		CompareByName comparatorObject=new CompareByName();
		Collections.sort(employee,comparatorObject);
		//Collections.sort(employee, new CompareByName());
		System.out.println(employee);
	}

}
