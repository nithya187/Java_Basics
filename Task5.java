interface Device {
    void start();
}

interface SmartDevice extends Device {
    void connectToWiFi();
}

class SmartPhone implements SmartDevice {
    @Override
    public void start() {
        System.out.println("SmartPhone is starting...");
    }
    @Override
    public void connectToWiFi() {
        System.out.println("Connected to WiFi");
    }
}

public class Task5 {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        phone.start();
        phone.connectToWiFi();
    }
}
