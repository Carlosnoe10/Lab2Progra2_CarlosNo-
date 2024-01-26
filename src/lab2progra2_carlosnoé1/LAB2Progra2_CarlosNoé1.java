package lab2progra2_carlosnoé1;

import java.util.ArrayList;
import java.util.Scanner;

public class LAB2Progra2_CarlosNoé1 {

    public static void main(String[] args) {
        ArrayList<Usuario> USU = new ArrayList();
        ArrayList<Libros> Books = new ArrayList();
        ArrayList<Articulos> Art = new ArrayList();
        ArrayList<CursoEnLinea> Cursos = new ArrayList();
        ArrayList<ConferenciasVirtuales> Confe = new ArrayList();

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
                j = USU.size();
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
                        for (int i = 0; i < Arr.size(); i++) {
                            if (USU.get(i).getTipoUsu().equalsIgnoreCase("Estudiante")) {
                                for (int j = 0; j < Books.size(); j++) {
                                    System.out.println(Books.get(i).toString());
                                }
                                for (int j = 0; j < Art.size(); j++) {
                                    System.out.println(Art.get(i).toString());
                                }
                                for (int j = 0; j < Cursos.size(); j++) {
                                    System.out.println(Cursos.get(i).toString());
                                }
                                for (int j = 0; j < Confe.size(); j++) {
                                    System.out.println(Confe.get(i).toString());
                                }
                                i++;
                            } else {

                                System.out.println("No tiene acesso");
                            }
                        }
                        break;
                    case 2:
                        boolean FlagCrea1 = true;
                        for (int j = 0; j < USU.size(); j++) {
                            if ((USU.get(j).getTipoUsu().equalsIgnoreCase("Biblioteca")) || (USU.get(j).getTipoUsu().equalsIgnoreCase("Profesor"))) {
                                FlagCrea1 = true;
                                j = USU.size();

                                boolean FlagCrea = true;
                                while (FlagCrea != false) {
                                    for (int i = 0; i < 1; i++) {
                                        System.out.println("--Bienvenido al menu-- \n"
                                                + "Escriba '1' Si quiere Ingresar a Crear Libros \n"
                                                + "Escriba '2' Si quiere Ingresar a Crear Articulos \n"
                                                + "Escriba '3' Si quiere Ingresar a Crear Cursos en Linea \n"
                                                + "Escriba '4' Si quiere Ingresar a Crear Conferencias Virtuales \n"
                                                + "Escriba '5' para Salir ");
                                        int NOMCrear = sc.nextInt();

                                        switch (NOMCrear) {
                                            case 1:
                                                ONE = new Scanner(System.in);

                                                System.out.println("Ingrese el titulo");
                                                String Titulo = ONE.nextLine();
                                                System.out.println("Ingrese el Autor");
                                                String Autor = ONE.nextLine();
                                                sc = new Scanner(System.in);
                                                System.out.println("Ingrese el Año de publicacion");
                                                int Anio = sc.nextInt();
                                                System.out.println("Ingrese 1 para Disponibilidad si y 2 si disponibilidad no");
                                                int Disp = sc.nextInt();

                                                if (Anio >= 0) {
                                                    if (Disp == 1) {
                                                        Libros novo = new Libros(Titulo, Autor, Anio, true);
                                                        Books.add(novo);
                                                    } else if ((Disp == 2)) {
                                                        Libros novo = new Libros(Titulo, Autor, Anio, false);
                                                        Books.add(novo);
                                                    } else {
                                                        System.out.println("Valor invalido");
                                                    }
                                                    i++;

                                                } else {
                                                    i--;
                                                    System.out.println("Valores invalidos invalidos");
                                                }

                                                break;
                                            case 2:
                                                ONE = new Scanner(System.in);
                                                sc = new Scanner(System.in);
                                                System.out.println("Ingrese el titulo");
                                                String Titulo2 = ONE.nextLine();
                                                ONE = new Scanner(System.in);
                                                System.out.println("Ingrese el Autor");
                                                String Autor2 = ONE.nextLine();
                                                ONE = new Scanner(System.in);
                                                System.out.println("Ingrese el tema");
                                                String Tema = ONE.nextLine();
                                                ONE = new Scanner(System.in);
                                                System.out.println("Ingrese la fecha de publicacion");
                                                String publi = ONE.nextLine();
                                                ONE = new Scanner(System.in);
                                                sc = new Scanner(System.in);
                                                System.out.println("Ingrese 1 para Disponibilidad si y 2 si disponibilidad no");
                                                int Disp1 = sc.nextInt();

                                                if (Disp1 == 1) {
                                                    Articulos art = new Articulos(Titulo2, Autor2, Tema, publi, true);
                                                    Art.add(art);
                                                    i++;
                                                } else if ((Disp1 == 2)) {
                                                    Articulos art = new Articulos(Titulo2, Autor2, Tema, publi, false);
                                                    Art.add(art);
                                                    i++;
                                                } else {
                                                    System.out.println("Valor invalido");
                                                }

                                                i++;
                                                break;
                                            case 3:
                                                ONE = new Scanner(System.in);
                                                sc = new Scanner(System.in);
                                                System.out.println("Ingrese el titulo");
                                                String Titulo3 = ONE.nextLine();
                                                System.out.println("Ingrese el Instructor");
                                                String Instructor = ONE.nextLine();
                                                sc = new Scanner(System.in);
                                                System.out.println("Ingrese la duracion en semanas");
                                                int Duracion = sc.nextInt();
                                                System.out.println("Ingrese la plataforma ");
                                                ONE = new Scanner(System.in);
                                                sc = new Scanner(System.in);
                                                String Plataforma = ONE.nextLine();

                                                if (Duracion >= 0) {
                                                    CursoEnLinea kurs = new CursoEnLinea(Titulo3, Instructor, Duracion, Plataforma);
                                                    Cursos.add(kurs);
                                                } else {
                                                    System.out.println("Valor invalido");
                                                }
                                                i++;

                                                break;
                                            case 4:
                                                ONE = new Scanner(System.in);
                                                sc = new Scanner(System.in);
                                                System.out.println("Ingrese el titulo");
                                                String Titulo4 = ONE.nextLine();
                                                System.out.println("Ingrese el Conferencista");
                                                String Conferencista = ONE.nextLine();
                                                sc = new Scanner(System.in);
                                                System.out.println("Ingrese la Duracion");
                                                int Duracion1 = sc.nextInt();
                                                System.out.println("Ingrese la Fecha ");
                                                ONE = new Scanner(System.in);
                                                sc = new Scanner(System.in);
                                                String Fecha1 = ONE.nextLine();
                                                System.out.println("Ingrese el enlace");
                                                ONE = new Scanner(System.in);
                                                sc = new Scanner(System.in);
                                                String Enlace = sc.nextLine();
                                                if (Duracion1 >= 0) {
                                                    ConferenciasVirtuales Confe1 = new ConferenciasVirtuales(Titulo4, Conferencista, Fecha1, Duracion1, Enlace);
                                                    Confe.add(Confe1);
                                                } else {
                                                    System.out.println("Valor invalido");
                                                }

                                                i++;
                                                break;
                                            case 5:
                                                FlagCrea = false;
                                                break;
                                            default:
                                                System.out.println("Valor Invalido");
                                                i--;
                                        }
                                    }

                                }

                            } else {
                                System.out.println("No tiene acesso");
                                j = USU.size();
                                FlagCrea1 = false;
                            }
                        }

                        break;
                    case 3:
                        for (int i = 0; i < USU.size(); i++) {
                            if (USU.get(i).getTipoUsu().equalsIgnoreCase("Biblioteca")) {
                                i = USU.size();
                                boolean FlagCrea = true;
                                while (FlagCrea != false) {
                                    System.out.println("--Bienvenido al menu-- \n"
                                            + "Escriba '1' Si quiere Ingresar a Eliminar Libros \n"
                                            + "Escriba '2' Si quiere Ingresar a Eliminar Articulos \n"
                                            + "Escriba '3' Si quiere Ingresar a Eliminar Cursos en Linea \n"
                                            + "Escriba '4' Si quiere Ingresar a Eliminar Conferencias Virtuales \n"
                                            + "Escriba '5' para Salir ");
                                    int NOMCrear = sc.nextInt();

                                    switch (NOMCrear) {
                                        case 1:
                                            ONE = new Scanner(System.in);
                                            System.out.println("Ingrese el titulo");
                                            String Titulo = ONE.nextLine();

                                            for (int j = 0; j < Books.size(); j++) {
                                                if (Books.get(i).getTitulo().equalsIgnoreCase(Titulo)) {
                                                    Books.remove(j);
                                                }

                                            }
                                            i++;
                                            break;

                                        case 2:
                                            ONE = new Scanner(System.in);
                                            System.out.println("Ingrese el titulo");
                                            String Titulo1 = ONE.nextLine();

                                            for (int j = 0; j < Books.size(); j++) {
                                                if (Art.get(i).getTitulo().equalsIgnoreCase(Titulo1)) {
                                                    Art.remove(j);
                                                }

                                            }
                                            i++;
                                            break;

                                        case 3:
                                            ONE = new Scanner(System.in);
                                            System.out.println("Ingrese el titulo");
                                            String Titulo2 = ONE.nextLine();

                                            for (int j = 0; j < Books.size(); j++) {
                                                if (Cursos.get(i).getTitulo().equalsIgnoreCase(Titulo2)) {
                                                    Cursos.remove(j);
                                                }

                                            }
                                            i++;
                                            break;

                                        case 4:
                                            ONE = new Scanner(System.in);
                                            System.out.println("Ingrese el titulo");
                                            String Titulo3 = ONE.nextLine();

                                            for (int j = 0; j < Books.size(); j++) {
                                                if (Confe.get(i).getTitulo().equalsIgnoreCase(Titulo3)) {
                                                    Confe.remove(j);
                                                }

                                            }
                                            i++;
                                            break;

                                        case 5:
                                            FlagCrea = true;
                                            i++;
                                            break;

                                        default:
                                            System.out.println("Valor invalido");
                                            i--;
                                    }
                                }

                                i++;
                            } else {
                                System.out.println("No tiene acesso");
                            }
                        }

                        break;
                    case 4:
                        boolean FlagCrea2 = true;
                        for (int j = 0; j < USU.size(); j++) {
                            if ((USU.get(j).getTipoUsu().equalsIgnoreCase("Biblioteca")) || (USU.get(j).getTipoUsu().equalsIgnoreCase("Profesor"))) {
                                FlagCrea2 = true;
                                j = USU.size();

                                boolean FlagCrea = true;
                                while (FlagCrea != false) {
                                    for (int i = 0; i < 1; i++) {
                                        System.out.println("--Bienvenido al menu-- \n"
                                                + "Escriba '1' Si quiere Ingresar a MOD Libros \n"
                                                + "Escriba '2' Si quiere Ingresar a MOD Articulos \n"
                                                + "Escriba '3' Si quiere Ingresar a MOD Cursos en Linea \n"
                                                + "Escriba '4' Si quiere Ingresar a MOD Conferencias Virtuales \n"
                                                + "Escriba '5' para Salir ");
                                        int NOMCrear = sc.nextInt();

                                        switch (NOMCrear) {
                                            case 1:
                                                
                                                System.out.println("Ingrese el numero en lista del Articulo que desea modificar");
                                                int Mod4 = ONE.nextInt();
                                                if (Mod4 > 0 && Mod4 < Confe.size()) {
                                                ONE = new Scanner(System.in);

                                                System.out.println("Ingrese el Nuevo titulo");
                                                String Titulo = ONE.nextLine();
                                                System.out.println("Ingrese el Nuevo  Autor");
                                                String Autor = ONE.nextLine();
                                                sc = new Scanner(System.in);
                                                System.out.println("Ingrese el  Nuevo Año de publicacion");
                                                int Anio = sc.nextInt();
                                                System.out.println("Ingrese 1 para Disponibilidad si y 2 si disponibilidad no");
                                                int Disp = sc.nextInt();

                                                if (Anio >= 0) {
                                                    if (Disp == 1) {
                                                        Books.get(Mod4).setAutor(Autor);
                                                        Books.get(Mod4).setAñoPubli(Disp);
                                                        Books.get(Mod4).setDisponibilidad(true);
                                                        Books.get(Mod4).setTitulo(Titulo);
                                                        
                                                        
                                                    } else if ((Disp == 2)) {
                                                        Books.get(Mod4).setAutor(Autor);
                                                        Books.get(Mod4).setAñoPubli(Disp);
                                                        Books.get(Mod4).setDisponibilidad(true);
                                                        Books.get(Mod4).setTitulo(Titulo);
                                                    } else {
                                                        System.out.println("Valor invalido");
                                                    }
                                                    i++;

                                                } else {
                                                    i--;
                                                    System.out.println("Valores invalidos invalidos");
                                                }
                                                }else{
                                                    System.out.println("Valor invalido");
                                                }

                                                break;
                                            case 2:
                                                System.out.println("Ingrese el numero en lista del Articulo que desea modificar");
                                                int Mod3 = ONE.nextInt();
                                                if (Mod3 > 0 && Mod3 < Confe.size()) {
                                                ONE = new Scanner(System.in);
                                                sc = new Scanner(System.in);
                                                System.out.println("Ingrese el  Nuevo titulo");
                                                String Titulo2 = ONE.nextLine();
                                                ONE = new Scanner(System.in);
                                                System.out.println("Ingrese el Nuevo Autor");
                                                String Autor2 = ONE.nextLine();
                                                ONE = new Scanner(System.in);
                                                System.out.println("Ingrese el Nuevo tema");
                                                String Tema = ONE.nextLine();
                                                ONE = new Scanner(System.in);
                                                System.out.println("Ingrese la Nueva  fecha de publicacion");
                                                String publi = ONE.nextLine();
                                                ONE = new Scanner(System.in);
                                                sc = new Scanner(System.in);
                                                System.out.println("Ingrese 1 para Disponibilidad si y 2 si disponibilidad no");
                                                int Disp1 = sc.nextInt();

                                                if (Disp1 == 1) {
                                                    Art.get(Mod3).setAutor(Autor2);
                                                    Art.get(Mod3).setDisponibilidad(true);
                                                    Art.get(Mod3).setTema(Tema);
                                                    Art.get(Mod3).setTitulo(Titulo2);
                                                    Art.get(Mod3).setFechaPubli(publi);
                                                    i++;
                                                } else if ((Disp1 == 2)) {
                                                    Art.get(Mod3).setAutor(Autor2);
                                                    Art.get(Mod3).setDisponibilidad(false);
                                                    Art.get(Mod3).setTema(Tema);
                                                    Art.get(Mod3).setTitulo(Titulo2);
                                                    Art.get(Mod3).setFechaPubli(publi);
                                                    i++;
                                                } else {
                                                    System.out.println("Valor invalido");
                                                }
                                                }else{
                                                    System.out.println("Valor Invalido");
                                                }
                                                i++;
                                                break;
                                            case 3:
                                                System.out.println("Ingrese el numero en lista del Articulo que desea modificar");
                                                int Mod2 = ONE.nextInt();
                                                if (Mod2 > 0 && Mod2 < Confe.size()) {

                                                    ONE = new Scanner(System.in);
                                                    sc = new Scanner(System.in);
                                                    System.out.println("Ingrese el  Nuevo  titulo");
                                                    String Titulo3 = ONE.nextLine();
                                                    System.out.println("Ingrese el  Nuevo Instructor");
                                                    String Instructor = ONE.nextLine();
                                                    sc = new Scanner(System.in);
                                                    System.out.println("Ingrese la  Nuevo duracion en semanas");
                                                    int Duracion = sc.nextInt();
                                                    System.out.println("Ingrese la  Nuevo plataforma ");
                                                    ONE = new Scanner(System.in);
                                                    sc = new Scanner(System.in);
                                                    String Plataforma = ONE.nextLine();

                                                    if (Duracion >= 0) {
                                                        Cursos.get(Mod2).setDuracionEnSemanas(Duracion);
                                                        Cursos.get(Mod2).setInstuctor(Instructor);
                                                        Cursos.get(Mod2).setPlataformaE(Plataforma);
                                                        Cursos.get(Mod2).setTitulo(Titulo3);
                                                        
                                                        
                                                    } else {
                                                        System.out.println("Valor invalido");
                                                    }
                                                } else {
                                                    System.out.println("Valor invalido");
                                                }
                                                i++;

                                                break;
                                            case 4:

                                                System.out.println("Ingrese el numero en lista de la conferencia que desea modificar");
                                                int Mod = ONE.nextInt();
                                                if (Mod > 0 && Mod < Confe.size()) {

                                                    ONE = new Scanner(System.in);
                                                    sc = new Scanner(System.in);
                                                    System.out.println("Ingrese el  Nuevo titulo");
                                                    String Titulo4 = ONE.nextLine();
                                                    System.out.println("Ingrese el  Nuevo Conferencista");
                                                    String Conferencista = ONE.nextLine();
                                                    sc = new Scanner(System.in);
                                                    System.out.println("Ingrese la  Nueva Duracion");
                                                    int Duracion1 = sc.nextInt();
                                                    System.out.println("Ingrese la  Nuevo Fecha ");
                                                    ONE = new Scanner(System.in);
                                                    sc = new Scanner(System.in);
                                                    String Fecha1 = ONE.nextLine();
                                                    System.out.println("Ingrese el  Nuevo enlace");
                                                    ONE = new Scanner(System.in);
                                                    sc = new Scanner(System.in);
                                                    String Enlace = sc.nextLine();
                                                    if (Duracion1 >= 0) {
                                                        Confe.get(Mod).setConferencista(Conferencista);
                                                        Confe.get(Mod).setDuracion(Duracion1);
                                                        Confe.get(Mod).setEnlaceAcceso(Enlace);
                                                        Confe.get(Mod).setTitulo(Titulo4);
                                                        Confe.get(Mod).setFecha(Fecha1);
                                                    } else {
                                                        System.out.println("Valor invalido");
                                                    }

                                                    i++;
                                                } else {
                                                    System.out.println("Ingrese un valor valido");
                                                }
                                        }
                                    }
                                }
                            }
                        }
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
//for (int j = 0; j < USU.size(); j++) {
//            if (USU.get(j).getNombreUsu().contentEquals(Nombre) && USU.get(j).getContrasenya().equals(Contrasenya)) {
//                j= USU.size();
//            } else {
//                Bandera = false;
//            }
//        }
