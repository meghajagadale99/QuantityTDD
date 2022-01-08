package com.tw;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


public
class CentimeterTest {

    @Test
    void shouldEquateWhenOneCentimeterToOneCentimeter() {
        int value = 1;
        Centimeter oneCentimeter = new Centimeter(value);
        Centimeter anotherOneCentimeter = new Centimeter(value);
        assertThat(oneCentimeter, is(equalTo(anotherOneCentimeter)));
    }
}
