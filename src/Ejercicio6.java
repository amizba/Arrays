/**
* Cargar un array de 10 elementos y verificar posteriormente si el mismo está ordenado de 
* menor a mayor.
*
* @author Amparo Izquierdo
* @mail   amizba@gmail.com
* @url    https://empezandojava.blogspot.com/
*
*/
import java.util.Scanner;

public class Ejercicio6 {

    Scanner sc = new Scanner(System.in);

    private int[] arr;

   

    public void cargar() {

        arr=new int[10];

        for(int f=0;f<10;f++) {

            System.out.print("Inserte número:");

            arr[f]=sc.nextInt();

        }

    }

   

    public void verificarOrdenado() {

        int orden=1;

        for(int f=0;f<9;f++) {

            if (arr[f+1]<arr[f]) {

                orden=0;

            }

        }

        if (orden==1) {

            System.out.println("Esta ordenado de menor a mayor");

        } else {

            System.out.println("No esta ordenado de menor a mayor");

        }

    }

   

    public static void main(String[] ar) {

        Ejercicio6 ej6=new Ejercicio6();

        ej6.cargar();

        ej6.verificarOrdenado();

    }

}
