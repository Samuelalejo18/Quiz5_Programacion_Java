import java.util.LinkedList;


public class Biblioteca {
    LinkedList<Libro> librosDisponibles = new LinkedList<>();

    public void registrarLibro(Libro Libro) {
        librosDisponibles.add(Libro);

    }

    public Libro buscarLibro(String titulo) {
        for (Libro Libro : librosDisponibles) {
            if (Libro.getTitulo().equalsIgnoreCase(titulo)) {
                return Libro; // Se encontró el libro con el título especificado
            }
        }
        return null; // No se encontró el libro con el título especificado
    }

    public void mostrarLibros() {
        if (librosDisponibles.isEmpty()) {
            System.out.println("No hay libros disponibles en la biblioteca.");
        } else {
            System.out.println("Libros disponibles en la biblioteca:");
            for (Libro libro : librosDisponibles) {
                System.out.println("Título: " + libro.getTitulo());
                System.out.println("Autor: " + libro.getAutor());
                System.out.println("Numero de paginas : " + libro.getNumeroPaginas());

            }
        }
    }

}
