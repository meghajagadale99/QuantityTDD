package com.tw;

import java.util.Objects;

public
class Centimeter {
    private final int value;

    public
    Centimeter(int value) {
        this.value = value;
    }

    @Override
    public
    boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Centimeter)) return false;
        Centimeter that = (Centimeter) obj;
        return value == that.value;
    }

    @Override
    public
    int hashCode() {
        return Objects.hash(value);
    }
}
