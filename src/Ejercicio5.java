/**
* Realizar un programa que pida la carga de dos arrays numéricos enteros de 4 elementos. 
* Obtener la suma de los dos arrays, dicho resultado guardarlo en un tercer array del mismo tamaño. 
* Sumar número a número.
*
* @author Amparo Izquierdo
* @mail   amizba@gmail.com
* @url    https://empezandojava.blogspot.com/
*
*/
import java.util.Scanner;

public class Ejercicio5 {

    Scanner sc = new Scanner (System.in);

    private int[] arr1;

    private int[] arr2;

    private int[] arrSuma;

   

    public void cargar() {

        arr1=new int[4];

        arr2=new int[4];

        System.out.println("Carga del primer array.");

        for(int f=0;f<4;f++) {

            System.out.print("Inserte número:");

            arr1[f]=sc.nextInt();

        }

        System.out.println("Carga del segundo array.");

        for(int f=0;f<4;f++) {

            System.out.print("Inserte número:");

            arr2[f]=sc.nextInt();

        }       

    }   

   

    public void sumaArrays() {

       arrSuma=new int[4];

        for(int f=0;f<4;f++) {

            arrSuma[f]=arr1[f]+arr2[f];

        }

        System.out.println("Resultado del array.");

        for(int f=0;f<4;f++) {

            System.out.println(arrSuma[f]);

        }

    }

   

    public static void main(String[] ar) {

        Ejercicio5 ej5=new Ejercicio5();

        ej5.cargar();

        ej5.sumaArrays();

    }   

}
