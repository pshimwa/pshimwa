//Pascaline Shimwa 2305000057
package question2;

import java.util.ArrayList;
import java.util.List;

public class School {

	private ArrayList<Teacher>teachers;
	private ArrayList<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	public School(List<Teacher> teacherList, List<Student> studentList) {
		super();
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned=0;
		totalMoneySpent=0;
	}

	public ArrayList<Teacher> getTeacher() {
		return teachers;
	}

	public void setTeacher(ArrayList<Teacher> teacher) {
		this.teachers = teacher;
	}

	public ArrayList<Student> getStudent() {
		return students;
	}

	public void setStudent(ArrayList<Student> student) {
		this.students = student;
	}
	
	public void addTeacher(Teacher teacher){
		this.teachers.add(teacher);
	
	}
	public void addStudent(Student student){
		this.students.add(student);
	
	}
	public static void updateTotalMoneySpent(int moneySpent){
		totalMoneySpent+=moneySpent;
	}
	public static void updateTotalMoneyEarned(int moneyEarned){
		totalMoneyEarned+=moneyEarned;
	}

	public static int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	public static int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	public static int getBalance(){
		return totalMoneyEarned -totalMoneySpent;
	}
}

