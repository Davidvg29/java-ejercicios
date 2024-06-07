import java.util.Scanner;

// TP 3 Ejercicio A
// Leer de n alumnos el numero de legajo y la nota de la materia informatica. 
// Se desea conocer: 
//     - La antidad de alumnos por cada condicion,, teniendo en cuenta la tabla a continuaion
//         Desaprbado 0 a 39   aprobado 40 a 70    prommocionado 75 a 100

public class App {
    public static void main(String[] args) {
        
        int alumnDesaprobados=0, alumnAprobado=0, alumnPromocionado=0, nota=0, legajo=0;
        String pregunta="si";

        Scanner valorPregunta = new Scanner(System.in);
        Scanner valorLegajo = new Scanner(System.in);
        Scanner valorNota = new Scanner(System.in);

        do {
            
            System.out.println("ingrese legajo de alumno, numero de 4 cifras");
            legajo= valorLegajo.nextInt();

            while (legajo<=999 || legajo>9999) {
                System.out.println("ingrese un legajo de 4 cifras");
                legajo= valorLegajo.nextInt();
                valorLegajo.close();
            }

            System.out.println("ingrese la nota del alumno");
            nota = valorNota.nextInt();
            valorNota.close();
            if (nota>0&&nota<=39) {
                alumnDesaprobados=alumnDesaprobados+1;
            }
            if(nota>=40&&nota<=74){
                alumnAprobado=alumnAprobado+1;
            }
            if(nota>=75&&nota<=100){
                alumnPromocionado=alumnPromocionado+1;
            }

            System.out.println("¿desea agregar un alumno mas?");
            pregunta= valorPregunta.nextLine();
            valorPregunta.close();

        } while (!pregunta.equals("no"));

        System.out.println("desaprobados: "+ alumnDesaprobados);
        System.out.println("aprobados: "+alumnAprobado);
        System.out.println("promocionados: "+alumnPromocionado);

    }
}
