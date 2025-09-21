package SmartDeviceFactory;

/*
 ** This is the BrandALock.
 ** This implements the Lock interface, and is created by the BrandAFactory
 */

public class BrandALock implements Lock{
    private double batteryConsumption;

    //constructors
    public BrandALock(){
    }
    public BrandALock(double batterConsumption){
        this.batteryConsumption = batteryConsumption;
    }

    //set battery consumption
    @Override
    public void setBatteryConsumption(double batteryConsumption) {
        this.batteryConsumption = batteryConsumption;
        System.out.println("The battery consumption of this Brand A Smart Lock" +
                            "\nhas been set to: " + this.batteryConsumption);
    }
}
