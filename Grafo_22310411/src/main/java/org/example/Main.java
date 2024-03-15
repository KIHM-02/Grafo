package org.example;
import java.util.Scanner;

public class Main
{
    private static Grafo grafo[];

    public static void main(String[] args)
    {
        int opcion = 0;

        //defineGrafosLength();
        printDefaultValues();

    }

    public static void defineGrafosLength()
    {

        /*Este codigo lo cree para que el usuario creara Nodos
        * pero solo me centrare en mostrar los 5 solicitados*/

        Scanner scan = new Scanner(System.in);
        int grafosLenght = 0, matrizSize = 0;

        System.out.println("Cuantos grafos vas a crear?");
        grafosLenght = scan.nextInt();

        grafo = new Grafo[grafosLenght];

        System.out.println("Cuantos Nodos tendra cada grafo?");
        for(int i = 0; i<grafosLenght; i++)
        {
            matrizSize = scan.nextInt();
            grafo[i] = new Grafo(matrizSize);
        }


    }

    public static void pushValues(int posicion, int fila,
                                  int columna, int _value)
    {
        grafo[posicion].setMatrizValue(fila, columna, _value);
    }

    //Funcion para imprimir los 5 grafos solicitados por automatico
    public static void printDefaultValues()
    {
        grafo = new Grafo[5];
        for(int i = 0; i<5; i++)
        {
            grafo[i] = new Grafo(5);  //determinamos los valores automaticamente para los 5 grafos
        }

        //Grafo 1
        pushValues(0, 0, 0, 0);
        pushValues(0, 0, 1, 1 );
        pushValues(0, 0, 2, 1);
        pushValues(0, 0, 3, 0);
        pushValues(0, 0, 4, 1);

        pushValues(0, 1, 1, 0);
        pushValues(0, 1, 2, 0);
        pushValues(0, 1, 3, 1);
        pushValues(0, 1, 4, 0);

        pushValues(0, 2, 2, 0);
        pushValues(0, 2, 3, 0);
        pushValues(0, 2, 4, 1);

        pushValues(0, 3, 3, 0);
        pushValues(0, 3, 4, 0);

        pushValues(0, 4, 4, 0);

        System.out.println("Grafo 1");
        grafo[0].printGrafo();
        System.out.println();

        //Grafo 2
        pushValues(1, 0, 0, 0);
        pushValues(1, 0, 1, 1 );
        pushValues(1, 0, 2, 1);
        pushValues(1, 0, 3, 0);
        pushValues(1, 0, 4, 0);

        pushValues(1, 1, 1, 0);
        pushValues(1, 1, 2, 0);
        pushValues(1, 1, 3, 1);
        pushValues(1, 1, 4, 0);

        pushValues(1, 2, 2, 0);
        pushValues(1, 2, 3, 1);
        pushValues(1, 2, 4, 0);

        pushValues(1, 3, 3, 0);
        pushValues(1, 3, 4, 1);

        pushValues(1, 4, 4, 0);

        System.out.println("Grafo 2");
        grafo[1].printGrafo();
        System.out.println();

        //Grafo 3
        pushValues(2, 0, 0, 0);
        pushValues(2, 0, 1, 0);
        pushValues(2, 0, 2, 1);
        pushValues(2, 0, 3, 1);
        pushValues(2, 0, 4, 0);

        pushValues(2, 1, 1, 0);
        pushValues(2, 1, 2, 1);
        pushValues(2, 1, 3, 1);
        pushValues(2, 1, 4, 1);

        pushValues(2, 2, 2, 0);
        pushValues(2, 2, 3, 0);
        pushValues(2, 2, 4, 0);

        pushValues(2, 3, 3, 0);
        pushValues(2, 3, 4, 0);

        pushValues(2, 4, 4, 0);

        System.out.println("Grafo 3");
        grafo[2].printGrafo();
        System.out.println();

        //Grafo 4
        pushValues(3, 0, 0, 0);
        pushValues(3, 0, 1, 0);
        pushValues(3, 0, 2, 0);
        pushValues(3, 0, 3, 0);
        pushValues(3, 0, 4, 1);

        pushValues(3, 1, 1, 0);
        pushValues(3, 1, 2, 0);
        pushValues(3, 1, 3, 0);
        pushValues(3, 1, 4, 1);

        pushValues(3, 2, 2, 0);
        pushValues(3, 2, 3, 1);
        pushValues(3, 2, 4, 0);

        pushValues(3, 3, 3, 0);
        pushValues(3, 3, 4, 1);

        pushValues(3, 4, 4, 0);

        System.out.println("Grafo 4");
        grafo[3].printGrafo();
        System.out.println();

        //Grafo 5
        pushValues(4, 0, 0, 0);
        pushValues(4, 0, 1, 0 );
        pushValues(4, 0, 2, 1);
        pushValues(4, 0, 3, 1);
        pushValues(4, 0, 4, 0);

        pushValues(4, 1, 1, 0);
        pushValues(4, 1, 2, 0);
        pushValues(4, 1, 3, 1);
        pushValues(4, 1, 4, 1);

        pushValues(4, 2, 2, 0);
        pushValues(4, 2, 3, 0);
        pushValues(4, 2, 4, 1);

        pushValues(4, 3, 3, 0);
        pushValues(4, 3, 4, 0);

        pushValues(4, 4, 4, 0);

        System.out.println("Grafo 5");
        grafo[4].printGrafo();
        System.out.println();
    }
}