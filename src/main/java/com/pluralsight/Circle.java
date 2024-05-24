package com.pluralsight;

import java.awt.Color;
import java.awt.Point;

public class Circle extends Shape {
    //Variables
    Point location;
    private double radius;

    //Create the constructors
    public Circle(World world, double radius) {
        super(world);
        this.radius = radius;
    }
    public Circle(World world, double radius, int border, Color color, Point location) {
        super(world);
        this.radius = radius;
        this.setBorder(border);
        this.setColor(color);
        this.setLocation(location);
    }
    //Override methods
    @Override
    public void paint() {
        Turtle turtle = new Turtle(getWorld());
        turtle.setColor(getColor());
        turtle.setPenWidth(getBorder());
        turtle.penDown();

        double circumference = 2 * Math.PI * radius;
        int numOfSides = (int) (circumference / 5);
        double angle = 360.0 / numOfSides;

        for (int i = 0; i < numOfSides; i++) {
            turtle.forward(circumference / numOfSides);
            turtle.turnLeft(angle);
        }
        turtle.penUp();
    }
    @Override
    public Point getLocation() {
        return location;
    }
    public void setLocation(Point location) {
        this.location = location;
    }

}
