package Strategy.version2;

public class Bus implements CalculatePath {
    public void findpath(String src,String dst){
        System.out.println(src+" "+dst+"via Bus");
    }
}
