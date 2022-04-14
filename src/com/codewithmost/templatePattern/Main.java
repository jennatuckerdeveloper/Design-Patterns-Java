package com.codewithmost.templatePattern;

public class Main {

    public static void main(String[] args) {
        Task task = new GenerateReportTask();
        task.execute(); // doExecute() is still showing, because Main is in the same package.
    }
}
