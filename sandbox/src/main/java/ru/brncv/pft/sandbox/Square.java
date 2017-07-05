package ru.brncv.pft.sandbox;

/**
 * Created by ikuznecov on 04.07.2017.
 */
public class Square {
    public double l;

    public Square(double l) {
        this.l = l;
    }

    public double area() {
        return this.l * this.l;
    }
}
