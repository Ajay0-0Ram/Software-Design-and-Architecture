package SmartDeviceFactory;

/*
 ** This is the BrandALock.
 ** This implements the Lock interface, and is created by the BrandAFactory
 */

import java.io.File;

public class BrandALock implements Lock{
    private double batteryConsumption;

    //constructor
    public BrandALock(){
    }

    //set Battery Consumption
    @Override
    public void createUsage(File input) {
        //read the power Usage from File
        UsageReader u = new UsageReader();
        this.batteryConsumption = u.readValue(input, "BrandALock");

        System.out.println("The power usage of this Brand A Smart Lock" +
                "\nhas been set to: " + batteryConsumption+"mAh/day");
    }
}
