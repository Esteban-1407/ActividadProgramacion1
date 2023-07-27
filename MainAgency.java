package encapsulamiento;

import javax.swing.*;

public class MainAgency {
    public static void main(String[] args) {
        Agency agency = new Agency();
        agency.setAdress(JOptionPane.showInputDialog("Ingrese la direccion"));
        agency.setAgentName(JOptionPane.showInputDialog("Ingres el nombre"));
        agency.setPrice(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio :")));
        JOptionPane.showMessageDialog(null, "Nombre de la agencia " + agency.getAgentName());
    }
}
