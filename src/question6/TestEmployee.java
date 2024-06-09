//Pascaline Shimwa 2305000057
package question6;

import java.util.Scanner;

public class TestEmployee {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter company name: ");
	        String companyName = scanner.nextLine();

	        System.out.print("Enter company fax number: ");
	        String faxNumber = scanner.nextLine();

	        System.out.print("Enter employee type (Commission/Hourly/Salaried/BasePlusCommission): ");
	        String employeeType = scanner.nextLine();

	        Employee employee = null;

	        System.out.print("Enter employee name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter employee SSN: ");
	        String ssn = scanner.nextLine();

	        System.out.print("Enter employee address: ");
	        String address = scanner.next();

	        switch (employeeType.toLowerCase()) {
	            case "commission":
	                System.out.print("Enter gross sales: ");
	                double grossSales = scanner.nextDouble();

	                System.out.print("Enter commission rate: ");
	                double commissionRate = scanner.nextDouble();

	                employee = new CommissionEmployee(name, ssn, address, grossSales, commissionRate);
	                break;

	            case "hourly":
	                System.out.print("Enter hourly rate: ");
	                double hourlyRate = scanner.nextDouble();

	                System.out.print("Enter hours worked: ");
	                double hoursWorked = scanner.nextDouble();

	                employee = new HourlyEmployee(name, ssn, address, hourlyRate, hoursWorked);
	                break;

	            case "salaried":
	                System.out.print("Enter salary: ");
	                double salary = scanner.nextDouble();

	                System.out.print("Enter bonus: ");
	                double bonus = scanner.nextDouble();

	                System.out.print("Enter deduction: ");
	                double deduction = scanner.nextDouble();

	                employee = new SalariedEmployee(name, ssn, address, salary, bonus, deduction);
	                break;

	            case "basepluscommission":
	                System.out.print("Enter gross sales: ");
	                grossSales = scanner.nextDouble();

	                System.out.print("Enter commission rate: ");
	                commissionRate = scanner.nextDouble();

	                System.out.print("Enter base salary: ");
	                double baseSalary = scanner.nextDouble();

	                employee = new BasePlusCommissionEmployee(name, ssn, address, grossSales, commissionRate, baseSalary);
	                break;

	            default:
	                System.out.println("Invalid employee type!");
	                break;
	        }

	        if (employee != null) {
	            System.out.println("Company Name: " + companyName);
	            System.out.println("Fax Number: " + faxNumber);
	            System.out.println("Employee Details:");
	            System.out.println("Name: " + employee.getName());
	            System.out.println("SSN: " + employee.getSsn());
	            System.out.println("Address: " + employee.getAddress());
	            System.out.println("Earnings: $" + employee.earnings());
	        }

	        scanner.close();
	    }
	}
