package SmartDeviceFactory;

/*
** This is the Abstract Factory, "Smart Device Factory".
** This is the point of interaction for the client.
** Concrete factories will implement this to create Bulbs and Locks.
*/
public interface SmartDeviceFactory {
    Bulb createBulb();
    Lock createLock();
}
