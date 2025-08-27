import java.util.Scanner;
   
public class Practico.java  
    public static void main (String[] args) {


    Scanner scanner = new Scanner(System.in);
        int NRO1;
        int NRO2;
        int NRO3;
            System.out.print("ingrese un numero entero");
            NRO1 = scanner.nextInt();
            System.out.print("ingrese un numero entero");
            NRO2 = scanner.nextInt();
            System.out.print("ingrese un numero entero");
            NRO3 = scanner.nextInt();

            scanner.nextLine();

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

    
