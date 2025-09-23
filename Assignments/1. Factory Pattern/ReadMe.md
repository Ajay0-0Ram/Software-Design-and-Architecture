<img width="935" height="601" alt="image" src="https://github.com/user-attachments/assets/20136c02-d52a-45c6-8b80-15c748e1b24f" />



**Software Design and Architecture - Assignment 1**
**Group 33**

Ajay Ramsaran - 100919041 | Muhammad Saad - 100916536 | Zaid Mostafa - 100871060

Description:

The TestFiles contain the SmartDeviceFactoryDatabase text file used for the database and the test cases. The SmartDeviceFactory file contains all classes and interfaces used for implementation. The BrandAFactory and BrandBFactory classes implement the SmartDeviceFactory, creating the Bulb and Lock interfaces which are used by classes BrandABulb and BrandBBulb as well as classes ClassALock and ClassBLock respectively.

Test Method:

The Test class tests the Abstract Factory implementation by creating a bulb and a lock from the two brands and verifying their behavior. It uses the SmartDeviceFactoryDatabase.txt database file as input, then instantiates a BrandAFactory to create a Bulb and a BrandBFactory to create a Lock. Each device calls its createUsage method to process data from the database, ensuring both the factory creation and device usage functions as intended.

<img width="835" height="718" alt="image" src="https://github.com/user-attachments/assets/1a86042e-d1dc-4b5e-9720-b18bcd8a8e43" />



<img width="834" height="356" alt="image" src="https://github.com/user-attachments/assets/de98f4f8-268e-49a4-a51a-279b05c90472" />

