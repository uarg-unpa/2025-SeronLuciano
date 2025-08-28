import java.util.Scanner;
public class Ejercicio {
    public static void main (String[] args) {
        char dia;
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("ingrese la letra correspondiente a un dia de la semana");
        dia = scanner.next().charAt(0);
        
        if (dia == 'M'|| dia == 'I'|| dia == 'J'){
            System.out.println("HOY TENGO PROGRAMACION DE ALGORITMOS");

        }else  if (dia == 'L'|| dia == 'V'|| dia == 'S'|| dia == 'D'){
            System.out.println("HOY NO TENGO PROGRAMACION DE ALGORITMOS");

        } else {
            System.out.println("ERROR :elige otra letra");
        }
        
        scanner.close();
    
    
    }
}



