import java.util.Scanner;

public class App {
    public static void main(String[] args){

        int operacion, numA, numB, resultado=0, pregunta=1;

        Scanner teclado = new Scanner(System.in);

       while (pregunta == 1) {

        System.out.println("¡BIENVENIDOS A MI CALCULADORA!");
        System.out.println("ingrese el numero de la operacion que desea resolver");
        System.out.println("1 SUMAR");
        System.out.println("2 RESTAR");
        System.out.println("3 MULTIPLICAR");
        System.out.println("4 DIVIDIR");
        System.out.println("5 POTENCIA");

        operacion = teclado.nextInt();

        System.out.println("ingrese el primer numero");
        numA = teclado.nextInt();
        if(numA == 0){
            System.out.println("No puedes hacer una operacion con 0");
            System.out.println("ingrese el primer numero");
            numA = teclado.nextInt();
        }
        System.out.println("ingrese el segundo numero");
        numB = teclado.nextInt();
        if (numB == 0) {
            System.out.println("No puedes hacer una operacion con 0");
            System.out.println("ingrese el segundo numero");
            numB = teclado.nextInt();
        }

        if (operacion == 1) {
            resultado = numA + numB;
        }
        if (operacion == 2) {
            resultado = numA - numB;
        }
        if (operacion == 3) {
            resultado = numA * numB;
        }
        if (operacion == 4){
            resultado = numA / numB;
        }
        if (operacion == 5) {
            int contador = 0;
            resultado = 1;
            while(contador < numB){
                resultado = resultado * numA;
                contador = contador + 1;
            }
        }

        System.out.println("El resultado de tu operacion es: "+ resultado);

        System.out.println("¿Desea realizar otra operacion? 0:NO 1:SI ");
        pregunta = teclado.nextInt();
        
    }
    teclado.close();

    }
}