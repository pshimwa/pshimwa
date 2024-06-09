//Pascaline shimwa 2305000057
package question5;

import java.util.Scanner;

public class TestCar {




	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		Car myCar= new Car("",0);
		System.out.println(" what is your car make?");
		myCar.setMake(input.next());
		System.out.println(" what is your car Year Model?");
		myCar.setYearModel(input.nextInt());
		
		System.out.println("Make: "+myCar.getMake());
		System.out.println("Year Model: "+myCar.getYearModel());
		
	}

}
