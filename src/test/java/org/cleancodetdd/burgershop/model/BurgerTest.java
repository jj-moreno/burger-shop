package org.cleancodetdd.burgershop.model;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.cleancodetdd.burgershop.model.Burger.BreadType.*;
import static org.cleancodetdd.burgershop.model.Burger.MeatType.*;

public class BurgerTest {

    @Test
    public void should_create_plain_burger_with_defaults_breadType_white_meatType_beef() {
        Burger expectedBurger = new Burger.Builder().build();
        Burger actualBurger = new Burger.Builder(WHITE, BEEF).build();
        Assert.assertEquals(expectedBurger, actualBurger);

    }

    @Test
    public void should_create_plain_burger_with_given_set_inputs_for_bread_and_meat() {
        Burger.Builder builder = new Burger.Builder();
        builder.setBread("wheat");
        builder.setMeat("chicken");
        Burger expectedBurger = builder.build();
        Burger actualBurger = new Burger.Builder(WHEAT, CHICKEN).build();
        Assert.assertEquals(expectedBurger, actualBurger);
    }
    
}
