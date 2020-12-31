package com.designpatterns.creational.builder.concreteclasses;

import com.designpatterns.creational.builder.abstractclasses.ColdDrink;

public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
