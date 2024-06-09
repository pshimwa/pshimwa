//Pascaline Shimwa 2305000057
package question5;

public class CellPhone {


String manufacture;
double retailPrice;
String model;

public CellPhone(String manufacture,double retailPrice,String model){
	this.manufacture=manufacture;
	this.retailPrice=retailPrice;
	this.model=model;
}

public String getManufacture() {
	return manufacture;
}

public void setManufacture(String manufacture) {
	this.manufacture = manufacture;
}

public double getRetailPrice() {
	return retailPrice;
}

public void setRetailPrice(double retailPrice) {
	if(retailPrice>=0){
		this.retailPrice = retailPrice;
		}else{
			System.out.println("Invalid retail price");
		}
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

}

