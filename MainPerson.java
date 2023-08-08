package encapsulamiento;

import javax.swing.*;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName((JOptionPane.showInputDialog("Ingrese el nombre")));
        System.out.println(person.getName());
        person.setAge(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad")));
    }
}
