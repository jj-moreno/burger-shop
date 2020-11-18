package model;

import java.util.Objects;

public class Burger {

    protected enum BreadType { WHITE, WHEAT, RYE, SOURDOUGH }
    protected final BreadType bread;
    public enum MeatType { BEEF, CHICKEN, BLACK_BEAN }
    protected final MeatType meat;

    protected Burger(Builder builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
    }

    protected Burger() {
        this.bread = BreadType.WHITE;
        this.meat = MeatType.BEEF;
    }

    protected static class Builder {
        protected BreadType bread;
        protected MeatType meat;

        protected Builder(BreadType bread, MeatType meat) {
            this.bread = bread;
            this.meat = meat;
        }

        protected Builder() {
            this.bread = BreadType.WHITE;
            this.meat = MeatType.BEEF;
        }

        protected Burger build() {
            return new Burger(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Burger burger = (Burger) o;
        return bread == burger.bread &&
                meat == burger.meat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bread, meat);
    }
}
