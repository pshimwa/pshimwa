//Pascaline Shimwa 2305000057

package question6;


abstract class Employee {
    private String name;
    private String ssn;
    private String address;

    public Employee(String name, String ssn, String address) {
        this.name = name;
        this.ssn = ssn;
        this.address = address;
    }

    

    public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSsn() {
		return ssn;
	}



	public void setSsn(String ssn) {
		this.ssn = ssn;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public abstract double earnings();

    public abstract void displayDetails();
}
