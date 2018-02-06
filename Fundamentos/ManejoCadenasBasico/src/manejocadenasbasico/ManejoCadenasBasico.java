/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenasbasico;

/**
 *
 * @author Andres
 */
public class ManejoCadenasBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "Esperanza";
        String apellido = "Gomez";
        
        System.out.println("Concatenacion:" + nombre + apellido);
        System.out.println("Nueva Linea: \n" + nombre + " " + apellido);
        System.out.println("Tabulador: \t" + nombre + " " + apellido);
        System.out.println("Retroceso:_\b" + nombre + " " + apellido);
        System.out.println("Retorno de carro: \r" + nombre + " " + apellido);
        System.out.println("Comilla simple: \'" + nombre + " " + apellido + "\'");
        System.out.println("Comilla doble: \"" + nombre + " " + apellido + "\"");
        
        
    }
    
}
