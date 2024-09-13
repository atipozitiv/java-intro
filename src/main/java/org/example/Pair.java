package org.example;

import java.util.Objects;

public class Pair{

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return Objects.equals(x1, pair.x1) && Objects.equals(x2, pair.x2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x1, x2);
    }

    Double x1;
    Double x2;
    public Pair(Double x1, Double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }
}
