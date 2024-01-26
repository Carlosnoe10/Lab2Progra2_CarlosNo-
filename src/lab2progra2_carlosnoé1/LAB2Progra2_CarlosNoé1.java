package lab2progra2_carlosnoé1;

import java.util.ArrayList;
import java.util.Scanner;

public class LAB2Progra2_CarlosNoé1 {

    public static void main(String[] args) {
        ArrayList<Usuario> USU = new ArrayList();

        Scanner ONE = new Scanner(System.in);

        Usuario INICIO = new Usuario("Biblio", "Biblio", "Biblioteca");

        Usuario INICIO1 = new Usuario("Est", "Est", "Estudiante");

        Usuario INICIO2 = new Usuario("Profe", "Profe", "Profesor");

        USU.add(INICIO);
        USU.add(INICIO1);
        USU.add(INICIO2);
        
        ArrayList Arr = new ArrayList();
        System.out.println("Ingrese Usuario");
        String Nombre = ONE.nextLine();
        ONE = new Scanner(System.in);
        System.out.println("Ingrese Contraseña");
        String Contrasenya = ONE.nextLine();
        boolean Bandera = true;

        for (int j = 0; j < USU.size(); j++) {
            if (USU.get(j).getNombreUsu().contentEquals(Nombre) && USU.get(j).getContrasenya().equals(Contrasenya)) {
                Bandera = true;
                j= USU.size();
            } else {
                Bandera = false;
            }
        }
        Scanner sc = new Scanner(System.in);

        while (Bandera != false) {
            System.out.println("--Bienvenido al menu-- \n"
                    + "Escriba '1' Si quiere Ingresar a listar recurso \n"
                    + "Escriba '2' Si quiere Ingresar a Crear recurso \n"
                    + "Escriba '3' Si quiere Ingresar a Eliminar Recurso \n"
                    + "Escriba '4' Si quiere Ingresar a Modificar Recurso \n"
                    + "Escriba '5' para Salir ");
            int NOM = sc.nextInt();
            if ((NOM > 0) && (NOM < 6)) {
                switch (NOM) {
                    case 1:
                        if (INICIO.getTipoUsu().equalsIgnoreCase("Estudiante")) {
                            for (int i = 0; i < Arr.size(); i++) {
                                ((Libros) Arr.get(i)).toString();
                            }
                        } else {
                            System.out.println("Tipo de usuario invalido");
                        }

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:
                        Bandera = false;
                        break;
                }

            } else {
                System.out.println("Numero mal Ingresados");

            }
        }

    }
}
