
import javax.swing.JOptionPane;



public class Libro {
    private String nombre;
    private  String author;
    private boolean prestado;

    
    
    public Libro(String nombre, String author){
        setNombre(nombre);
        setAutor(author);
        this.prestado = false;

    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre != null && !nombre.trim().isEmpty()) this.nombre = nombre;
    }
    public String getAutor(){
        return author;
    }
    public void setAutor(String author){
        if(author != null && !author.trim().isEmpty()) this.author = author;
    }
    public boolean isPrestado(){
        return prestado;
    }
    public void setPrestado(boolean prestado){
        this.prestado = prestado;
    }
    public void prestar(){
        if(!prestado){
            prestado = true;
            JOptionPane.showMessageDialog(null, "el libro esta pedido");
            
        }else{
            JOptionPane.showMessageDialog(null, "ya esta prestado");
        }
    }

    public void devolver(){
        if(prestado){
            prestado = false;
            JOptionPane.showMessageDialog(null, "devolviste el libro");
        }else{
            JOptionPane.showMessageDialog(null, "no lo cogiste");
        }
    }

    public String mostrar(){
        return "titulo: " + nombre + "   autor: " + author + " Prestado: " + (prestado ? "Si" : "No");
    }
}
