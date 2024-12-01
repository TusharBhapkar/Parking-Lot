public class Costing {
    public static int calculateCost(String vehicleType) {
    	//TODO: I will update the case for new vehicle 
        switch (vehicleType) {
            case "Car":
                return 20;
            case "Bike":
                return 10;
            case "Bus":
                return 30;
            default:
                return 0;
        }
    }
}
