package com.designpatterns.creational.builder.abstractclasses;

import com.designpatterns.creational.builder.Bottle;
import com.designpatterns.creational.builder.interfaces.Item;
import com.designpatterns.creational.builder.interfaces.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
