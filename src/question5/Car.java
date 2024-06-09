//Pascaline Shimwa 2305000057
package question5;

public class Car {

String make;
int yearModel;

public Car(String make, int yearModel){
	this.make=make;
	this.yearModel=yearModel;
	
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public int getYearModel() {
	return yearModel;
}
public void setYearModel(int yearModel) {
	if(yearModel>1885){
		this.yearModel = yearModel;
	}else{
		System.out.println("Invalid year model.");
	}
	
}
 

}
