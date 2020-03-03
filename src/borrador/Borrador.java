package borrador;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Borrador {
    
    public static void main(String[] args) {

        int num = 0;
        boolean salir = true;
        int cont = 0;
        int n;
        Partida nueva = new Partida();
        while (salir) {
            try {
                Scanner sc = new Scanner(System.in);
                do {
                    System.out.println("Bienvenido a SOPA DE LETRAS.\n");
                    System.out.println("Seleccione un opcion:");
                    System.out.println("1.  Nueva Partida");
                    System.out.println("2.  Historial");
                    System.out.println("3.  Puntuaciones");
                    System.out.println("4.  Perdedores");
                    System.out.println("5.  Ganadores");
                    System.out.println("6.  Informacion del desarrollador");
                    System.out.println("7.  Salir\n");
                    num = sc.nextInt();
                    switch (num) {
                        case 1: {
                            System.out.println("Ingrese su nombre");
                            nueva.Nombre[cont] = sc.next();
                            cont++;
                            System.out.println("Ingrese el tamaño de la matriz");
                            n = sc.nextInt();
                            nueva.Sopa= new char[n][n];
                            nueva.Menu2();
                        }
                        break;
                        case 2: {
                            System.out.println(nueva.Nombre[0]);
                        }
                        break;
                        case 6: {
                            System.err.println("");
                            System.err.println("Nombre:  Ricardo Javier Villatoro Bámaca");
                            System.err.println("Carnet:  201801603");
                            System.err.println("Seccion: E");
                            System.err.println("");
                        }
                        break;
                        case 7: {
                            salir = false;
                        }
                        break;
                        default:
                            System.err.println("\nIngrese un numero de acuerdo al menu \n");
                    }
                } while (salir);

            } catch (InputMismatchException err) {
                System.err.println("\nSolo se permite numeros \n");
            }

        }
    }

    

}
