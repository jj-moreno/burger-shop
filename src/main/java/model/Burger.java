package model;

public abstract class Burger {


    protected enum BreadType { WHITE, WHEAT, RYE, SOURDOUGH }
    protected final BreadType bread;
    public enum MeatType { BEEF, CHICKEN, BLACK_BEAN }
    protected final MeatType meat;

    protected abstract BreadType getBread();
    protected abstract MeatType getMeat();

    protected Burger(Builder builder) {
        this.bread = builder.bread;
        meat = builder.meat;
    }

    private Burger() {
        this.bread = BreadType.WHITE;
        this.meat = MeatType.BEEF;
    }

    public final static Builder getPlainInstance() {
       return new PlainBurger.Builder();
    }


    protected abstract static class Builder {
        protected BreadType bread;
        protected MeatType meat;

        abstract Burger build();
    }
}
