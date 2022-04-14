package moshBehavioralDesignPatterns.chainOfResponsibility;

public class Compressor extends Handler {

    public Compressor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HTTPRequest request) {
        System.out.println("Compress");
        return false;
    }
}
