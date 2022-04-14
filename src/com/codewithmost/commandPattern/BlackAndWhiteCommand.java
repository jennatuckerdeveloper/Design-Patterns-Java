package com.codewithmost.commandPattern;

import com.codewithmost.commandPattern.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white");
    }
}
