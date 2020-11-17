package model;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BurgerTest {

    @Test
    public void should_create_plain_burger_with_default_breadType_white_meatType_beef() {
        //Burger plainBurger = new PlainBurger.Builder().build();

        Burger plainBurger = Burger.getPlainInstance().build();

        Burger.BreadType expectedBread = Burger.BreadType.WHITE;
        Burger.BreadType actualBread = plainBurger.getBread();

        Assert.assertEquals(actualBread, expectedBread);

        Burger.MeatType expectedMeat = Burger.MeatType.BEEF;
        Burger.MeatType actualMeat = plainBurger.getMeat();

        Assert.assertEquals(actualMeat, expectedMeat);
    }

//    @Test
//    public void should_create_plain_burger_with_given_bread_and_meat_type() {
//        Burger aBurger = new BurgerBuilder().withBread(SOURDOUGH).withMeat(CHICKEN).withTopping(MAYO).build();
//
//    }
}
