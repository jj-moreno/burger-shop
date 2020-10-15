package model;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BurgerTest {

    @Test
    public void should_create_plain_burger_with_default_breadType_white_meatType_beef() {
        Burger plainBurger = new PlainBurger.Builder().build();

        String expectedBreadType = "WHITE";
        String expectedMeatType = "BEEF";

        String actualBreadType = plainBurger.getBreadType();
        String actualMeatType = plainBurger.getMeatType();

        Assert.assertEquals(expectedBreadType, actualBreadType);
        Assert.assertEquals(expectedMeatType, actualMeatType);
    }
}
