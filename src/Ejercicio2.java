/**
* Definir un array de 5 números de tipo float que representen las alturas de 5 personas.
* Obtener el promedio de las mismas. Contar cuántas personas son más altas que el promedio 
* y cuántas más bajas.
*
* @author Amparo Izquierdo
* @mail   amizba@gmail.com
* @url    https://empezandojava.blogspot.com/
*
*/
import java.util.Scanner;

public class Ejercicio2 {

    Scanner sc = new Scanner(System.in);

    private float[] alturas; //definimos como atributo un array

    private float prom;

 

    public void cargar() {

        alturas=new float[5]; //Creación del array

        for(int f=0;f<5;f++) { //Cargamos las alturas

            System.out.print("Inserte altura:");

            alturas[f]=sc.nextFloat();

        }

    }

      

    public void calcularPromedio() {

        float suma;

        suma=0;

        for(int f=0;f<5;f++) {

            suma=suma+alturas[f]; //Realizamos la suma de todas las alturas

        }

        prom=suma/5;

        System.out.println("Promedio de alturas:"+prom);

    }

      

    public void mayoresMenores() {

        int may,men;

        may=0;

        men=0;

        for(int f=0;f<5;f++) {

            if (alturas[f]>prom) {

               may++;

            } else {

                if (alturas[f]<prom) {

                    men++;

                }

        }

    }

    System.out.println("Cantidad de personas mayores al promedio:"+may);

    System.out.println("Cantidad de personas menores al promedio:"+men);

}

      

    public static void main(String[] ar) {

        Ejercicio2 ej2=new Ejercicio2();

        ej2.cargar();

        ej2.calcularPromedio();

        ej2.mayoresMenores();

    }

}
