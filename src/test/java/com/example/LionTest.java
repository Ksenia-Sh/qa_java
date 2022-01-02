package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
    public class LionTest extends TestCase {

        @Mock
        IFeline feline;

        @Test
        public void doesHaveManeMale() throws Exception {
            Lion lion = new Lion(this.feline,"Самец");
            boolean haveMane = lion.doesHaveMane();
            assertEquals(true, haveMane);
        }
        @Test
        public void doesHaveManeFemale() throws Exception {
            Lion lion = new Lion(this.feline,"Самка");
            boolean haveMane = lion.doesHaveMane();
            assertEquals(false, haveMane);
        }
        @Test(expected = Exception.class)
        public void doesHaveManeException() throws Exception {
            new Lion(this.feline,"Лось");
        }
        @Test
        public void getKittens() throws Exception {
            Lion lion = new Lion(feline,"Самка");
            Mockito.when(feline.getKittens()).thenReturn(5);
           int kittens =  lion.getKittens();
           assertEquals(5,kittens);
        }
        @Test
        public void getFood() throws Exception{
            Lion lion = new Lion(feline,"Самка");
            Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Дичь","Травоядные"));
            List<String> food = lion.getFood();
            assertEquals(List.of("Дичь","Травоядные"),food);
        }
    }