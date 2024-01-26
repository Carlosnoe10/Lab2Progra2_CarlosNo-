package lab2progra2_carlosnoé1;

public class Libros {
    public String Titulo;
    public String Autor;
    public int AñoPubli;
    public boolean Disponibilidad;

    public Libros(String Titulo, String Autor, int AñoPubli, boolean Disponibilidad) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.AñoPubli = AñoPubli;
        this.Disponibilidad = Disponibilidad;
    }

    public Libros() {
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getAñoPubli() {
        return AñoPubli;
    }

    public void setAñoPubli(int AñoPubli) {
        this.AñoPubli = AñoPubli;
    }

    public boolean isDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(boolean Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }

    @Override
    public String toString() {
        return "Libros{" + "Titulo=" + Titulo + ", Autor=" + Autor + ", A\u00f1oPubli=" + AñoPubli + ", Disponibilidad=" + Disponibilidad + '}';
    }
    
    
    
    
    
}
