package model;

public class PlainBurger extends Burger {

    private PlainBurger(Builder builder) {
        super(builder);
    }

    @Override
    protected MeatType getMeat() {
        return meat;
    }

    @Override
    protected BreadType getBread() {
        return bread;
    }

    public static class Builder extends Burger.Builder {

       protected Builder() {
            this.bread = BreadType.WHITE;
            this.meat = MeatType.BEEF;
        }

        protected Burger build() {
            return new PlainBurger(this);
        }
    }
}
