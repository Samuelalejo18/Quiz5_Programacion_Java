import java.util.LinkedList;
/**
 * clase Biblioteca
 */

public class Biblioteca {
    LinkedList<Libro> librosDisponibles = new LinkedList<>();
    /**
     * Método que permite registrar un nuevo libro
     * @param Libro
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void registrarLibro(Libro Libro) {
        librosDisponibles.add(Libro);

    }
    /**
     * Método que permite buscar Libro
     * @param titulo
     *
     * Complejidad temporal: O(n) Tiempo lineal
     */
    public Libro buscarLibro(String titulo) {

        for (Libro Libro : librosDisponibles) {
            if (Libro.getTitulo().equalsIgnoreCase(titulo)) {
                return Libro; // Se encontró el libro con el título especificado
            }
        }
        return null; // No se encontró el libro con el título especificado
    }

    /**
     * Método que permite registrar un nuevo libro
     * Complejidad temporal: O(1) Tiempo constante
     */
    public LinkedList<Libro> mostrarLibrosDisponibles() {
        return librosDisponibles;
    }

}
