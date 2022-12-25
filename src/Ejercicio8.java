/**
* Realizar un programa que permita insertar un array de n números, ingresar n por teclado. 
* Luego imprimir la suma de todos los números.
*
* @author Amparo Izquierdo
* @mail   amizba@gmail.com
* @url    https://empezandojava.blogspot.com/
*
*/
import java.util.Scanner;

public class Ejercicio8 {

    Scanner sc = new Scanner(System.in);

    private int[] arr;

   

    public void cargar() {

        System.out.print("¿Cuántos números tiene el array?");

        int n;

        n=sc.nextInt();

        arr=new int[n];       

        for(int f=0;f<arr.length;f++) {

            System.out.print("Inserte número:");

            arr[f]=sc.nextInt();

        }

    }

   

    public void acumularNumeros() {

        int suma=0;

        for(int f=0;f<arr.length;f++) {

            suma=suma+arr[f];

        }

        System.out.println("La suma de los números es:"+suma);

    }

   

    public static void main(String[] ar) {

        Ejercicio8 ej8=new Ejercicio8();

        ej8.cargar();

        ej8.acumularNumeros();

    }

}
