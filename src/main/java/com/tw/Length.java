package com.tw;

import java.util.Objects;

public
class Length {
    private final double value;

    public
    Length(double value) {
        this.value = value;
    }

    public static
    Length meter(double meter) {
        return new Length(meter * 100);
    }

    public static
    Length centimeter(double centimeter) {
        return new Length(centimeter);
    }

    public static
    Length kiloMeter(double kilometer) {
        return new Length(kilometer * 100000);
    }

    @Override
    public
    boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Length)) return false;
        Length that = (Length) obj;
        return value == that.value;
    }

    @Override
    public
    int hashCode() {
        return Objects.hash(value);
    }
}
