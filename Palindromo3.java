package palindromo3;

import java.util.Scanner;

public class Palindromo3 {

    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i=0, j, pos=0, contador1=0, contador2=0;
    String palabra;
    System.out.println("Introducir una palabra que sea polindroma");
    palabra = sc.nextLine();
    j=(palabra.length()-1);
    while (i<palabra.length() & j>=0)
        if (!Character.isLetter(palabra.charAt(i)))
            i++;
        else
            if (!Character.isLetter(palabra.charAt(j)))
            j--;
            else
                if (palabra.charAt(i) == palabra.charAt(j))
                {
                    contador1++;
                    i++;
                    j--;
                    }
                else{
                    i++;
                    j--;
                    }
        while (pos <= (palabra.length()-1))
            if (Character.isLetter(palabra.charAt(pos)))
            {
                contador2++;
                pos++;
            }
            else
                pos++;
        if (contador1 == contador2)
            System.out.println("La palabra es un palíndromo");
        else
            System.out.println("La palabra no es un palíndromo");
    }
}