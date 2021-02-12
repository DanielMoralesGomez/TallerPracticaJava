package factorial;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Factorial {

public static void main(String[] args) {
    ArrayList<String> numero = new ArrayList<>();
    int entero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero para calcular su factorial"));
    int factorial=1;
    String EjemploEjemplificado = "1";

    for(int i=2; i<=entero; i++)
    {
        factorial = factorial*i;
    }
    for(int i = 1;i<=entero; i++)
    {
       numero.add("" + i);
    }
    for(int i=1; i<entero; i++)
    {
       EjemploEjemplificado+= "x" + numero.get(i);
    }
    JOptionPane.showMessageDialog(null,"El factorial de "+entero+ " = "+EjemploEjemplificado+ " = " +factorial);
 
    }

}
