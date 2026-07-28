package com.example.utils;

import com.example.geometry.circle;
import com.example.geometry.Rectangle;

public class Calculator {

    public double areaCircle(circle c) {
        return Math.PI * c.radius * c.radius;
    }

    public double areaRectangle(Rectangle r) {
        return r.length * r.width;
    }
}