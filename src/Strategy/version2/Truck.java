package Strategy.version1;

public class Truck implements CalculatePath{
    public void findpath(String src,String dst){
        System.out.println(src+" "+dst+"via Truck");
    }
}
