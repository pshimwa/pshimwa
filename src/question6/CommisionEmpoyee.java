//Pascaline Shimwa 2305000057

package question6;
class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String name, String ssn, String address, double grossSales, double commissionRate) {
        super(name, ssn, address);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Commission Employee: " + getName());
        System.out.println("SSN: " + getSsn());
        System.out.println("Address: " + getAddress());
        System.out.println("Gross Sales: " + grossSales);
        System.out.println("Commission Rate: " + commissionRate);
        System.out.println("Earnings: " + earnings());
    }
}
