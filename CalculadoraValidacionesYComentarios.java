//importa la clase de scanner que permite ingresar valores por teclado
import java.util.Scanner;

public class App {
    public static void main(String[] args){

        //declara e inicializa las variables de tipo entero
        int operacion=0, numA=0, numB=0, resultado=0, pregunta=1;

        //inicia la clase scanner guardandola en la variable teclado
        Scanner teclado = new Scanner(System.in);

        //bucle donde si la variable pregunta si es 1 ocurrira lo que hay dentro
        //y como la variable pregunta esta inicializada con el valor 1 
        //siempre ocurrira en la primera vez
        while (pregunta == 1) {

        //las siguientes 7 lineas solo son texto que se muestran en consola
        System.out.println("¡BIENVENIDOS A MI CALCULADORA!");
        System.out.println("ingrese el numero de la operacion que desea resolver");
        System.out.println("1 SUMAR");
        System.out.println("2 RESTAR");
        System.out.println("3 MULTIPLICAR");
        System.out.println("4 DIVIDIR");
        System.out.println("5 POTENCIA");
        
        //llama la accion de scanner para elegir la operacion a realizar
        //y el valor ingresado se guarda en la variable operacion
        operacion = teclado.nextInt();

        //muestra el texto para ingresar el primer numero
        System.out.println("ingrese el primer numero");

        //llama la accion de scanner para ingresar el valor de la variable numA
        numA = teclado.nextInt();

        //condicional si numA es cero te lo vuelvo a pedir
        if(numA == 0){
            System.out.println("No puedes hacer una operacion con 0");
            System.out.println("ingrese el primer numero");
            numA = teclado.nextInt();
        }

        //muestra el texto para ingresar el segundo numero        
        System.out.println("ingrese el segundo numero");

        //llama la accion de scanner para ingresar el valor de la variable numB
        numB = teclado.nextInt();

        //condicional si numB es cero te lo vuelvo a pedir
        if (numB == 0) {
            System.out.println("No puedes hacer una operacion con 0");
            System.out.println("ingrese el segundo numero");
            numB = teclado.nextInt();
        }

        //condicion si operacion es igual a 1 ocurrira
        if (operacion == 1) {
            //ocurre suma y guarda el valor de la suma en la variable resultado
            resultado = numA + numB;
        }

        //condicion si operacion es igual a 2 ocurrira
        if (operacion == 2) {
            //ocurre resta y guarda el valor de la suma en la variable resultado
            resultado = numA - numB;
        }

        //condicion si operacion es igual a 3 ocurrira
        if (operacion == 3) {
            //ocurre multiplicacion y guarda el valor de la suma en la variable resultado
            resultado = numA * numB;
        }

        //condicion si operacion es igual a 4 ocurrira
        if (operacion == 4){
            //ocurre division y guarda el valor de la suma en la variable resultado
            resultado = numA / numB;
        }

        //condicion si operacion es igual a 5 ocurrira
        if (operacion == 5) {

            //inicia un contador entero en cero
            int contador = 0;

            //cambia el valor de la variable resultado a uno por cuestion logica
            //para que pueda ocurrir la potencia
            resultado = 1;

            //bucle si contador es menor a numB, en este caso numB seria el exponente y numA la base
            while(contador < numB){

                //en cada vuelta del bucle la variable resultado multiplica su valor con numA
                resultado = resultado * numA;

                //en cada vuelta del bucle la variable contador aumenta su valor en 1 
                //para finalizar el bucle
                contador = contador + 1;
            }
        }

        //muestra un texto con la variable resultado
        System.out.println("El resultado de tu operacion es: "+ resultado);

        //muestra un texto para decidir si seguir haciendo operaciones
        System.out.println("¿Desea realizar otra operacion? 0:NO 1:SI ");

        //llama la accion de scanner y guarda el valor ingresado en la variable
        //pregunta, recorda que si pregunta es 1 se puede hacer una operacion
        pregunta = teclado.nextInt();
        
    }

    //cierra el scanner, no es necesario pero si es buena practica
    teclado.close();

    }
}