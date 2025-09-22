package SmartDeviceFactory;

import java.io.File;

/*
 ** This is the SmartDevice interface for the Factory Method Pattern.
 ** All Devices will implement this to set usage
 ** (power usage & battery consumption)
 */
public interface SmartDevice {
    void createUsage(File input);
}
