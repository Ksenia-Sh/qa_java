package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

 @RunWith(Parameterized.class)
    public class LionDoesHaveManeTest extends TestCase {
        @Mock
        IFeline feline;

        private final String checkedMale;
        private final boolean expected;

        public LionDoesHaveManeTest(String checkedMale, boolean expected) {
            this.checkedMale = checkedMale;
            this.expected = expected;
    }
        @Parameterized.Parameters
        public static Object[][] getManeData() {
            return new Object[][]{
                    {"Самец", true},
                    {"Самка", false}
            };
        }
            @Test
            public void doesHaveMane() throws Exception {
                Lion lion = new Lion(feline, checkedMale);
                boolean actual = lion.doesHaveMane();
                assertEquals(expected, actual);

            }
    }
