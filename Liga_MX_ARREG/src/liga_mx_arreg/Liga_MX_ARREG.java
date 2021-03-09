package liga_mx_arreg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/*** @author GUSTAVO */
public class Liga_MX_ARREG {
    public static void main(String[] args) {
     ArrayList<String> nombreArrayList = new ArrayList<String>();
    Scanner entrada = new Scanner(System.in);
    for (int i=1; i<=9; i++){
        System.out.print( "ingrese el numero del equipo");
            int numero = entrada.nextInt();
            nombreArrayList.add("Equipo"+numero); 
             System.out.print( "ingrese goles a favor");
             int GF = entrada.nextInt();
            nombreArrayList.add("Goles a favor"+GF); 
             System.out.print( "ingrese goles en contra");
             int GC = entrada.nextInt();
            nombreArrayList.add("Goles a favor"+GC);
             if ( GF > GC) {
              int pp =  GF-GC;
nombreArrayList.add("GANADOR POR"+pp+"GOLES");
            
        } else  {
    int pd =  GC-GF;
        nombreArrayList.add("PERDEDOR POR"+pd+"GOLES");
      }
    }
Iterator<String> nombreIterator = nombreArrayList.iterator();
while(nombreIterator.hasNext()){
	String Equipo = nombreIterator.next();
	System.out.print(Equipo+" // ");    
}
ArrayList<String> nombrArrayList = new ArrayList<String>();
System.out.print( "SEMI DE FINAL");
for (int i=1; i<=5; i++){
    System.out.print( "ingrese el numero del equipo");
        int numero = entrada.nextInt();
	nombrArrayList.add("Equipo"+numero); 
         System.out.print( "ingrese goles a favor");
         int GF = entrada.nextInt();
	nombrArrayList.add("Goles a favor"+GF); 
         System.out.print( "ingrese goles en contra");
         int GC = entrada.nextInt();
	nombrArrayList.add("Goles a favor"+GC);
         if ( GF > GC) {
          int pp =  GF-GC;
nombrArrayList.add("GANADOR POR"+pp+"GOLES");
        } else  {
int pd =  GC-GF;
           nombrArrayList.add("PERDEDOR POR"+pd+"GOLES");
        }
}

Iterator<String> nombrIterator = nombrArrayList.iterator();
while(nombrIterator.hasNext()){
	String Equipo = nombrIterator.next();
	System.out.print(Equipo+" // ");
    }
ArrayList<String> nombArrayList = new ArrayList<String>();
System.out.print( "FINAL");
for (int i=1; i<=5; i++){
    System.out.print( "ingrese el numero del equipo");
        int numero = entrada.nextInt();
	nombArrayList.add("Equipo"+numero); 
         System.out.print( "ingrese goles a favor");
         int GF = entrada.nextInt();
	nombArrayList.add("Goles a favor"+GF); 
         System.out.print( "ingrese goles en contra");
         int GC = entrada.nextInt();
	nombArrayList.add("Goles a favor"+GC);
         if ( GF > GC) {
          int pp =  GF-GC;
nombArrayList.add("GANADOR POR"+pp+"GOLES");
        } else  {
int pd =  GC-GF;
           nombArrayList.add("PERDEDOR POR"+pd+"GOLES");
        }
}
Iterator<String> nombIterator = nombArrayList.iterator();
while(nombrIterator.hasNext()){
	String Equipo = nombIterator.next();
	System.out.print(Equipo+" // ");
    }
    }
}