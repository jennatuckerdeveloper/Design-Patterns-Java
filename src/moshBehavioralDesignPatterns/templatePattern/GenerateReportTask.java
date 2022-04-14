package moshBehavioralDesignPatterns.templatePattern;

public class GenerateReportTask extends Task {

    @Override
    protected void doExecute() {
        System.out.println("Generate Report");
    }

    protected void somethingElse() {

    }
}
