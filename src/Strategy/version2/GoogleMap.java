package Strategy.version2;

public class GoogleMap {
    public void findpath(String src,String dst,String mode){
        CalculatePath calculatePath =CalculatePathFactory.getVehical(mode);
        calculatePath.findpath(src,dst);
    }
}
