/**
* Realizar un programa que permita cargar los nombres de 5 personas y sus edades respectivas. 
* Mostrar el sueldo mayor y el nombre del operario.
*
* @author Amparo Izquierdo
* @mail   amizba@gmail.com
* @url    https://empezandojava.blogspot.com/
*
*/
import java.util.Scanner;

public class Ejercicio10 {

    Scanner sc = new Scanner(System.in);

    private String[] nombres;

    private int[] edades;

 

    public void cargar() {

        nombres=new String[5];

        edades=new int[5];

        for(int f=0;f<nombres.length;f++) {

            System.out.print("Inserta el nombre:");

            nombres[f]=sc.next();

            System.out.print("Inserta la edad:");

            edades[f]=sc.nextInt();

        }

    }

   

    public void mayorEdad() {

        int mayor;

        int pos;

        mayor=edades[0];

        pos=0;

        for(int f=1;f<nombres.length;f++) {

            if (edades[f]>mayor) {

                mayor=edades[f];

                pos=f;

            }

        }

        System.out.println("La persona de más mayor es: "+nombres[pos]+" tiene "+mayor+" años.");

       

    }

   

    public static void main(String[] ar) {

        Ejercicio10 ej10=new Ejercicio10();

        ej10.cargar();

        ej10.mayorEdad();

    }

}
