package funciones2;

import javax.swing.JOptionPane;
public class Funciones2 {


    public static void main(String[] args) {
        int resultado=0;

        int A = Integer.parseInt(JOptionPane.showInputDialog("Digite el primero numero"));
        int B = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));

        while((B!=0) && (A!=0))
        {
            resultado = resultado + A;
            B--;
        }
           JOptionPane.showMessageDialog(null,"El resultado de los dos numeros es: " +resultado); 
    }

}
