//Pascaline Shimwa 2305000057
package question2;

import java.util.ArrayList;
import java.util.List;

public class TestSchool {




	
	public static void main(String[] args) {
		Teacher Alice=new Teacher(1,"Alice",5000);
		Teacher Bob=new Teacher(2,"Bob",7000);
		
		List<Teacher>teacherList=new ArrayList<>();
		teacherList.add(Alice);
		teacherList.add(Bob);
		
		Student Charlie=new Student(1,"Charlie",4);
		Student David=new Student(2,"David",12);
		
		List<Student>studentList=new ArrayList<>();
		studentList.add(Charlie);
		studentList.add(David);
		
		School uok= new School(teacherList,studentList);
		Charlie.payFees(5000);
		David.payFees(6000);
		Alice.receiveSalary(Alice.getSalary());
		Bob.receiveSalary(Bob.getSalary());
		
		System.out.println("Total money earned by school :$"+ School.getTotalMoneyEarned());
		System.out.println("Total money spent by the school: $"+School.getTotalMoneySpent()) ;   
		
	}

}
