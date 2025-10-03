
import javax.swing.JOptionPane;

public class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String marca, String modelo, int numeroPuertas){
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    public void mostrarInfo(){
        JOptionPane.showMessageDialog(null, "marca: " + getMarca() + " modelo: " + getModelo() + " numero de puertas: " + numeroPuertas);
    }
}
