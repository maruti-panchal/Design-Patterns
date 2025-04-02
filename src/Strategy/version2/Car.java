package Strategy.version1;

public class Car implements CalculatePath{
    public void findpath(String src,String dst){
        System.out.println(src+" "+dst+"via Car Path 80km");
    }
}
