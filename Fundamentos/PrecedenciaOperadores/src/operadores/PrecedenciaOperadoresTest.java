/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

/**
 *
 * @author Andres
 */
public class PrecedenciaOperadoresTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Primer Ejemplo Procedencia Operadores");
        int x = 5;
        int y = 10;
        int z = ++x * y--;
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        System.out.println("Ejemplo Evaluacion");
        System.out.println(4 + 5 * 6 / 3);
        System.out.println((4 + 5) * (6 / 3));
        
        System.out.println("Otro Ejemplo Evaluacion");
        System.out.println(1 + 2 - 3 * 4 / 5);
        System.out.println(1 + 2 - (3 * (4 / 5)));
        
        System.out.println("\nOtro Ejemplo");
        //Si se detecta una cadena lo demas lo convierte en cadena
        System.out.println("1 + 2 = " + 1 + 2);
        //Los parentesis rompen esta regla, ya que tiene mayor prioridad
        System.out.println("(1 + 2) = " + (1 + 2));
        
        System.out.println("\nOtro Ejemplo");
        //El operador + es asociativo a la izquierda
        System.out.println(1 + 2 + "abc");//Detecta una operacion primero
        System.out.println("abc" + 1 + 2);//Detecta ima cadena primero 
    }
    
}
