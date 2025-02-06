package edu.neu.csye6200;

import java.io.*;
import java.nio.file.*;
import java.util.*;

// 1. Item Superclass


public abstract class Item implements Comparable<Item> {
    protected int id;
    protected String name;
    protected double price;
    protected String description;

    public Item(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return id + ": " + name + " ($" + price + ") - " + description;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public int compareTo(Item other) {
        return Integer.compare(this.id, other.id);
    }
}
