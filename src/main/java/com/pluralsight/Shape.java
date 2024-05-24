package com.pluralsight;
import java.awt.Color;
import java.awt.Point;

public abstract class Shape {
    private World world;
    Color color;
    double border;

    //Create constructor
    public Shape(World world){
        this.world = world;
    }

    //Create getters and setters
    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getBorder() {
        return border;
    }

    public void setBorder(double border) {
        this.border = border;
    }
    //Make abstract methods
    public abstract void setLocation(Point location);

    public abstract void paint();

    public abstract Point getLocation();
}
