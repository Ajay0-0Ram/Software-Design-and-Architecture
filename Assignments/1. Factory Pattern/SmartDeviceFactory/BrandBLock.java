package SmartDeviceFactory;

/*
 ** This is the BrandBLock.
 ** This implements the Lock interface, and is created by the BrandBFactory
 */

public class BrandBLock implements Lock{
    private double batteryConsumption;

    //constructors
    public BrandBLock(){
    }
    public BrandBLock(double batterConsumption){
        this.batteryConsumption = batteryConsumption;
    }

    //set battery consumption
    @Override
    public void setBatteryConsumption(double batteryConsumption) {
        this.batteryConsumption = batteryConsumption;
        System.out.println("The battery consumption of this Brand B Smart Lock" +
                             "\nhas been set to: " + this.batteryConsumption);
    }
}
