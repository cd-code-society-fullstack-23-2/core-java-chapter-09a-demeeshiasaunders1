package com.codedifferently.partB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlaneTest {

    @Test
    public void constructorTest01(){
        //Given
        Plane plane = new Plane("Paris", "6:00AM", 7);

        //when
        String expected = "1 Paris 6:00AM 7" ;
        String actual = plane.toString();

        Assertions.assertEquals(expected, actual);
    }
}
