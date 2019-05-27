package comms.protocol;

public enum SensorsTopicsProtocol {
    BTN_UP(0),
    BTN_DOWN(1),
    BTN_RIGHT(2),
    BTN_LEFT(3),
    BTN_ENTER(4);

    private int topic;

    SensorsTopicsProtocol(int topic) {
        this.topic = topic;
    }

    public int getTopic() {
        return topic;
    }
}
