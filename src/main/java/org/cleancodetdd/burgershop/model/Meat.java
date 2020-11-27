package org.cleancodetdd.burgershop.model;

public enum Meat {
    BEEF, CHICKEN, BLACK_BEAN;

    public String toString() {
        return this.name().toLowerCase();
    }
}
