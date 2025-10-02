package practico2;
public class Televisor {
    //atributos 
    private int canal;
    private int volumen;
    private int resolucion;
    private int brillo; 
    private int maxResolucion;
    private int minResolucion;


    //constructor
    public Televisor (int canal,int volumen,int maxResolucion,int minResolucion, int brillo) {
        this.canal = canal;
        this.volumen = volumen;
        this.resolucion = 1080;
        this.brillo = brillo;
        this.maxResolucion = maxResolucion;
        this.minResolucion = minResolucion;
    }

    //metodo subir / bajar canal
public void subirCanal (){
    canal = canal +1;
}
public void bajarCanal (){
    canal = canal-1;

}
public int getCanal(){
    return canal;
}
//metodo subir bajar volumen
public void subirVolumen (){
    volumen= volumen +1;
}
public void bajarVolumen (){
    volumen = volumen-1;

}
public int getVolumen(){
    return volumen;
}

//metodo subir bajar resolucion
public void subirResolucion (int aumentar){
    resolucion = resolucion * aumentar;
        if (resolucion > maxResolucion){
            resolucion = maxResolucion;
        }
   
}
public void bajarResolucion (int reducir){
    resolucion = resolucion / 2;
        if (resolucion < minResolucion){
            resolucion = minResolucion;
        
        }
}
public int getResolucion() {
    return resolucion;
}




}
