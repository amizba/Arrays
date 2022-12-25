/**
* Almacenar 5 números enteros en un array.
*
* @author Amparo Izquierdo
* @mail   amizba@gmail.com
* @url    https://empezandojava.blogspot.com/
*
*/
import java.util.Scanner;

public class Ejercicio1 {

      

       Scanner sc = new Scanner(System.in);

    private int[] numeros; //declaramos el array

      

    public void cargar()

    {

       

        numeros=new int[5]; //Creamos el array

        for(int f=0;f<5;f++) { //Cargamos los números

            System.out.print("Inserte un número:");

            numeros[f]=sc.nextInt();//Se va rellenando el array

        }   

    }

      

    public void imprimir() {

        for(int f=0;f<5;f++) {

            System.out.print(numeros[f]+" - ");

        }

    }

      

    public static void main(String[] ar) {

        Ejercicio1 ej=new Ejercicio1();

        ej.cargar();

        ej.imprimir();

    }

}
