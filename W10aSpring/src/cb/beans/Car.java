package cb.beans;

public class Car {
	private String chassisNumber;
	private String color;
	private double price;

	public Car() {}
	
	public Car(String chassisNumber, String color, double price) {
		this.chassisNumber = chassisNumber;
		this.color = color;
		this.price = price;
	}
	
	public String getChassisNumber() {
		return chassisNumber;
	}
	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [Chassis number = " + chassisNumber + ", Color = " + color + ", Price = " + price + "]";
	}	

}
