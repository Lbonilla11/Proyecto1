/*Pide un número por teclado e indica si es un número primo o no. Un número
 *primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es 
 *primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
 *Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que 
 *si es divisible desde ese numero hasta 1
 *NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo.
 */
package numero.primo;

import java.util.Scanner;

/**
 *
 * @author LUIS BONILLA
 */
public class NumeroPrimo {

    public static boolean Primo(int Num){
        boolean Prim=true;
        int divisor=2;
        while((Prim)&&(divisor!=Num)){
            if(Num%divisor == 0){
                Prim=false;
            }else{
                divisor++;
            }
        }
        return Prim;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int Numero = 0;
        boolean Primo;
        System.out.println("introduzca un numero:");
        Numero = sc.nextInt();
        Primo=Primo(Numero);
        if (Primo){
        System.out.println("El numero " +Numero+ "es primo");
        }else{
            System.out.println("El numero " +Numero+ "no es primo");
        }
    }
    
}