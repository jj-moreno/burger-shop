package org.cleancodetdd.burgershop.model;

public enum Topping {
    CHEESE, LETTUCE, TOMATOES;

    public String toString() {
        return this.name().toLowerCase();
    }
}
