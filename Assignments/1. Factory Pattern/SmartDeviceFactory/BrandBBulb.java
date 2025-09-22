package SmartDeviceFactory;

/*
 ** This is the BrandBBulb.
 ** This implements the Bulb interface, and is created by the BrandBFactory
 */

import java.io.File;

public class BrandBBulb implements Bulb{
    private double powerUsage;

    //constructor
    public BrandBBulb(){
    }

    //set power Usage
    @Override
    public void createUsage(File input) {
        //read the power Usage from File
        UsageReader u = new UsageReader();
        this.powerUsage = u.readValue(input, "BrandBBulb");

        System.out.println("The power usage of this Brand B Smart Bulb" +
                "\nhas been set to: " + powerUsage+'W');
    }
}
