package borrador;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Partida {
    Random Ran = new Random();
    String[] Nombre = new String[20];
    String [] Palabras;
    char[][] Sopa;
    int [][] posiciones = new int[10][4];
    String palabrain;
    int xo, yo, xf, yf, direccion;
    
    public void Menu2() {
        boolean regresar = true;
        int num = 0;
        while (regresar) {
            try {
                Scanner sc = new Scanner(System.in);
                do {
                    System.out.println("1.  Menu de Palabras");
                    System.out.println("2.  Jugar");
                    System.out.println("3.  Terminar la partida\n");
                    num = sc.nextInt();
                    switch (num) {
                        case 1: {
                            Menu3();
                        }
                        break;
                        case 2: {
                            LlenarAleatorio();
                            for (int i = 0; i < Sopa.length; i++) {
                                for (int j = 0; j < Sopa.length; j++) {
                                    System.out.print("| " + Sopa[i][j] + " |");
                                }System.out.println("");
                            }
                        }
                        break;
                        case 3: {
                            regresar = false;
                        }
                        break;
                        default: {
                            System.err.println("Ingrese una opcion del menu \n");
                        }
                        break;
                    }
                } while (regresar);
            } catch (InputMismatchException err) {
                System.err.println("Solo se permiten numeros\n");
            }
        }
    }

    public void Menu3() {
        boolean salir = true;
        int num = 0;
        int num_pal = 0; 
        while (salir) {
            try {
                Scanner sc = new Scanner(System.in);
                do {
                    System.out.println("Menu de Palabras");
                    System.out.println("1.  Insertar");
                    System.out.println("2.  Modificar");
                    System.out.println("3.  Eliminar");
                    System.out.println("4.  Mostar Palabras");
                    System.out.println("5.  salir");
                    num = sc.nextInt();

                    switch (num) {
                        case 1: {
                            System.out.println("Ingrese el numero de palabras que desea ingresar");
                            num_pal = sc.nextInt();
                            Palabras = new String[num_pal];
                            for (int i = 0; i < num_pal; i++) {                            
                            System.out.println("Ingrese una Palabra");
                            palabrain = sc.next();
                                if (palabrain.length() >=4 && palabrain.length()<=10) {
                                    palabrain = palabrain.toUpperCase();
                                    Palabras[i] = palabrain;                                    
                                }else{
                                    System.err.println("La palabra tiene que ser entre 4 y 10 caracteres\n");
                                    i--;
                                }
                            }
                        }
                        break;
                        case 2: {
                            
                        }
                        break;
                        case 3: {

                        }
                        break;
                        case 4: {
                            for (int i = 0; i < num_pal; i++) {
                                System.out.println(Palabras[i]+ "\n");
                            }
                        }
                        break;
                        case 5: {
                            salir = false;
                        }
                        break;
                        default: {
                            System.err.println("Ingrese una opcion del menu \n");
                        }
                        break;
                    }
                } while (salir);
            } catch (InputMismatchException err) {
                System.err.println("\nSolo se permiten numeros\n");
            }
        }
    }
    
    public void LlenarAleatorio(){
        char Abecedario [] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for (int i = 0; i < Sopa.length; i++) {
            for (int j = 0; j < Sopa.length; j++) {
                if (Sopa[i][j] == 0) {
                    Sopa[i][j] = Abecedario[Ran.nextInt(Abecedario.length - 0)+0];
                }
            }
        }
    }
    public void Insertar(){
        xo = Ran.nextInt((Sopa.length - palabrain.length())-0)+0;
        yo = Ran.nextInt((Sopa.length - palabrain.length())-0)+0;
        
        direccion = Ran.nextInt(2-0)+0;
        
        if (direccion == 0) {
            xf = xo + palabrain.length();
            yf = yo;
        }else if(direccion == 1){
            xf = xo;
            yf = yo + palabrain.length();
        }
    }
    
    public String Verificacion(){
        
        
        
        return "";
    }
    
    public void Eliminar(){
        
    }
    
    public void Actualizar(){
        
    }
}
