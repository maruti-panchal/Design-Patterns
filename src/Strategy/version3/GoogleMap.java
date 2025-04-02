package Strategy.version3;

public class GoogleMap {
    public void findpath(String src, String dst, String mode) {
        CalculatePath calculatePath = CalculatePathFactory.getVehicle(mode);
        calculatePath.findpath(src, dst);
    }
}