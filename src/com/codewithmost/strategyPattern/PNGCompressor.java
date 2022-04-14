package com.codewithmost.strategyPattern;

public class PNGCompressor implements Compressor {
    @Override
    public void compress() {
        System.out.println("Compressing using PNG");
    }
}
