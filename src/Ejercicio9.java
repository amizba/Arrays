/**
* Realizar un programa que permita cargar 5 nombres de personas y sus edades respectivas por 
* teclado y después imprimir los nombres de las personas mayores de edad (mayores o iguales a 
* 18 años).
*
* @author Amparo Izquierdo
* @mail   amizba@gmail.com
* @url    https://empezandojava.blogspot.com/
*
*/
import java.util.Scanner;

public class Ejercicio9 {

    Scanner sc = new Scanner(System.in);

    private String[] nombres;

    private int[] edades;

   

    public void cargar() {

        nombres=new String[5];

        edades=new int[5];

        for(int f=0;f<nombres.length;f++) {

            System.out.print("Inserte nombre:");

            nombres[f]=sc.next();

            System.out.print("Inserte edad:");

            edades[f]=sc.nextInt();           

        }

    }   

   

    public void mayorEdad() {

        System.out.println("Personas mayores de edad.");

       for(int f=0;f<nombres.length;f++) {

            if (edades[f]>=18) {

                System.out.println(nombres[f]);

            }

       }   

    }

   

    public static void main(String[] ar) {

        Ejercicio9 ej9=new Ejercicio9();

        ej9.cargar();

        ej9.mayorEdad();

    }   

}
