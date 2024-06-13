import java.util.Scanner;
public class App {

    //carga 15 numeros en un vector y una vez cargados se 
    //necesita saber cuantas veces se ingreso el numero 3

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int array[]=new int[15], contadorNum3=0;
        for (int i = 0; i < 15; i++) {
            array[i]=teclado.nextInt();
            if (array[i]==3) {
                contadorNum3+=1;
            }

        }        
        teclado.close();
        System.out.println("se ingreso "+contadorNum3+" veces el numero 3");
    }
}
