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
