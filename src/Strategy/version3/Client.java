package Strategy.version3;

public class Client {
    public static void main(String[] args) {
        GoogleMap gm = new GoogleMap();
        gm.findpath("Nilanga", "Pune", "Truck");

        // Registering a new mode dynamically
        CalculatePathFactory.registerMode("Bike", new CalculatePath() {
            public void findpath(String src, String dst) {
                System.out.println(src + " to " + dst + " via Bike (50km)");
            }
        });

        // Using the new registered mode
        gm.findpath("Nilanga", "Pune", "Bike");
    }
}