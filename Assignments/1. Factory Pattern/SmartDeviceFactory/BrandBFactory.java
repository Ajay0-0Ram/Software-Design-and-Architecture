package SmartDeviceFactory;

/*
 ** This is the Concrete Factory, "Brand B Factory".
 ** This implements the Smart Device Factory to create Brand B Bulbs and Locks
 */

public class BrandBFactory implements SmartDeviceFactory{

    //create a Brand B Bulb
    public Bulb createBulb(){
        Bulb newBulb = new BrandABulb();
        System.out.println("A new Brand B Smart Bulb has been manufactured.");

        return newBulb;
    }

    //create a Brand B Lock
    public Lock createLock(){
        Lock newLock = new BrandBLock();
        System.out.println("A new Brand B Smart Lock has been manufactured.");

        return newLock;
    }
}
