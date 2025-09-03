
public class Nave {
    //atributos 
    private String nombre;
    private int velocidad;
    private int combustible;
    private String destino;
    private int velocidadMax;
    private int restanteCombustible;

    // costructor 
    public Nave (String nombre, int velocidad,int combustible, String destino){
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.combustible = combustible;
        this.destino = destino;
       
    }
    // metodos 
    // subir y bajar velocidad
    
    public void acelerar (){
      
                velocidad = velocidad + 20;
            }
 

        }
    }
    public void bajarVelocidad (){
            velocidad = velocidad- 20;
        }
    }
    public int getVelocidad(){
        return velocidad;
    }
}
