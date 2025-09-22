package TestFiles;

import SmartDeviceFactory.*;

import javax.xml.crypto.Data;
import java.io.File;

public class Test {
    public static void main(String[] args) {
        //simulated database with battery consumption and power usage
        File Database = new File ("src/TestFiles/SmartDeviceFactoryDatabase.txt");

        //create a Brand A Bulb
        SmartDeviceFactory FactoryA = new BrandAFactory();
        Bulb bulb = FactoryA.createBulb();
        bulb.createUsage(Database);

        System.out.println();

        //create a Brand B Lock
        SmartDeviceFactory FactoryB = new BrandBFactory();
        Lock lock = FactoryB.createLock();
        lock.createUsage(Database);

    }
}