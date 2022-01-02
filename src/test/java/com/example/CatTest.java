package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;


    @RunWith(MockitoJUnitRunner.class)
    public class CatTest extends TestCase {
    @Mock
    Feline feline;

    @Test
    public void getSound() {
        Cat cat = new Cat(feline);
        String sound = cat.getSound();
        assertEquals("Мяу",sound);
    }

    @Test
    public void getFood() throws Exception{
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Молоко","Мясо"));
        List<String> food = cat.getFood();
        assertEquals(List.of("Молоко","Мясо"),food);
    }
}