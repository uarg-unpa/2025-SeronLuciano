import java.util.Scanner;

public class TP1.java   
      public static void main (String []args){

            System.out.println("ingrese un numero entero");
            int NRO1 = Scanner.nextInt();
            System.out.println("ingrese un numero entero");
            int NRO2 = Scanner.nextInt();
            System.out.println("ingrese un numero entero");
            int NRO3 = Scanner.nextInt();


            if (NRO1>NRO2 && NRO1> NRO3){
                System.out.println("el mayor: "+ NRO1);
        
            }
            else 
                if (NRO2> NRO1 && NRO2 > NRO3){
                    System.out.println("El mayor es :"+ NRO2);
               }   
               
               else {
                        System.out.println("El mayor es "+ NRO3);
                 }

    
     }

    
   