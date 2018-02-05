/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejovariables;

/**
 *
 * @author Andres
 */
public class ManejoVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Variables Boleanas
        boolean bool1;
        bool1 = true;
        boolean bool2 = false;
        
        System.out.println("Valor bool1:" + bool1);
        System.out.println("Valor bool2:" + bool2);
        System.out.println(" ");
        
        //Variables byte
        byte b1 = 10;
        //Declaracion en Hexadecimal
        byte b2 = 0xa;
        
        System.out.println("Valor b1:" + b1);
        System.out.println("Valor b2:" + b2);
        System.out.println(" ");
        
        //Variables Short
        short s1 = 2;
        System.out.println("Valor s1:" + s1);
        System.out.println(" ");
        
        //Variables Char
        //La primera declaracion es en UNICODE
        char ch1 = 65, ch2 ='A';
        System.out.println("Valor ch1:" + ch1);
        System.out.println("Valor ch2:" + ch2);
        System.out.println(" ");
        
        //Variables Enteras
        int decimal = 100;
        int octal = 0144; //Valor octal inicia con 0
        int hexa = 0x64; //Valor hexa inicia con 0x
        System.out.println("Valor decimal:" + decimal);
        System.out.println("Valor octal:" + octal);
        System.out.println("Valor hexa:" + hexa);
        System.out.println(" ");
        
        //Variables long
        long long1 = 10, long2 = 20L;
        System.out.println("Valor long1:" + long1);
        System.out.println("Valor long2:" + long2);
        System.out.println();
        
        //Variables Float
        float f1 = 15, f2 = 22.3F;
        System.out.println("Valor f1:" + f1);
        System.out.println("Valor f2:" + f2);
        System.out.println();
        
        //Variables double
        double d1 = 11.0, d2 = 30.15D;
        System.out.println("Valor d1:" + d1);
        System.out.println("Valor d2:" + d2);
        
        
        
    }
    
}
