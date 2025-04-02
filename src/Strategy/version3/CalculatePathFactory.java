package Strategy.version2;

import java.util.HashMap;
import java.util.Map;

public class CalculatePathFactory {
    private static final Map<String, CalculatePath> transportModes = new HashMap<>();

    static {
        transportModes.put("Walk", new Walk());
        transportModes.put("Truck", new Truck());
        transportModes.put("Bus", new Bus());
        transportModes.put("Car", new Car());
    }

    public static void registerMode(String mode, CalculatePath path) {
        transportModes.put(mode, path);
    }

    public static CalculatePath getVehicle(String mode) {
        CalculatePath transport = transportModes.get(mode);
        if (transport == null) {
            throw new IllegalArgumentException("Invalid transportation mode: " + mode);
        }
        return transport;
    }
}