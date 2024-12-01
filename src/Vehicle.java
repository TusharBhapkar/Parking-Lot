import java.time.LocalTime;
import java.util.Date;

public class Vehicle {
	
	//TODO: Tushar: use lombok to remove the boiler plate code.
	private final String registrationNumber, color, type, timeOfParking;

	public Vehicle(String registrationNumber, String color, String type, String string) {
		this.registrationNumber = registrationNumber;
		this.color = color;
		this.type = type;
		this.timeOfParking = string;
	}

	public String getType() {
		return type;
	}
	
	
	

	// I will update the formatting as needed accourding to the requirement of the project.
	@Override
	public String toString() {
		return "Vehicle [registrationNumber=" + registrationNumber + ", color=" + color + ", type=" + type
				+ ", timeOfParking=" + timeOfParking + "]";
	}

}
