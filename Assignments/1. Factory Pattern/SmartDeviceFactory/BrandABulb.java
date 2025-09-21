package SmartDeviceFactory;

/*
 ** This is the BrandABulb.
 ** This implements the Bulb interface, and is created by the BrandAFactory
 */

public class BrandABulb implements Bulb{
    private double powerUsage;

    //constructors
    public BrandABulb(){
    }
    public BrandABulb(double powerUsage){
        this.powerUsage = powerUsage;
    }

    //set power usage
    @Override
    public void setPowerUsage(double powerUsage) {
        this.powerUsage = powerUsage;
        System.out.println("The power usage of this Brand A Smart Bulb"+
                            "\nhas been set to: " + this.powerUsage);
    }
}
