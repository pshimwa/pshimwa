//Pascaline Shimwa 2305000057

package question6;

class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String name, String ssn, String address, double grossSales, double commissionRate, double baseSalary) {
        super(name, ssn, address, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return super.earnings() + baseSalary;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Total Earnings: " + earnings());
    }
}
