package model;

public class Crops {

	int cropID;
	String name;
	double price;
	String msp;
	double quantity;

	public int getCropID() {
		return cropID;
	}

	public void setCropID(int cropID) {
		this.cropID = cropID;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getMsp() {
		return msp;
	}

	public void setMsp(String msp) {
		this.msp = msp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

}