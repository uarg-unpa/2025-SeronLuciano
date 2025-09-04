
public class Nave {
    //atributos 
    private String nombre;
    private int velocidad;
    private int combustible;
    private String destino;
    private int velocidadMax;
    
// -----CONSTRUCTOR---
    public Nave (String nombre,int combustible, String destino,  int velocidadMax){
        this.nombre = nombre;
        this.velocidad = 0;
        this.combustible = combustible;
        this.destino = destino;
        this.velocidadMax = velocidadMax;
    }
   
// ------METODOS--------

// ----GET----
public int getVelocidad() {
    return velocidad;
}
public String getNombre() {
    return nombre;
}
public int getCombustible() {
    return combustible;
}

public String getDestino() {
    return destino;
}

// ---METODO ACELERAR---
    public void acelerar (int incremento){
        velocidad = velocidad + incremento;

        if (velocidad > velocidadMax){
            velocidad = velocidadMax;
        }

    }
    
// ------METODO LLEGA A DESTINO----
    public boolean llegaDestino(){
        if (combustible < 100){
            return false;
         } else { 
                return true;
            }
        }

//METODO INFORME
public void Informe (){
    System.out.println("------INFORME DE LA MISION------  ");
    System.out.println("DESTINO: "+ destino);
    System.out.println("VELOCIDAD ACTUAL: "+ velocidad +" / "+ "VELOCIDAD MAXIMA: "+velocidadMax);
    System.out.println("COMBUSTIBLE RESTANTE: "+ combustible);
    System.out.println(nombre+" puede llegar a "+ destino + (llegaDestino()?  " SI" : " NO"  ));
}


}
