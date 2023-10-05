import java.util.LinkedList;

import java.util.Scanner;
/**
 * clase Principal
 */

public class Principal {
    /**
     * Método inicial que es ejecutado
     *
     * @param args Complejidad temporal: O(1) Tiempo constante
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Biblioteca bibliotecaKonradLorenz = new Biblioteca();

// Crear objetos de la clase Libro
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 496);
        Libro libro2 = new Libro("El código Da Vinci", "Dan Brown", 656);
        Libro libro3 = new Libro("1984", "George Orwell", 326);
        Libro libro4 = new Libro("El Hobbit", "J.R.R. Tolkien", 310);
        Libro libro5 = new Libro("La Odisea", "Homero", 448);


        // Registrar los libros en la biblioteca
        bibliotecaKonradLorenz.registrarLibro(libro1);
        bibliotecaKonradLorenz.registrarLibro(libro2);
        bibliotecaKonradLorenz.registrarLibro(libro3);
        bibliotecaKonradLorenz.registrarLibro(libro4);
        bibliotecaKonradLorenz.registrarLibro(libro5);

        int opcion = -1; // Operación de tiempo constante, O(1)

        while (opcion != 0) {
            // Impresión de mensaje de tiempo constante, O(1)
            System.out.println("Bienvenidos a la biblioteca Konrad Lorenz");
            System.out.println("Ingresa la opción:"); //
            System.out.println("1. Buscar libro"); //
            System.out.println("2. Mostrar libros disponibles");
            System.out.println("3. Registrar un nuevo libro");
            System.out.println("0. Salir");

            opcion = lector.nextInt();
            lector.nextLine();

            /* Switch case tiempo constante 0(1)*/
            switch (opcion) {
                case 1 -> {

                    /* Caso para buscar los libros disponibles, condicionales y bloque de codigo de tiempo consante 0(1) */
                    System.out.println("Ingrese el título del libro:");
                    String tituloBuscado = lector.nextLine();
                    Libro libroEncontrado = bibliotecaKonradLorenz.buscarLibro(tituloBuscado);
                    if (libroEncontrado != null) {
                        System.out.println("Libro encontrado:");
                        System.out.println("Título: " + libroEncontrado.getTitulo());
                        System.out.println("Autor: " + libroEncontrado.getAutor());
                        System.out.println("Número de páginas: " + libroEncontrado.getNumeroPaginas());
                    } else {
                        System.out.println("El libro '" + tituloBuscado + "' no se encontró en la biblioteca."); // Impresión de mensaje de tiempo constante, O(1)
                    }
                }
                case 2 -> {
                    /* Caso para mostrar los libros disponibles, se requiere ciclo for para rocorrer la lista, por lo cual es complejiad lineal 0(n)*/
                    System.out.println("Libros disponibles en la biblioteca:");
                    LinkedList<Libro> librosDisponibles = bibliotecaKonradLorenz.mostrarLibrosDisponibles(); // Llamada a mostrarLibrosDisponibles, cuya complejidad es O(1)
                    for (Libro libro : librosDisponibles) { // Bucle que itera a través de la lista de libros disponibles, complejidad de tiempo lineal O(n)
                        System.out.println("Título: " + libro.getTitulo());
                        System.out.println("Autor: " + libro.getAutor());
                        System.out.println("Número de páginas: " + libro.getNumeroPaginas());
                    }
                }
                case 3 -> {
                    /* Caso para registra un nuevo libro, complejidad de tiempo constante */
                    //  tiempo constante, O(1)
                    System.out.println("Registro de un nuevo libro:");
                    System.out.println("Ingrese el título del libro:");
                    String nuevoTitulo = lector.nextLine();
                    System.out.println("Ingrese el autor del libro:");
                    String nuevoAutor = lector.nextLine();
                    System.out.println("Ingrese el número de páginas del libro:");
                    int nuevoNumeroPaginas = lector.nextInt();
                    lector.nextLine();

                    // Crear un nuevo libro con los datos proporcionados
                    Libro nuevoLibro = new Libro(nuevoTitulo, nuevoAutor, nuevoNumeroPaginas);

                    // Registrar el nuevo libro en la biblioteca
                    bibliotecaKonradLorenz.registrarLibro(nuevoLibro);
                    System.out.println("El libro '" + nuevoTitulo + "' ha sido registrado en la biblioteca.");
                }
                case 0 ->
                        System.out.println("Saliendo de la biblioteca. ¡Hasta luego!"); // Impresión de mensaje de tiempo constante, O(1)
                default ->
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida."); // Impresión de mensaje de tiempo constante, O(1)
            }
        }

    }
}