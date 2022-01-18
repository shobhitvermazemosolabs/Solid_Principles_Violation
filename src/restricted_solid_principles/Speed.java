package restricted_solid_principles;

//import Restricted_SOLID_Principles.bike;
//import Restricted_SOLID_Principles.car;

import java.util.*;
//the class names must start with the first Capital letter
public class Speed {

    public static Vehicle checkVehicleSpeed(String vehicleType){
        if(vehicleType.equals("Restricted_SOLID_Principles.bike")){
            return new Bike();
        }
        else if(vehicleType.equals("Restricted_SOLID_Principles.car")){
            return new Car();
        }
        else
        {
            return null;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String vehicleType=in.next();
        Vehicle vehicleObject=checkVehicleSpeed(vehicleType);
        if(vehicleObject==null){
            System.out.println("The Restricted_SOLID_Principles.vehicle Type object is not yet added");
        }
        else
        {
            vehicleObject.printSpeed();
        }
    }
}
