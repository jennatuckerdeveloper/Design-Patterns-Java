package moshStructuralDesignPatterns.bridge;

public class Main {

    public static void main (String[] args) {
        var remoteControl = new RemoteControl(new SonyTV());
        remoteControl.turnOn();

        var advancedRemoteControl = new AdvancedRemoteControl(new SonyTV());
        advancedRemoteControl.turnOn();

        var remoteControl2 = new RemoteControl(new SamsungTv());
        remoteControl2.turnOn();
        remoteControl2.turnOff();

    }
}
