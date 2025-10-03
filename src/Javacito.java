
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class Javacito {
    public static void main(String[] args) {
        ArrayList<Libro> biblioteca = new ArrayList<>();
        int eleccion;
        boolean func = true;
        String titulo;
        String author;
        Libro libro;

        while (func) { 
            eleccion = Integer.parseInt(JOptionPane.showInputDialog(null, "Pon 1.añadir libro   2.Mostrar   3.Pestar   4.Devolver   5.Salir"));
            switch (eleccion) {
                case 1:
                    titulo = JOptionPane.showInputDialog("introduce tu tituto");
                    author = JOptionPane.showInputDialog("introduce el autor");
                    libro = new Libro(titulo, author);
                    biblioteca.add(libro);
                    break;
                case 2:
                    if(biblioteca.isEmpty()){
                        JOptionPane.showMessageDialog(null, "No hay libros en la biblioteca");
                    }else{
                        String listaLibros = "";
                        for (Libro libros : biblioteca) {
                            listaLibros += libros.mostrar() + "\n";
                        }
                        JOptionPane.showMessageDialog(null, listaLibros);
                    }
                    break;
                case 3:
                    operacionConLibro(biblioteca, true);
                    break;
                case 4:
                    operacionConLibro(biblioteca, false);
                    break;
                case 5:
                    func = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Pusiste algo otro");
            }
        }
        
    }
    public static void operacionConLibro(ArrayList<Libro> biblioteca, boolean prestado){
        boolean encontrado = false;
        JOptionPane.showMessageDialog(null, "Pon el nombre del libro");
                    if(biblioteca.isEmpty()){
                        JOptionPane.showMessageDialog(null, "No hay libros en la biblioteca");
                    }else{
                        String listaLibros = "";
                        for (Libro libros : biblioteca) {
                            listaLibros += libros.mostrar() + "\n";
                        }
                        String comparador = JOptionPane.showInputDialog(null, listaLibros);
                        for (Libro libros : biblioteca) {
                            if(libros.getNombre().equalsIgnoreCase(comparador)) {
                                encontrado = true;
                                if(prestado) libros.prestar();
                                else libros.devolver();

                                break;
                                
                            }
                            
                        }
                        if(!encontrado) JOptionPane.showMessageDialog(null, "Libro no encontrado"); // ver si esta perfecto el codigo
                    }
    }
}
