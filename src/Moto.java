
import javax.swing.JOptionPane;

public class Moto extends Vehiculo {
    private boolean sidecast;
    public Moto(String marca, String modelo, boolean sidecast){
        super(marca, modelo);
        this.sidecast = sidecast;
    }

    public boolean getSideCast(){
        return sidecast;
    }

    public void mostrarInfo(){
        JOptionPane.showMessageDialog(null, "marca: " + getMarca() + " modelo: " + getModelo() + " tiene el asiento adicional: " + (sidecast ? "SI" : "NO"));
    }
}
