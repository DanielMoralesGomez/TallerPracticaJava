package numero.entero;
import java.util.Scanner;

public class NumeroEntero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero,val,mayor,menor;
        double media;
        System.out.println("Cuantos numeros desea ingresar: ");
        numero=sc.nextInt();

        mayor=0;
        menor=1000000000;
        media=0;

        for (int i=1;i<=numero;i++)
        {
            System.out.println("Ingrese cantidad " + i+": ");
            val=sc.nextInt();

            if (val>mayor)
            {
            mayor=val;
            }

            if (val<menor)
            {
            menor=val;
            }
        }

        System.out.println("El numero mayor es: "+mayor+"\n");
        System.out.println("El numero menor es: "+menor+"\n");
    }

} 
