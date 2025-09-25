package estacionDeServicio;

public class Estacion {
    private int litros;
    private int cargar;
    private int reponer;
    

    // constructor 
    public Estacion (int litros int cargar, int reponer){
        this.litros = litros;
        this.cargar = cargar;
        this.reponer = reponer;

    }

public void setLitros (){
    this.litros = litros;
}
public void setCargar (){
    this.cargar = cargar;

}
public void setReponer (){
    this.reponer = reponer ;

}

//GET----------------------
public int getLitros (){
    return litros;
}
public int getCargar (){
    return cargar;

}
public int getReponer (){
    return reponer;
}

//metodo cpacidad max


public int Maximo (){
    private int capacidadMax = 10000;  
    if (this.litros > capacidadMax) {
    this.litros = capacidadMax;
    } 

public String Minimo (){
    private int capacidadMin = 10;
    if (this.litros < capacidadMin){
        

    }
}





}























}

