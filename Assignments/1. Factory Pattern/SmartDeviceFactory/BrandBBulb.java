package SmartDeviceFactory;

/*
 ** This is the BrandBBulb.
 ** This implements the Bulb interface, and is created by the BrandBFactory
 */

public class BrandBBulb implements Bulb{
    private double powerUsage;

    //constructors
    public BrandBBulb(){
    }
    public BrandBBulb(double powerUsage){
        this.powerUsage = powerUsage;
    }

    //set power Usage
    @Override
    public void setPowerUsage(double powerUsage) {
        this.powerUsage = powerUsage;
        System.out.println("The power usage of this Brand B Smart Bulb"+
                            "\nhas been set to: " +powerUsage);
    }
}
