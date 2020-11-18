package model;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BurgerTest {

    @Test
    public void should_create_burger_with_defaults_breadType_white_meatType_beef_and_given_values() {
        Burger expectedBurger = new Burger.Builder().build();
        Burger actualBurger = new Burger.Builder(Burger.BreadType.WHITE, Burger.MeatType.BEEF).build();
        Assert.assertEquals(expectedBurger, actualBurger);

    }
    
}
