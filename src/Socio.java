import java.util.List;

public class Socio {

    private String nombre;
    private String apellido;
    private Integer numerodeidentificación;
    private static final Integer CANTIDAD_MAXIMA_DE_LIBROS_RETIRADOS = 3;
    private List<Ejemplar> ejemplaresretirados;

    // 1) Método que permite consultar si un socio tiene cupo para llevarse un libro.
        public Boolean tieneCupoDisponible(){

        return true;
    }

    // 2) Método que permite al Socio pedir prestado un Ejemplar.
    public void tomarPrestadoUnEjemplar(Ejemplar unEjemplar){

    }

    // 3) Método parar que permite al Socio devolver un Ejemplar.
    public void devolverUnEjemplar (Ejemplar unEjemplar){

    }

}
