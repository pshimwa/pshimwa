//Pascaline Shimwa 2305000057
package question5;

import java.util.Scanner;

public class TestCellPhone {


	
	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		CellPhone myPhone= new CellPhone("",0,"");
		System.out.println(" what is your phone Manufacture?");
		myPhone.setManufacture(input.next());
		System.out.println(" what is your phone retail price?");
		myPhone.setRetailPrice(input.nextInt());
		System.out.println(" what is your phone model?");
		myPhone.setModel(input.next());

		
		System.out.println(" Manufacture : "+myPhone.getManufacture());
		System.out.println(" Retail Price :$ "+myPhone.getRetailPrice());
		System.out.println(" Model : "+myPhone.getModel());
	}

}
