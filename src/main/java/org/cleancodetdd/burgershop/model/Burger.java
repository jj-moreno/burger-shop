package org.cleancodetdd.burgershop.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Burger {

    private final Bread bread;
    private final Meat meat;
    private final List<Topping> toppingList;

    protected Burger(Builder builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.toppingList = builder.toppingList;
    }

    public Bread getBread() {
        return bread;
    }

    public Meat getMeat() {
        return meat;
    }

    public List<Topping> getToppingList() {
        return toppingList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Burger burger = (Burger) o;
        return bread == burger.bread &&
                meat == burger.meat &&
                Objects.equals(toppingList, burger.toppingList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bread, meat, toppingList);
    }

    public static class Builder {
        private Bread bread;
        private Meat meat;
        private final List<Topping> toppingList = new ArrayList<>();

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

        public void setToppingList(List<String> toppingList) {
            for(String strVal: toppingList) {
                this.toppingList.add(Topping.valueOf(strVal.toUpperCase()));
            }
        }

        public List<String> getToppingList() {
            List<String> parsableToppingList = new ArrayList<>();
            for(Topping topping: this.toppingList) {
                parsableToppingList.add(topping.toString());
            }
            return parsableToppingList;
        }

        public Builder addTopping(Topping topping) {
            toppingList.add(topping);
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}