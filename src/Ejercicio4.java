/**
* Realizar un programa que permita ingresar un array de 8 elementos, e informe:
* El valor acumulado de todos los elementos del array.
* El valor acumulado de los elementos del array que sean mayores a 36.
* Cantidad de valores mayores a 50.
*
* @author Amparo Izquierdo
* @mail   amizba@gmail.com
* @url    https://empezandojava.blogspot.com/
*
*/
import java.util.Scanner;

public class Ejercicio4 {

    Scanner sc = new Scanner(System.in);

    private int[] arr;

   

    public void cargar() {

        sc=new Scanner(System.in);

        arr=new int[8];

        for(int f=0;f<8;f++) {

            System.out.print("Inserte número:");

            arr[f]=sc.nextInt();

        }

    }

   

    public void acumularElementos() {

        int suma=0;

        for(int f=0;f<8;f++) {

            suma=suma+arr[f];

        }

        System.out.println("La suma de los 8 números es:"+suma);

    }

   

    public void acumularMayores36() {

        int suma=0;

        for(int f=0;f<8;f++) {

            if (arr[f]>36) {

                suma=suma+arr[f];

            }

        }

        System.out.println("La suma de los números mayores a 36 es:"+suma);

    }

   

    public void cantidadMayores50() {

        int cant=0;

        for(int f=0;f<8;f++) {

            if (arr[f]>50) {

                cant++;

            }   

        }

        System.out.println("La cantidad de valores mayores a 50 es:"+cant);

    }

   

    public static void main(String[] ar) {

        Ejercicio4 ej4=new Ejercicio4();

        ej4.cargar();

        ej4.acumularElementos();

        ej4.acumularMayores36();

        ej4.cantidadMayores50();

    }

}
