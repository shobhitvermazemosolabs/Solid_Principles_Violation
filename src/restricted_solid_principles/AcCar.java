package restricted_solid_principles;

//this here demonstrate the open and closed for modification principles
public class AcCar extends Car {
    private static boolean ac_Car=true;
    public static boolean hasAc(){
        return ac_Car;
    }
}
