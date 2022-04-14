package com.codewithmost.commandPattern;


import com.codewithmost.commandPattern.editor.BoldCommand;
import com.codewithmost.commandPattern.editor.HTMLDocument;
import com.codewithmost.commandPattern.editor.History;
import com.codewithmost.commandPattern.editor.UndoCommand;

public class Main {

    public static void main(String[] args) {
//        var service = new CustomerService();
//        var command = new AddCustomerCommand(service);
//        var button = new Button(command);
//        button.click();

//        var composite = new CompositeCommand();
//        composite.add(new ResizeCommand());
//        composite.add(new BlackAndWhiteCommand());
//        composite.execute();

        var history = new History();
        var document = new HTMLDocument();
        document.setContent("Hello World");
        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

//        boldCommand.unexecute();
//        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
