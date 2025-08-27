import java.util.Scanner;
public class Ejercicio.java 
    public static void main (String[] args) {
        char Dia;
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("ingrese la letra correspondiente a un dia de la semana");
        char Dia = scanner.next();
        
        if (Dia == 'M'|| Dia == 'I'|| Dia == 'J'){
            System.out.println("HOY TENGO PROGRAMACION DE ALGORITMOS");

        }else  if (Dia == 'L'|| Dia == 'V'|| Dia == 'S'|| Dia == 'D'){
            System.out.println("HOY NO TENGO PROGRAMACION DE ALGORITMOS");

        } else {
            System.out.println("ERROR :elige otra letra");
        }
        
        scanner.close();
    
    
    }




