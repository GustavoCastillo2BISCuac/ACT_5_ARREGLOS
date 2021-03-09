package cod_morse;
import java.util.ArrayList;
import java.util.Collections;
/*** @author GUSTAVO */
public class Cod_Morse {
    public static void main(String[] args)throws Exception{
    ArrayList<String> Lets = new ArrayList<String>();
    // Añadir elementoS al arraylist
    Lets.add("A = .-");
    Lets.add("B = -...");
    Lets.add("C = -.-. ");
    Lets.add("E = . ");
    Lets.add("F = ..-.");
    Lets.add("G = --.");
    Lets.add("H = ....");
    Lets.add("I = ..");
    Lets.add("J = .---");
    Lets.add("K = -.-...-");
    Lets.add("L = .-.. ");
    Lets.add("M = --");
    Lets.add("N = -.");
    Lets.add("O = --- ");
    Lets.add("P = .--.");
    Lets.add("Q = --.-");
    Lets.add("R = .-.");
    Lets.add("S = ...");
    Lets.add("T = -");
    Lets.add("U = ..-");
    Lets.add("W = .-   -");
    Lets.add("X = -..- ");
    Lets.add("Y = -.--");
    Lets.add("Z = --..");
for (int i = 0; i < Lets.size(); i++) {
    System.out.println(Lets.get(i));
}
  }
}