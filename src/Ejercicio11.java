/**
* Crear un array que almacene 10 países y ordenarlos de forma alfabética. 
*
* @author Amparo Izquierdo
* @mail   amizba@gmail.com
* @url    https://empezandojava.blogspot.com/
*
*/
import java.util.Scanner;

public class Ejercicio11 {

   

       Scanner sc=new Scanner(System.in);

    private String[] paises;

      

    public void cargar() {

        paises=new String[10];

        for(int f=0;f<paises.length;f++) {

            System.out.print("Inserta país:");

            paises[f]=sc.next();

        }

    }

 

    public void ordenar() {

        for(int k=0;k<9;k++) {

            for(int f=0;f<9-k;f++) {

                if (paises[f].compareTo(paises[f+1])>0) {

                    String aux;

                    aux=paises[f];

                    paises[f]=paises[f+1];

                    paises[f+1]=aux;

                }

            }

        }

    }

      

    public void imprimir() {

       System.out.println("Paises ordenados alfabéticamente:");

        for(int f=0;f<paises.length;f++) {

            System.out.println(paises[f]);

        }

    }

 

    public static void main(String[] ar) {

        Ejercicio11 ej11=new Ejercicio11();

        ej11.cargar();

        ej11.ordenar();

        ej11.imprimir();

    }

}
