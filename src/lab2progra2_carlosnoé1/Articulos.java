package lab2progra2_carlosnoé1;

import java.util.Date;

public class Articulos {
    public String Titulo;
    public String Autor;
    public String Tema;
    public String FechaPubli;
    public boolean Disponibilidad;

    public Articulos() {
    }

    public Articulos(String Titulo, String Autor, String Tema, String FechaPubli, boolean Disponibilidad) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Tema = Tema;
        this.FechaPubli = FechaPubli;
        this.Disponibilidad = Disponibilidad;
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

    public String getTema() {
        return Tema;
    }

    public void setTema(String Tema) {
        this.Tema = Tema;
    }


    public boolean isDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(boolean Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }

    public String getFechaPubli() {
        return FechaPubli;
    }

    public void setFechaPubli(String FechaPubli) {
        this.FechaPubli = FechaPubli;
    }
    

    @Override
    public String toString() {
        return "Articulos= " + "\n"
                + "Titulo=" + Titulo + "\n"
                + "Autor= " + Autor + "\n"
                + "Tema= " + Tema + "\n"
                + "FechaPubli= " + FechaPubli + "\n"
                + "Disponibilidad=" + Disponibilidad;
    }
    
    

    
}
