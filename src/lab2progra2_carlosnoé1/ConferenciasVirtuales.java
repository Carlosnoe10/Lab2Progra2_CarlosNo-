/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2progra2_carlosnoé1;

import java.util.Date;

/**
 *
 * @author cd507
 */
public class ConferenciasVirtuales {
    public String Titulo;
    public String Conferencista;
    public String Fecha;
    public int Duracion;
    public String EnlaceAcceso;

    public ConferenciasVirtuales() {
    }

    public ConferenciasVirtuales(String Titulo, String Conferencista, String Fecha, int Duracion, String EnlaceAcceso) {
        this.Titulo = Titulo;
        this.Conferencista = Conferencista;
        this.Fecha = Fecha;
        this.Duracion = Duracion;
        this.EnlaceAcceso = EnlaceAcceso;
    }

    

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getConferencista() {
        return Conferencista;
    }

    public void setConferencista(String Conferencista) {
        this.Conferencista = Conferencista;
    }

   

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public String getEnlaceAcceso() {
        return EnlaceAcceso;
    }

    public void setEnlaceAcceso(String EnlaceAcceso) {
        this.EnlaceAcceso = EnlaceAcceso;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    
    @Override
    public String toString() {
        return "ConferenciasVirtuales= " + "\n"
                + "Titulo= " + Titulo + "\n"
                + "Conferencista= " + Conferencista + "\n"
                + "Fecha= " + Fecha + ""
                + "Duracion= " + Duracion + "\n"
                + "EnlaceAcceso= " + EnlaceAcceso ;
    }
    
    
    
    

}
