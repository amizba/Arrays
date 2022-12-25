/**
* Una empresa tiene dos turnos (mañana y tarde) en los que trabajan 8 empleados (4 por la mañana y 4 por la tarde)
* Realizar un programa que permita almacenar los sueldos de los empleados agrupados por turno. 
* Imprimir los gastos en sueldos de cada turno.
*
* @author Amparo Izquierdo
* @mail   amizba@gmail.com
* @url    https://empezandojava.blogspot.com/
*
*/
import java.util.Scanner;

public class Ejercicio3 {

    Scanner sc = new Scanner(System.in);

    private float[] turnoMan;

    private float[] turnoTar;

      

    public void cargar() {

        turnoMan=new float[4];

        turnoTar=new float[4];

        System.out.println("Sueldos de empleados del turno de la mañana.");

        for(int f=0;f<4;f++) {

            System.out.print("Ingrese sueldo:");

            turnoMan[f]=sc.nextFloat();

        }

        System.out.println("Sueldos de empleados del turno de la tarde.");

        for(int f=0;f<4;f++) {

            System.out.print("Ingrese sueldo:");

            turnoTar[f]=sc.nextFloat();

        }

    }

      

    public void calcularGastos() {

        float man=0;

        float tar=0;

        for(int f=0;f<4;f++){

            man=man+turnoMan[f];

            tar=tar+turnoTar[f];

        }

        System.out.println("Total de gastos del turno de la mañana:"+man);

        System.out.println("Total de gastos del turno de la tarde:"+tar);

    }

      

    public static void main(String[] ar){

        Ejercicio3 ej3=new Ejercicio3();

        ej3.cargar();

        ej3.calcularGastos();

    }

}
