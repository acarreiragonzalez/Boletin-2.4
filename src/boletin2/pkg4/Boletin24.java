

package boletin2.pkg4;

import java.util.Scanner;


public class Boletin24 {


    public static void main(String[] args) {
    float numuno, numdos;
    System.out.println("numero 1");
    Scanner dato = new Scanner (System.in);
    numuno=dato.nextFloat();
    System.out.println("numero 2");
    Scanner dato2 = new Scanner (System.in);
    numdos=dato.nextFloat();
    
        float suma, resta, multiplicacion, division;
        suma= numuno + numdos;
        resta=numuno - numdos;
        multiplicacion= numuno * numdos;
        division= numuno/numdos;
       System.out.println("a suma dos dous numeros é" + suma +"a resta" + resta +"a multiplicacion" + multiplicacion + "e a division" + division ) ;
          
    }
    
}
