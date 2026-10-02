import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static String soy_cande;

    public static void main(String[] args) {
        Libro l1 = new Libro(1, 234, "tornado", "mili", true);
        Libro l2 = new Libro(2, 235, "elmas", "capito", false);
        Libro l3 = new Libro(3, 432, "micho", "talarga", true);
        Libro l4 = new Libro(4, 123, "elvio", "lador", false);

        // ArrayList para dar de alta libros
        ArrayList<Libro> lista = new ArrayList<>();
        lista.add(l1);
        lista.add(l2);
        lista.add(l3);
        lista.add(l4);
        Scanner sc = new Scanner(System.in);
        int opcion, Id;
        System.out.println("opciones: ");
        opcion = sc.nextInt();
        sc.nextLine();
        while (opcion != 7) {
            switch (opcion) {
                case 1:
                    System.out.println(lista.get(0).mostrarDatos());
                    System.out.println(lista.get(1).mostrarDatos());
                    System.out.println(lista.get(2).mostrarDatos());
                    System.out.println(lista.get(3).mostrarDatos());

                    break;
                case 2:
                    System.out.println("ingrtese el id del libro");
                    Id = sc.nextInt();
                    sc.nextLine();
                    if (Id == lista.get(0).id) {
                        System.out.println(lista.get(0).toString());
                    } else if (Id == lista.get(1).id) {
                        System.out.println(lista.get(1).toString());
                    } else if (Id == lista.get(2).id) {
                        System.out.println(lista.get(2).toString());
                    } else {
                        System.out.println(lista.get(3).toString());
                    }

                    break;
                case 3:
                    System.out.println("ingrtese el id del libro");
                    Id = sc.nextInt();
                    sc.nextLine();
                    if (Id == lista.get(0).id) {
                        if (lista.get(0).prestado) {
                            System.out.println("fue prestado");
                        } else {
                            System.out.println("esta disponible");
                        }
                    } else if (Id == lista.get(1).id) {
                        if (lista.get(1).prestado) {
                            System.out.println("fue prestado");
                        } else {
                            System.out.println("esta disponible");
                        }
                    } else if (Id == lista.get(2).id) {
                        if (lista.get(2).prestado) {
                            System.out.println("fue prestado");
                        } else {
                            System.out.println("esta disponible");
                        }
                    } else {
                        if (lista.get(3).prestado) {
                            System.out.println("fue prestado");
                        } else {
                            System.out.println("esta disponible");
                        }
                    }

                    break;
                case 4:
                    System.out.println("ingrtese el id del libro");
                    Id = sc.nextInt();
                    sc.nextLine();
                    if (Id == lista.get(0).id) {
                        if (lista.get(0).prestado) {
                            lista.get(0).prestado = false;
                        } else {
                            lista.get(0).prestado = true;
                        }
                    } else if (Id == lista.get(1).id) {
                        if (lista.get(1).prestado) {
                            lista.get(1).prestado = false;
                        } else {
                            lista.get(1).prestado = true;
                        }
                    } else if (Id == lista.get(2).id) {
                        if (lista.get(2).prestado) {
                           lista.get(2).prestado = false;
                        } else {
                            lista.get(2).prestado = true;
                        }
                    } else {
                        if (lista.get(3).prestado) {
                            lista.get(3).prestado = false;
                        } else {
                            lista.get(3).prestado = true;
                        }
                    }

                    break;
                case 5:
                    int Id2;
                    System.out.println("ingrese dos libros");
                    Id = sc.nextInt();
                    sc.nextLine();
                    Id2 = sc.nextInt();
                    sc.nextLine();
                    if (Id == lista.get(0).id && Id2 == lista.get(1).id) {
                        if (lista.get(0).pag > lista.get(1).pag) {
                            System.out.println("el primero es mas extenso");
                        } else {
                            System.out.println("el segundo es mas extenso");
                        }
                    } else if (Id == lista.get(0).id && Id2 == lista.get(2).id) {
                        if (lista.get(0).pag > lista.get(2).pag) {
                            System.out.println("el primero es mas extenso");
                        } else {
                            System.out.println("el segundo es mas extenso");
                        }
                    } else if (Id == lista.get(0).id && Id2 == lista.get(3).id) {
                        if (lista.get(0).pag > lista.get(3).pag) {
                            System.out.println("el primero es mas extenso");
                        } else {
                            System.out.println("el segundo es mas extenso");
                        }
                    } else if (Id == lista.get(1).id && Id2 == lista.get(2).id) {
                        if (lista.get(1).pag > lista.get(2).pag) {
                            System.out.println("el primero es mas extenso");
                        } else {
                            System.out.println("el segundo es mas extenso");
                        }
                    } else if (Id == lista.get(1).id && Id2 == lista.get(3).id) {
                        if (lista.get(1).pag > lista.get(3).pag) {
                            System.out.println("el primero es mas extenso");
                        } else {
                            System.out.println("el segundo es mas extenso");
                        }
                    } else if (Id == lista.get(2).id && Id2 == lista.get(3).id) {
                        if (lista.get(2).pag > lista.get(3).pag) {
                            System.out.println("el primero es mas extenso");
                        } else {
                            System.out.println("el segundo es mas extenso");
                        }
                    }
                    break;
                case 6:
                    // Alta de libro: solo se agrega al ArrayList
                    System.out.println("ingrese el id del libro");
                    int nuevoId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ingrese la cantidad de paginas");
                    int nuevoPag = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ingrese el titulo");
                    String nuevoTitulo = sc.nextLine();
                    System.out.println("ingrese el autor");
                    String nuevoAutor = sc.nextLine();
                    System.out.println("esta prestado? (true/false)");
                    boolean nuevoPrestado = sc.nextBoolean();
                    sc.nextLine();

                    Libro nuevoLibro = new Libro(nuevoId, nuevoPag, nuevoTitulo, nuevoAutor, nuevoPrestado);
                    lista.add(nuevoLibro);
                    System.out.println("libro dado de alta");
                    break;
                default:
                    System.out.println("opcion invalida");
                    break;
            }
            System.out.println("opciones");
            opcion = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("chau");

        System.out.println("cande");
        soy_cande = sc.nextLine();
        if (soy_cande.equals("soy cande")) {
            System.out.println("mentiroso");
        } else {
            System.out.println(" soy cande");
        }
    }
}