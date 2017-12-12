# Android-Sensors
Working with android sensors.


Many Android-powered devices include built-in sensors that measure motion, orientation, and environmental conditions such as ambient light or temperature. These sensors can provide data to your app with high precision and accuracy. Sensors can be used to monitor three-dimensional device movement or positioning, or to monitor changes in the environment near a device, such as changes to temperature or humidity. For example, a game might track readings from a device's accelerometer sensor to infer complex user gestures and motions, such as tilt, shake, or rotation

The Android platform supports three broad categories of sensors:

### Motion sensors


These sensors measure acceleration forces and rotational forces along three axes. This category includes accelerometers, gravity sensors, gyroscopes, and rotational vector sensors.
### Environmental sensors

These sensors measure various environmental parameters, such as ambient air temperature and pressure, illumination, and humidity. This category includes barometers, photometers, and thermometers.
### Position sensors

These sensors measure the physical position of a device. This category includes orientation sensors and magnetometers.


You can access sensors available on the device and acquire raw sensor data by using the Android sensor framework. The sensor framework provides several classes and interfaces that help you perform a wide variety of sensor-related tasks. For example, you can use the sensor framework to do the following:

Determine which sensors are available on a device.

Determine an individual sensor's capabilities, such as its maximum range, manufacturer, power requirements, and resolution.


Acquire raw sensor data and define the minimum rate at which you acquire sensor data.


Register and unregister sensor event listeners that monitor sensor changes.


This topic provides an overview of the sensors that are available on the Android platform. It also provides an introduction to the sensor framework.

## About this project

* Get list of sensors aviliable in Phone

* Gets data from the ambient light and proximity sensors, and displays that data

* Displays the device orientation angles as numbers and as colored spots along the four edges of the device screen.


#### Get list of sensors aviliable in Phone

