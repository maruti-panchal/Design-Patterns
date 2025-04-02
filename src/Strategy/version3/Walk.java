package Strategy.version3;

public class Walk implements CalculatePath {
    public void findpath(String src, String dst) {
        System.out.println(src + " to " + dst + " via Walk");
    }
}