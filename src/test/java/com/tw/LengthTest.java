package com.tw;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


public
class LengthTest {

    @Test
    void shouldEquateWhenOneCentimeterToOneCentimeter() {
        int value = 1;

        Length oneCentimeter = new Length(value);
        Length anotherOneCentimeter = new Length(value);

        assertThat(oneCentimeter, is(equalTo(anotherOneCentimeter)));
    }

    @Test
    void shouldEquateWhenOneMeterToHundredCentimeter() {

        Length oneMeter = Length.meter(1);
        Length hundredCentimeter = Length.centimeter(100);

        assertThat(oneMeter, is(equalTo(hundredCentimeter)));
    }

    @Test
    void shouldEquateWhenHundredCentimeterToZeroPointZeroZeroOneKilometer() {

        Length hundredCentimeter = Length.centimeter(100);
        Length zeroPointZeroZeroOneKilometer =Length.kiloMeter(0.001);

        assertThat(hundredCentimeter, is(equalTo(zeroPointZeroZeroOneKilometer)));
    }
}
