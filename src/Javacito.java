
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
                    
                    
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
