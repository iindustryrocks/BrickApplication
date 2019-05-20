package comms.controller;

import lejos.hardware.port.Port;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.I2CSensor;

public class I2cController {
    private I2CSensor slave;

    private static final Port defaultPort = SensorPort.S1;
    private static final int defaultSlaveAddress = 0x08;

    public I2cController(Port port, int slaveAddress) {
        this.slave = new I2CSensor(port, slaveAddress);
    }

    public I2cController() {
        this.slave = new I2CSensor(defaultPort, defaultSlaveAddress);
    }

    public void sendData(int topic, String data) {
        slave.sendData(topic, data.getBytes(), data.getBytes().length);
    }

    public void sendData(int topic) {
        slave.sendData(topic, null, 0);
    }

    public void close() {
        this.close();
    }
}
