package lab2progra2_carlosnoé1;

import java.util.Scanner;

public class LAB2Progra2_CarlosNoé1 {

    public static void main(String[] args) {
        
        
        
        
        Scanner sc = new Scanner(System.in);
        boolean Bandera = true;
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
