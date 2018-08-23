/*
 * Pedir números al usuario y cuando el usuario meta un -1 se terminará el 
 * programa. Al terminar, mostrará lo siguiente:
 * – mayor numero introducido
 * – menor numero introducido
 * – suma de todos los numeros
 * – suma de los numeros positivos
 * – suma de los numeros negativos
 * – media de la suma (la primera que pido)
 * El número -1 no contara como número.
 */

import java.util.Scanner;

/**
 *
 * @author LUIS BONILLA
 */

    /**
     * @param args the command line arguments
     * @return 
     */
    public static int main(String[] args) {
    
    Scanner scn=new Scanner (System.in);
    System.out.print("Introduzca numeros: ");
    int N1=scn.nextInt();
    float mayor;
    char opcion = (char) -1;
        String cout;
    
     while (opcion=='S' || opcion=='s'){
    	
     System.out.print("Introduzca numeros: ");
     int N2 = 0;
        if (N1 < N2)
          mayor = N2;
          else
          mayor = N1;
    System.out.print ("\n\n\t\tDesea continuar?: ");
    System.out.print ("      S=Si  /  N=No:  ");
    System.out.print (opcion);
      // Fin del ciclo del comando WHILE
    }
    // Primera salida.
    System.out.print ("\n\n\t\tEL NUMERO MAYO DE TODOS LOS LEIDOS ES: "); float endl;
  
    return 0;
    
}


