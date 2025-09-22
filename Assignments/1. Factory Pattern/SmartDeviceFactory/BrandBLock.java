package SmartDeviceFactory;

/*
 ** This is the BrandBLock.
 ** This implements the Lock interface, and is created by the BrandBFactory
 */

import java.io.File;

public class BrandBLock implements Lock{
    private double batteryConsumption;

    //constructor
    public BrandBLock(){
    }

    //set batteryConsumption
    @Override
    public void createUsage(File input) {
        //read the battery consumption from File
        UsageReader u = new UsageReader();
        this.batteryConsumption = u.readValue(input, "BrandBLock");

        System.out.println("The battery consumption of this Brand B Smart Lock" +
                "\nhas been set to: " + batteryConsumption+"mAh/day");
    }
}
