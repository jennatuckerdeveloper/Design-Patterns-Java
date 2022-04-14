package com.codewithmost.strategyPattern;

public class Main {

    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("image", new JPEGCompressor(), new BWFilter());
        imageStorage.store("image2", new PNGCompressor(), new HighContrastFilter());

    }
}
