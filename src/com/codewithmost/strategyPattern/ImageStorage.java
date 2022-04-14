package com.codewithmost.strategyPattern;

public class ImageStorage {
    public void store(String fileName, Compressor compressor, Filter filter) {
        // PGET, PNG, ... enum for set of constants really...
        // B&W, High Contrast filters...
        compressor.compress();
        filter.apply();
    }
}

