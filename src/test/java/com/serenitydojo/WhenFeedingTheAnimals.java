package com.serenitydojo;

import com.serenitydojo.model.AnimalType;
import com.serenitydojo.model.Feeder;
import com.serenitydojo.model.FoodType;
import org.junit.Assert;
import org.junit.Test;

public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedCatsTuna() {
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(AnimalType.CAT, false);

        Assert.assertEquals(FoodType.TUNA, food);
    }

    @Test
    public void shouldFeedHamstersCabbage() {
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(AnimalType.HAMSTER, false);

        Assert.assertEquals(FoodType.CABBAGE, food);
    }

    @Test
    public void shouldFeedDogsDogFood() {
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(AnimalType.DOG, false);

        Assert.assertEquals(FoodType.DOG_FOOD, food);
    }

    @Test
    public void shouldFeedPremiumCatsPremiumFood() {
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(AnimalType.CAT, true);

        Assert.assertEquals(FoodType.SALMON, food);

    }
}
