package enuciandos;

public class Vehiculo {

    //atributos 
    private Motor motor;
    private String marca;
    private int modelo;
    
    // CONSTRUCTOR 
    public Vehiculo (Motor motor, String marca, int modelo){
        
        if (marca !=null && !marca.trim().isEmpty()){
            this.marca = marca;
        }
        
        if (modelo > 0){
             this.modelo = modelo;
        }
        
        this.motor = motor;
       
    }
  // get 
  public Motor getMotor (){
    return this.motor;

  }  
  public String getMarca (){
    return this.marca;

  }
  public int getModelo (){
    return this.modelo;

  }

// set
public void setMotor (Motor motor){
    this.motor = motor;

}
public void setMarca (){
    this.marca = marca;

}
public void setModelo (){
    this.modelo = modelo;

}
    
// verificar si es potenete 
public boolean esPotente(){
    if (motor.getCilindrada() > 2000){
        return true;

    }else{
        return false;
    }
}

   
public void actualizarTipo ( String nuevoTipo){

    motor.setTipoMotor(nuevoTipo);
    System.out.println ("el motor actual es: " + nuevoTipo);


}
//consumo 
private double consumoBase = 8.0;

public double calcularaConsumo (){
    double cc = motor.getCilindrada () / 500;
        return consumoBase + cc;    
        
    } 


public String toString (){

    return "[ "+ this.motor+ " ] [ " +this.marca+ " ] [ "+this.modelo+" ]";
    //+ "[" + "es potente?"+ esPotente() +"]"+ "["+"consumo"+calcularaConsumo()+ "L/100km"+"]";

}








}




