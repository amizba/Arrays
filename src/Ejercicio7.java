/**
* Se desea almacenar una serie de n�meros enteros. Cuando se ejecuta el programa se debe pedir 
* la cantidad n�meros enteros. Luego crear un array con dicho tama�o.
*
* @author Amparo Izquierdo
* @mail   amizba@gmail.com
* @url    https://empezandojava.blogspot.com/
*
*/
import java.util.Scanner;

public class Ejercicio7 {

    Scanner sc = new Scanner(System.in);

    private int[] numeros;

      

    public void cargar()

    {

        System.out.print("�Cu�ntos n�meros insertar�s?");

        int cant;

        cant=sc.nextInt();

        numeros=new int[cant];

        for(int f=0;f<numeros.length;f++) {

            System.out.print("Inserta n�mero:");

            numeros[f]=sc.nextInt();

        }   

    }

      

    public void imprimir() {

        for(int f=0;f<numeros.length;f++) {

            System.out.println(numeros[f]);

        }

    }

      

    public static void main(String[] ar) {

        Ejercicio7 ej7=new Ejercicio7();

        ej7.cargar();

        ej7.imprimir();

    }

}
