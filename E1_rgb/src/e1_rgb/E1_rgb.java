package e1_rgb;
import java.util.ArrayList;
public class E1_rgb {
    public static ArrayList<Integer> alColores(ArrayList<Integer> aLista){
            aLista.set(0, Math.abs(aLista.get(0)-255));
            aLista.set(1, Math.abs(aLista.get(1)-255));
            aLista.set(2, Math.abs(aLista.get(2)-255)); 
            return aLista; 
        }
    public static void main(String[] args) {
       ArrayList<Integer> alColorAct    = new ArrayList<Integer>();
       ArrayList<Integer> alColorContraste = new ArrayList<Integer>();
       alColorAct.add(30); alColorAct.add(34); alColorAct.add(140);
       System.out.println(alColorAct);    
       alColorContraste = alColores(alColorAct);
       System.out.println(alColorContraste);
    }
}