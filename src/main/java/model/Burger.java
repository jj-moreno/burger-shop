package model;

public abstract class Burger {

    protected final BreadType bread;
    protected final MeatType meat;
    
    protected abstract MeatType getMeat();

    protected enum BreadType {WHITE}

    protected Burger(Builder builder) {
        this.bread = builder.bread;
        meat = builder.meat;
    }

    protected abstract BreadType getBread();

    public enum MeatType {
        BEEF
    }

    protected abstract static class Builder {
        protected BreadType bread;
        protected MeatType meat;

        abstract Burger build();
    }
}
