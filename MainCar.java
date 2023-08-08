package encapsulamiento;

import javax.swing.*;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.setPlate(JOptionPane.showInputDialog("Ingrese la placa"));
        car.setColor(JOptionPane.showInputDialog("Ingrese el color"));
        car.setModel(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modelo")));
        JOptionPane.showMessageDialog(null,car.getModel());
    }
}
