/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2progra2_carlosnoé1;

/**
 *
 * @author cd507
 */
public class CursoEnLinea {
    public String Titulo;
    public String Instuctor;
    public int DuracionEnSemanas;
    public String PlataformaE;

    public CursoEnLinea() {
    }

    public CursoEnLinea(String Titulo, String Instuctor, int DuracionEnSemanas, String PlataformaE) {
        this.Titulo = Titulo;
        this.Instuctor = Instuctor;
        this.DuracionEnSemanas = DuracionEnSemanas;
        this.PlataformaE = PlataformaE;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getInstuctor() {
        return Instuctor;
    }

    public void setInstuctor(String Instuctor) {
        this.Instuctor = Instuctor;
    }

    public int getDuracionEnSemanas() {
        return DuracionEnSemanas;
    }

    public void setDuracionEnSemanas(int DuracionEnSemanas) {
        this.DuracionEnSemanas = DuracionEnSemanas;
    }

    public String getPlataformaE() {
        return PlataformaE;
    }

    public void setPlataformaE(String PlataformaE) {
        this.PlataformaE = PlataformaE;
    }

    @Override
    public String toString() {
        return "CursoEnLinea{" + "Titulo=" + Titulo + ", Instuctor=" + Instuctor + ", DuracionEnSemanas=" + DuracionEnSemanas + ", PlataformaE=" + PlataformaE + '}';
    }
    
    

}
