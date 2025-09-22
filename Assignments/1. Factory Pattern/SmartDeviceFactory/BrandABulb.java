package SmartDeviceFactory;

/*
 ** This is the BrandABulb.
 ** This implements the Bulb interface, and is created by the BrandAFactory
 */

import java.io.File;

public class BrandABulb implements Bulb{
    private double powerUsage;

    //constructor
    public BrandABulb(){
    }

    //set power usage
    @Override
    public void createUsage(File input) {
        //read the power Usage from File
        UsageReader u = new UsageReader();
        this.powerUsage = u.readValue(input, "BrandABulb");

        System.out.println("The power usage of this Brand A Smart Bulb" +
                "\nhas been set to: " + powerUsage+'W');
    }
}
