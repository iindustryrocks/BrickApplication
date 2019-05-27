package application;

import comms.controller.I2cController;
import comms.protocol.SensorsTopicsProtocol;
import lejos.hardware.Button;
import lejos.hardware.motor.Motor;
import lejos.hardware.motor.NXTRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import sun.management.Sensor;

public class MainApplication {

    public static void main(String[] args) {
        I2cController i2cComms = new I2cController();

        while (Button.ESCAPE.isUp()) {
            int id = Button.waitForAnyPress();
            if (id == Button.ID_UP) {
                i2cComms.sendData(SensorsTopicsProtocol.BTN_UP.getTopic());
            }
        }

        i2cComms.close();
    }
}
