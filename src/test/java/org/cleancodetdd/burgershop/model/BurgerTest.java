package org.cleancodetdd.burgershop.model;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.cleancodetdd.burgershop.model.Burger.BreadType.WHITE;
import static org.cleancodetdd.burgershop.model.Burger.MeatType.BEEF;

public class BurgerTest {

    @Test
    public void should_create_burger_with_defaults_breadType_white_meatType_beef_and_given_values() {
        Burger expectedBurger = new Burger.Builder().build();
        Burger actualBurger = new Burger.Builder(WHITE, BEEF).build();
//        Assert.assertEquals(expectedBurger, actualBurger);
        Burger.Builder builder = new Burger.Builder();
        builder.setBread("white");
        builder.setMeat("beef");
        Burger expectation = builder.build();
        Assert.assertEquals(expectation, actualBurger);
    }
    
}
