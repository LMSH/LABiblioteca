import java.util.HashSet;
import java.util.List;

public class Libro {

    private String nombre;
    private Integer codigoISBN;
    private String autor;
    private List <Ejemplar> listaDeEjemplaresDisponibles;

    //Constructor.
    public Libro(String nombre, Integer codigoISBN, String autor, List<Ejemplar> listaDeEjemplaresDisponibles) {
        this.nombre = nombre;
        this.codigoISBN = codigoISBN;
        this.autor = autor;
        this.listaDeEjemplaresDisponibles = listaDeEjemplaresDisponibles;
    }

    // Getters y Setters.
   /* public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoISBN(Integer codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setListaDeEjemplaresDisponibles(List<Ejemplar> listaDeEjemplaresDisponibles) {
        this.listaDeEjemplaresDisponibles = listaDeEjemplaresDisponibles;
    }
*/

     // 1) Método para agregar un nuevo libro.
    public void agregarNuevoEjemplar (Ejemplar unEjemplar){

        listaDeEjemplaresDisponibles.add(unEjemplar);
    }

    // 2) Método para consultar ejemplares disponibles.
    public Boolean tieneEjemplaresDisponibles(Ejemplar unEjemplar){

        for (Ejemplar listaDeEjemplaresDisponible : listaDeEjemplaresDisponibles) {
        
        }

        return true;
    }

    // 3) Método que permite prestar un ejemplar.
    public String prestarEjemplar (){

        return " ";
    }

    // 4) Método que permite reingresar un ejemplar que fue prestado a un Socio.
    public void reingresarEjemplar(Ejemplar unEjemplar){

        listaDeEjemplaresDisponibles.add(unEjemplar);
    }

}
