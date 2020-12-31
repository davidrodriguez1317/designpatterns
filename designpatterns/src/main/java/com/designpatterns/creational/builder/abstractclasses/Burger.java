package com.designpatterns.creational.builder.abstractclasses;

import com.designpatterns.creational.builder.Wrapper;
import com.designpatterns.creational.builder.interfaces.Item;
import com.designpatterns.creational.builder.interfaces.Packing;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
