package com.company;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int carInstanceNumber = Integer.parseInt(JOptionPane.showInputDialog("Cars number: "));
        for (int i = 1; i <= carInstanceNumber; i++) {

            newCar(i);

        }


    }

    private static void newCar(int i) {
        int choice;
        Car car = new Car();
        car.setMake(JOptionPane.showInputDialog("Car " + i + "  ~make~ "));
        car.setYear(Integer.parseInt(JOptionPane.showInputDialog("Car " + i + "  ~year~ ")));
        choice = JOptionPane.showConfirmDialog(null,
                "Car " + i + ": is the car coupe? ", "Please select", JOptionPane.YES_NO_OPTION);
        if (choice == 1)
            car.setCoupe(true);
        else if (choice == 0)
            car.setCoupe(false);
        car.setPrice(Double.parseDouble(JOptionPane.showInputDialog("Car " + i + " ~Price~ ")));
        JOptionPane.showMessageDialog(null, car.toString());
    }
}
