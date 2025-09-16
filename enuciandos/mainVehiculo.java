package enuciandos;

import java.util.Scanner;

public class mainVehiculo {
    public static void main (String [] args){

Scanner scanner  = new Scanner (System.in);


Motor motor1 = new Motor (3000, "nafta");
Vehiculo auto1 = new Vehiculo(motor1, "ford", 150 );




System.out.println(" ingresa la marca del auto");
String marca = scanner.nextLine();
System.out.println("ingresa el modelo del auto");
int modelo = scanner.nextInt();
System.out.println("ingrese la cilindrada");
double cilindrada = scanner.nextDouble();
scanner.nextLine();
System.out.println("ingrese el tipo de motor");
String tipoMotor = scanner.nextLine();

scanner.nextLine();


Motor motor2 = new Motor (cilindrada,tipoMotor);
Vehiculo auto2 = new Vehiculo (motor2,marca,modelo);
// mostrar peugo

 System.out.println(" VEHICULO 1 ");
 System.out.println( auto1.toString());
 System.out.println("VEHICULO 2");
 System.out.println(auto2.toString());





//actuaizar tipo
System.out.println("ingresar nuevo tipo motor");
String nuevoTipo = scanner.nextLine();
auto2.actualizarTipo(nuevoTipo);





scanner.close();
    }
    
}
