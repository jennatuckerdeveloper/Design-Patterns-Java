package com.codewithmost.chainOfResponsibility;

public class WebServer {
    private Handler handler;

    public WebServer(Handler handler) {
        // null check
        this.handler = handler;
    }

    public void handle(HTTPRequest request) {
        handler.handle(request);
    }
}
