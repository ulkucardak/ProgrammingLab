package group_Studies;

public class ParkingMeterObject {
    public static void main(String[] args) {

            ParkingMeter pm = new ParkingMeter(50);

            pm.add(25);
            System.out.println("pm = " + pm.timeLeft);

            while (!pm.isExpired()){
                pm.tick();
                System.out.println("pm.timeLeft = " + pm.timeLeft);
            }
        }
    }

