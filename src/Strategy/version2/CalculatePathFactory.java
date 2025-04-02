package Strategy.version2;

import Strategy.version2.Bus;
import Strategy.version2.CalculatePath;
import Strategy.version2.Car;
import Strategy.version2.Truck;

public class CalculatePathFactory {
    public static CalculatePath getVehical(String mode){
        switch (mode){
            case "Walk": return new Walk();
            case "Truck": return new Truck();
            case "Bus": return new Bus();
            case "Car": return new Car();
            default: return null;
        }
    }
}
