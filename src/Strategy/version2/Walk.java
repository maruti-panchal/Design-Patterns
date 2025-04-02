package Strategy.version1;

public class Walk implements CalculatePath{
    public void findpath(String src,String dst){
        System.out.println(src+" "+dst+"via Walk");
    }
}
