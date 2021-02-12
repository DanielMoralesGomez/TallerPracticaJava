package numeropotencia;

import javax.swing.JOptionPane;
public class numeropotencia1 {


    public static void main(String[] args) {

        int N = Integer.parseInt(JOptionPane.showInputDialog("Digite el primero numero"));
        int M = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de la potencia"));
        int contadornum = N, resultado=0;
        
        for(int i= 1; i<=M; i++){
            int acumulador=0;
            for(int j = 1; j<=contadornum; j++)
            {
                acumulador = acumulador + N;
            }
            resultado = N;
            N = acumulador;

        }
        JOptionPane.showMessageDialog(null,"La solucion de la potencia es: " + resultado);

    }

}
