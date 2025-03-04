import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }

    // Getters
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getIsbn() { return isbn; }
    public boolean estaDisponible() { return disponible; }

    // Setters
    public void setDisponible(boolean estado) { disponible = estado; }

    @Override
    public String toString() {
        String estado = disponible ? "Disponible" : "Prestado";
        return String.format("Título: %s, Autor: %s, ISBN: %s, Estado: %s",
                titulo, autor, isbn, estado);

    }
}
class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.printf("Libro '%s' agregado con éxito.%n", libro.getTitulo());
    }

    public List<Libro> buscarPorTitulo(String titulo) {
        List<Libro> encontrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                encontrados.add(libro);
            }
        }
        return encontrados;
    }

    public List<Libro> buscarPorAutor(String autor) {
        List<Libro> encontrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                encontrados.add(libro);
            }
        }
<<<<<<< HEAD
        return encontrados;
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        while (true) {
            System.out.println("\nGestión de Biblioteca");
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar libro por título");
            System.out.println("3. Buscar libro por autor");
            System.out.println("4. Listar todos los libros");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el ISBN del libro: ");
                    String isbn = scanner.nextLine();
                    biblioteca.agregarLibro(new Libro(titulo, autor, isbn));
                    break;
