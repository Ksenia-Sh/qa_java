package com.example;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import org.junit.runners.Parameterized;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest extends TestCase {

    private Feline feline;
    @Before
    public void SetUp() {
         feline = new Feline();
    }

    @Test
    public void eatMeat() throws Exception {
        List<String> food = feline.eatMeat();
        List<String> foodExpected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(foodExpected, food);
    }

    @Test
    public void getFamily() {
        String family = feline.getFamily();
        assertEquals("Кошачьи", family);
    }


    @Test
    public void getKittens() {
        int kittens = feline.getKittens();
        assertEquals(1, kittens);
    }

    @Test
    public void getKittensWithParam(){
        int kittens = feline.getKittens(5);
        assertEquals(5, kittens);

}
}