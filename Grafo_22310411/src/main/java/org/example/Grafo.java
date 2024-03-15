package org.example;

public class Grafo {

    private int matriz[][];

    public Grafo(int size)
    {
        matriz = new int[size][size];
    }

    public void setMatrizValue(int fila, int columna, int _value)
    {
         matriz[fila][columna] = _value;
         matriz[columna][fila] = _value;
    }

    public void printGrafo()
    {
        for(int i = 0; i< matriz.length; i++)
        {
            for(int j =0; j< matriz.length; j++)
            {
                System.out.print(matriz[i][j]);
            }
            System.out.print("\n");
        }
    }

}
