package Strategy.version3;

public class Car implements CalculatePath {
    public void findpath(String src, String dst) {
        System.out.println(src + " to " + dst + " via Car (80km)");
    }
}