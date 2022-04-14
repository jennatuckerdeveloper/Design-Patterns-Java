package moshStructuralDesignPatterns.bridge;

public class SamsungTv implements Device {
    @Override
    public void turnOn() {
        System.out.println("Samsung tv on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung tv off.");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Samsung tv channel " + number);
    }
}
