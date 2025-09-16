package enuciandos;

public class Motor {
    //atributos 

    private double cilindrada;
    private String tipoMotor;


    //

    public Motor (double cilindrada, String tipoMotor){
        if (cilindrada > 0 ){
            this.cilindrada = cilindrada;

        }
        this.tipoMotor = tipoMotor;
       

    }
// get 
    public double getCilindrada (){
        return this.cilindrada;
    }
    public String getTipoMotor (){
        return this.tipoMotor;


    }

//set
public void setCilindrada(){
    this.cilindrada = cilindrada;

}
public void setTipoMotor (String tipoMotor){


    this.tipoMotor = tipoMotor;
}
 public String toString (){
    return "cilindrada " + cilindrada + " "+ "tipo de motor " + tipoMotor ;
 }







}
