/**
 * clase Libro
 */
public class Libro {
    private String titulo;
    private String autor;
    private int  numeroPaginas;

    /****************************************************************************************************/
    /******************************************* CONSTRUCTORES ******************************************/
    /****************************************************************************************************/

    /**
     * Método constuctor para inicializar los atributos de la clase
     * @param titulo titulo del libro
     * @param autor autor del libro
     * @param numeroPaginas numero de paginas del libro
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public  Libro (String  titulo, String  autor, int  numeroPaginas){
        this. titulo =  titulo;
        this. autor =  autor;
        this.numeroPaginas =numeroPaginas;

    }
    /****************************************************************************************************/
    /*************************************** MÉTODOS MODIFICADORES **************************************/
    /****************************************************************************************************/

    /**
     * Método para obtener el titulo del libro
     * @return Retorna el titulo del libro
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * Método para  modificar el titulo del libro
     * @set establece o modifica el titulo del libro
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     * Método para obtener el autor del libro
     * @return Retorna el autor  del libro
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public String getAutor() {
        return autor;
    }
    /**
     * Método para  modificar el autor del libro
     * @set establece o modifica el autor  del libro
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    /**
     * Método para obtener el numero de paginas del libro
     * @return Retorna el numero de paginas  del libro
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    /**
     * Método para  modificar el numero de paginas del libro
     * @set establece o modifica l numero de paginas del libro
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }




}
