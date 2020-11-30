package org.cleancodetdd.burgershop.model;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.cleancodetdd.burgershop.model.Bread.WHEAT;
import static org.cleancodetdd.burgershop.model.Bread.WHITE;
import static org.cleancodetdd.burgershop.model.Meat.BEEF;
import static org.cleancodetdd.burgershop.model.Meat.CHICKEN;
import static org.cleancodetdd.burgershop.model.Topping.*;

public class BurgerTest {

    @Test
    public void should_create_plain_burger_with_defaults_breadType_white_meatType_beef() {
        Burger expectedBurger = new Burger.Builder(WHITE, BEEF).build();
        Burger actualBurger = new Burger.Builder().build();
        Assert.assertEquals(expectedBurger, actualBurger);

    }

    @Test
    public void should_create_plain_burger_with_given_set_inputs_for_bread_and_meat() {
        Burger expectedBurger = new Burger.Builder(WHEAT, CHICKEN).build();
        Burger.Builder builder = new Burger.Builder();
        builder.setBread("wheat");
        builder.setMeat("chicken");
        Burger actualBurger = builder.build();
        Assert.assertEquals(expectedBurger, actualBurger);
    }

    @Test
    public void should_create_beef_white_bread_burger_with_cheese_tomatoes_and_lettuce() {
        Burger expectedBurger = new Burger.Builder(WHITE, BEEF)
                .addTopping(CHEESE)
                .addTopping(TOMATOES)
                .addTopping(LETTUCE)
                .build();
        Burger.Builder builder = new Burger.Builder();
        builder.setMeat("beef");
        builder.setBread("white");
        builder.setToppingList(List.of("cheese", "tomatoes", "lettuce"));
        Burger actualBurger = builder.build();
        Assert.assertEquals(expectedBurger, actualBurger);
    }
}
