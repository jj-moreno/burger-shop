package org.cleancodetdd.burgershop.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Burger {

    private final Bread bread;
    private final Meat meat;

    protected Burger(Builder builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
    }

    public Bread getBread() {
        return bread;
    }

    public Meat getMeat() {
        return meat;
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

    public static class Builder {
        private Bread bread;
        private Meat meat;
        private List<Topping> toppingList = new ArrayList<>();

        public Builder(Bread bread, Meat meat) {
            this.bread = bread;
            this.meat = meat;
        }

        public Builder() {
            this.bread = Bread.WHITE;
            this.meat = Meat.BEEF;
        }

        public String getBread() {
            return bread.toString();
        }

        public void setBread(String bread) {
            String breadEnum = bread.toUpperCase();
            this.bread = Bread.valueOf(breadEnum);
        }

        public String getMeat() {
            return meat.toString();
        }

        public void setMeat(String meat) {
            String meatEnum = meat.toUpperCase();
            this.meat = Meat.valueOf(meatEnum);
        }

        public Builder addToppings(Topping topping) {
            toppingList.add(topping);
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}