import java.util.Scanner;

public class mainPc {
    public static void main ( String []args ){

    Scanner scanner = new Scanner (System.in); 
    //DATOS INGRESADOS POR EL USUARIO
    System.out.println("COMPUTADORA 1");
    System.out.println("ingresa la marca");
    String marca1 = scanner.nextLine();
    System.out.println("ingresa el procesador");
    String procesador1 = scanner.nextLine();
    System.out.println("ingresa el precio de la PC1");
    double precio1 = scanner.nextDouble ();
    scanner.nextLine();
    System.out.println("ingresa la cantidad de memoria RAM");
    int ram1 = scanner.nextInt();
    scanner.nextLine();


    Pc pc1 = new Pc (marca1,procesador1,precio1,ram1);

    System.out.println("COMPUTADORA 2");
    System.out.println("ingresa la marca");
    String marca2 = scanner.nextLine();
    System.out.println("ingresa el procesador");
    String procesador2 = scanner.nextLine();
    System.out.println("ingresa el precio de la PC2");
    double precio2 = scanner.nextDouble ();
    scanner.nextLine();
    System.out.println("ingresa la cantidad de memoria RAM");
    int ram2 = scanner.nextInt();
    scanner.nextLine();




    Pc pc2 = new Pc (marca2,procesador2,precio2,ram2);

    // aplicar descuento 
    System.out.println("ingresa el descuento a aplicar:");
    double porcentaje = scanner.nextDouble();
    pc1.Descuento (porcentaje);
    System.out.println("el precio con el descuento aplicado es de :"+ porcentaje);



    scanner.nextLine();

    //ac5tualizar ram

    pc2.actualizarRam(5);

    scanner.nextLine();
    // mostrar que pc tuiene mayor ram

    pc1.mayorRam (pc2.getRam());



        }
            
            }
            