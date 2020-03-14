package lab7;

import java.util.ArrayList;

public class ListExample {
	 public static void main(String[] args) {
		
		 
		 ArrayList <Employee>employee  = new ArrayList<>();
		 employee.add(new Employee (3, "great" ,2000.0));
		 employee.add(new Employee (123,"nice",30.0));
		 employee.add(new Employee (12,"interasting",40.0));
		   employee.add(new Employee (123,"okay",50.00));
		
			System.out.println("------------------");
			
			
			
			for(Employee e  : employee) {
				System.out.println(e);
		 
		
		
		 
	 }
	 }
}


