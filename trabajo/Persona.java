
public class  Persona {
//atributos
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;

// constructor 
public Persona(String nombre, String apellido, int edad, int dni ) {
    //metodos            atributos
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.dni = dni;

}
//METODOS get y set
public String  getNombre (){
    return this.nombre;

}
public void setNombre (String nombre){
    this.nombre = nombre;

}

//----------
public boolean mayorDeEdad (){
    if (edad >= 18)
        return true;
    else 
        return false;

}
}
