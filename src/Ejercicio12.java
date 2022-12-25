/**
* Generar números aleatorios en un array. 
*
* @author Amparo Izquierdo
* @mail   amizba@gmail.com
* @url    https://empezandojava.blogspot.com/
*
*/
public class Ejercicio12 {

 

       public static void main(String[] args) {

            

             int numAleat[]=new int[10];

            

             for(int i=0; i<numAleat.length; i++) {

                   

                    //Generar números aleatorios

                    numAleat[i]=(int)(Math.random()*100);

                   

                    //Imprimir los elementos

                    System.out.println(""+(i+1)+"\t-->\t"+numAleat[i]);

             }

             System.out.println();

 

       }}
