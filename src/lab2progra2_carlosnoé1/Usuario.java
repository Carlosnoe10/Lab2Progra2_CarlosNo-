/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2progra2_carlosnoé1;

/**
 *
 * @author cd507
 */
public class Usuario {

    public String NombreUsu;
    private String Contrasenya;
    public String TipoUsu;

    public Usuario() {
    }

    public Usuario(String NombreUsu, String Contrasenya, String TipoUsu) {
        this.NombreUsu = NombreUsu;
        this.Contrasenya = Contrasenya;
        this.TipoUsu = TipoUsu;
    }

    public String getNombreUsu() {
        return NombreUsu;
    }

    public void setNombreUsu(String NombreUsu) {
        this.NombreUsu = NombreUsu;
    }

    public String getContrasenya() {
        return Contrasenya;
    }

    public void setContrasenya(String Contrasenya) {
        this.Contrasenya = Contrasenya;
    }

    public String getTipoUsu() {
        return TipoUsu;
    }

    public void setTipoUsu(String TipoUsu) {
        if ((TipoUsu.equalsIgnoreCase("Estudiante")&&(TipoUsu.equalsIgnoreCase("Profesor"))&&(TipoUsu.equalsIgnoreCase("Bibliotecario")))) {
           this.TipoUsu = TipoUsu; 
        }else{
            
        }
        
        
        
    }
    
    
    
    
    
    
    

}
