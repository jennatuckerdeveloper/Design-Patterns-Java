package com.codewithmost.commandPattern;

import com.codewithmost.commandPattern.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
