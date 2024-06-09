//Pascaline Shimwa 2305000057

package question6;

class HourlyEmployee extends Employee {
    private double hourRate;
    private double numberOfHours;

    public HourlyEmployee(String name, String ssn, String address, double hourRate, double numberOfHours) {
        super(name, ssn, address);
        this.hourRate = hourRate;
        this.numberOfHours = numberOfHours;
    }

    public void setHourRate(double hourRate) {
        this.hourRate = hourRate;
    }

    public void setNumberOfHours(double numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    @Override
    public double earnings() {
        return hourRate * numberOfHours;
    }

    @Override
    public void displayDetails() {
        System.out.println("Hourly Employee: " + getName());
        System.out.println("SSN: " + getSsn());
        System.out.println("Address: " + getAddress());
        System.out.println("Hour Rate: " + hourRate);
        System.out.println("Number of Hours: " + numberOfHours);
        System.out.println("Earnings: " + earnings());
    }
}
