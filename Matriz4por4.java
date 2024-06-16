import java.util.Scanner;
public class App {

    // en una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos. 
    // cada fila corresponde a las notas y al promedio de cada alumno.
    // se necesita un programa que permita a un profesor cargar, en las
    // 3 posiciones(columnas) de cada fila, las notas del alumno y que en la ultima columna 
    // se calcule los promedios. una vez realizados los  calculos, se desea mostrar 
    // las 3 notas de cada alumno y el promedio recorriendo la matriz.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        int tabla[][] = new int[4][4];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length-1; j++) {
                System.out.println("ingresa la nota del trimestre "+(j+1) +" del alumno "+ (i+1));
                tabla[i][j] = teclado.nextInt();
                tabla[i][tabla.length-1]+=tabla[i][j];
                }
                tabla[i][tabla.length-1]=tabla[i][tabla.length-1]/3;
        }
        teclado.close();
        for (int i = 0; i < tabla.length; i++) {
                System.out.println("el promedio del alumno "+(i+1)+" es "+tabla[i][3]);
        }

    }
}
