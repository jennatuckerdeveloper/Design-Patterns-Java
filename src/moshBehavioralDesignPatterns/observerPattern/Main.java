package moshBehavioralDesignPatterns.observerPattern;

public class Main {

    public static void main(String[] args) {
        var source = new DataSource();
        source.setValue(1);
        var chart = new Chart(source);
        var spreadsheet = new Spreadsheet(source);
        source.attachObserver(chart);
        source.attachObserver(spreadsheet);
        source.setValue(2);
        source.detachObserver(chart);
        source.setValue(3);
    }
}
