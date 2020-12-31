package com.designpatterns.creational.builder;

import com.designpatterns.creational.builder.interfaces.Packing;

public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
