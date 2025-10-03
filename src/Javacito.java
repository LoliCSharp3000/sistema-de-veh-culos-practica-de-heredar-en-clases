
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Javacito {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        Coche coche;
        boolean func = true;
        String elec;
        String marca;
        String modelo;
        int numeroDePuertas;
        while (func) { 
            elec = JOptionPane.showInputDialog("1.Añadir coche");

            switch (elec) {
                case "1":
                    marca = JOptionPane.showInputDialog("Dime de que marca es:");
                    modelo = JOptionPane.showInputDialog("Dime de que modelo es:");
                    numeroDePuertas = Integer.parseInt(JOptionPane.showInputDialog("Dime cuantas puertas tiene?"));
                    coche = new Coche(marca, modelo, numeroDePuertas);
                    break;
                case "2":
                    //añade una moto
                default:
                    throw new AssertionError();
            }
        }
    }
}
