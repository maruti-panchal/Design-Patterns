package Strategy.version1;

public class GoogleMap {
    public void findpath(String src,String dst,String mode){
        if(mode.equals("Car")){
            System.out.println(src+" "+dst+"via Car Path 80km");
        }
        else if(mode.equals("Bus")){
            System.out.println(src+" "+dst+"via Bus Path 100km");
        }
        else if(mode.equals("Truck")){
            System.out.println(src+" "+dst+"via Truck Path 120");
        }
        else if(mode.equals("Walk")){
            System.out.println(src+" "+dst+"via Walk Path 60km");
        }
    }
}
