package org.cleancodetdd.burgershop.model;

public enum Bread {
    WHITE, WHEAT, RYE, SOURDOUGH;

    public String toString() {
        return this.name().toLowerCase();
    }
}


