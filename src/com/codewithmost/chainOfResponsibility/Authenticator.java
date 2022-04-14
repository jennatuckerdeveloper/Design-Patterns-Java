package com.codewithmost.chainOfResponsibility;

public class Authenticator extends Handler {
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HTTPRequest request) {
        // would query a databse to ensure this is valid
        var isValid = (request.getUsername() == "admin" &&
                request.getPassword() == "1234");
        System.out.println("Authentication");
        return !isValid;
    }
}
