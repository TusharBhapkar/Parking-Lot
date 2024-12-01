import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(10000);

        System.out.println(parkingLot.displayStatus());
        
        TimeUtilitize t = new TimeUtilitize();

        Vehicle car1 = new Vehicle("MH 12 CJ 0527", "Red", "Car", t.getCurrentTime());
        Vehicle car2 = new Vehicle("MH 12 HP 0528", "Blue", "Car", t.getCurrentTime());

        System.out.println(parkingLot.add(car1));
        System.out.println(parkingLot.add(car2));

        Vehicle car3 = new Vehicle("MH 12 ZQ 0529", "Green", "Car", t.getCurrentTime());
        System.out.println(parkingLot.add(car3));

        System.out.println(parkingLot.displayStatus());

        //System.out.println("before removing");
        System.out.println(parkingLot.remove("P1"));
        System.out.println(parkingLot.displayStatus());
    }
}
