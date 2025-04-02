package Strategy.version3;

public class Truck implements CalculatePath {
    public void findpath(String src, String dst) {
        System.out.println(src + " to " + dst + " via Truck");
    }
}