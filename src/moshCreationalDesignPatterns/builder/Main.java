package moshCreationalDesignPatterns.builder;

public class Main {
    public static void main(String[] args) {
        var presentation = new Presentation();
        presentation.addSlide(new Slide("slide 1"));
        presentation.addSlide(new Slide("slide 2"));
        var builder = new MovieBuilder();
        presentation.export(builder);
        var pdf = builder.getMovie();
    }
}