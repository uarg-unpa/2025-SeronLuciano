public class TestPersona {
    public static void main (String [] args){
   //DECLARACION DE OBJETOS 
    
    Persona persona1;
    Persona persona2;

    persona1 = new Persona("Luciano","Seron",21,45537267);
    persona2 = new Persona ("Lautaro","Alvarado",22,45537266);
    //Invocando un metodo 
    System.out.println (persona1.mayorDeEdad());

    }
}