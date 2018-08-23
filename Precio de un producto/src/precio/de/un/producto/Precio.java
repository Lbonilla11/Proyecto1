/*Lee un número por teclado que pida el precio de un producto (puede tener 
 *decimales) y calcule el precio final con IVA. El IVA sera una constante que
 *sera del 21%.
 */
package precio.de.un.producto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LUIS BONILLA
 */
public class Precio {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        double precio, iva, total;
        InputStreamReader input = new InputStreamReader (System.in);
        BufferedReader teclado =new BufferedReader(input);
        System.out.println("Introduzca el precio del producto");
        precio=Double.valueOf(teclado.readLine());
        iva=precio*0.21;
        total = precio + iva;
        System.out.println("iva " +iva);
        System.out.println("total" +total);
    
    }
}
