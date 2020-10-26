package com.company;

import javax.swing.JOptionPane;

public class Car {
    private String make;
    private int year;
    private boolean isCoupe;
    private double price;

    public void getMake() {
        JOptionPane.showMessageDialog(null, "Make: " + make);
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void getYear() {
        JOptionPane.showMessageDialog(null, "Year: " + year);
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void isCoupe() {
        JOptionPane.showMessageDialog(null, "The car is coupe " + isCoupe);
    }

    public void setCoupe(boolean coupe) {
        isCoupe = coupe;
    }

    public void getPrice() {
        JOptionPane.showMessageDialog(null, "Price: " + price);
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", year=" + year +
                ", isCoupe=" + isCoupe +
                ", price=" + price +
                '}';
    }
}
