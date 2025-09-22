package SmartDeviceFactory;

/*
 ** This is the Concrete Factory, "Brand A Factory".
 ** This implements the Smart Device Factory to create Brand A Bulbs and Locks
 */

public class BrandAFactory implements SmartDeviceFactory {

    //create a Brand A Bulb
    public Bulb createBulb(){
        Bulb newBulb = new BrandABulb();
        System.out.println("A new Brand A Smart Bulb has been manufactured.");

        return newBulb;
    }

    //create a Brand A Lock
    public Lock createLock(){
        Lock newLock = new BrandALock();
        System.out.println("A new Brand A Smart Lock has been manufactured.");

        return newLock;
    }
}
