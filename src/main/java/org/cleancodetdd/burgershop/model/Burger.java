package org.cleancodetdd.burgershop.model;

import java.util.Objects;

public class Burger {

    public enum BreadType { WHITE, WHEAT, RYE, SOURDOUGH }
    private final BreadType bread;
    public enum MeatType { BEEF, CHICKEN, BLACK_BEAN }
    private final MeatType meat;

    protected Burger(Builder builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
    }

    public BreadType getBread() {
        return bread;
    }

    public MeatType getMeat() {
        return meat;
    }


    public static class Builder {
        private BreadType bread = BreadType.WHITE;
        private MeatType meat = MeatType.BEEF;

        public Builder(BreadType bread, MeatType meat) {
            this.bread = bread;
            this.meat = meat;
        }

        public Builder() { }

        public void setBread(String bread) {
            String breadEnum = bread.toUpperCase();
            this.bread = BreadType.valueOf(breadEnum);
        }

        public void setMeat(String meat) {
            String meatEnum = meat.toUpperCase();
            this.meat = MeatType.valueOf(meatEnum);
        }

        public BreadType getBread() {
            return bread;
        }

        public MeatType getMeat() {
            return meat;
        }

        public Burger build() {
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