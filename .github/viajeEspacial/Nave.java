package viajeEspacial;

public class Nave {
    //atributos 
    private String nombre;
    private int velocidad;
    private int combustible;
    private String destino;
   

    // costructor 
    public Nave (String nombre, int velocidad,int combustible, String destino){
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.combustible = combustible;
        this.destino = destino;
    
    }
    // metodos 
    // subir y bajar velocidad
    int velocidadMax = 100;
    int velocidadMin = 0;
        public void subirVelocidad (){
        if (velocidad < velocidadMax){
            velocidad = velocidad + 20;
        }
    }
    public void bajarVelocidad (){
        
        if (velocidad > velocidadMin){
            velocidad = velocidad- 20;
        
        }
    }
    public int getVelocidad(){
        return velocidad;
    }
}
