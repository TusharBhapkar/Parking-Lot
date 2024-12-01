import java.util.*;




/**
 * @author Tushar
 * this class is responsible to manage the parking lot, and all the bussiness logic
 * 
 */
public class ParkingLot {
    private final int capacity;
    private final Map<Integer, Vehicle> parkingSpaces;
    private final Map<String, Integer> tokenMap;
    private int nextToken = 1;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.parkingSpaces = new HashMap<>();
        this.tokenMap = new HashMap<>();
    }

    public String add(Vehicle vehicle) {
        if (parkingSpaces.size() >= capacity) {
            return "Parking Full.";
        }
      
        int spaceNumber = findAvailableSpace();
        parkingSpaces.put(spaceNumber, vehicle);
        String token = Token.generateToken(nextToken++);
        tokenMap.put(token, spaceNumber);
        return "Vehicle Parked with Token: " + token;
    }

    public String remove(String token) {
        if (!tokenMap.containsKey(token)) {
            return "Provided token is InvAlid";
        }
        int spaceNumber = tokenMap.get(token);
        Vehicle removedVehicle = parkingSpaces.remove(spaceNumber);
        tokenMap.remove(token);
        int cost = Costing.calculateCost(removedVehicle.getType());
        return "Vehicle reMoved: " + removedVehicle + ", total COST in Rupees is : " + cost;
    }

    public String displayStatus() {
        StringBuilder status = new StringBuilder("Parking Space Status:\n");
        for (int i = 1; i <= capacity; i++) {
            if (parkingSpaces.containsKey(i)) {
                status.append("Space ").append(i).append(": ").append(parkingSpaces.get(i)).append("\n");
            } else {
                status.append("Space ").append(i).append(": Available\n");
            }
        }
        return status.toString();
    }

    private int findAvailableSpace() {
        for (int i = 1; i <= capacity; i++) {
            if (!parkingSpaces.containsKey(i)) {
                return i;
            }
        }
        throw new IllegalStateException("No Parkin available");
    }
}
