

public class Televisor {
    //atributos 
    private int canal;
    private int volumen;
    private int resolucion;
    private int brillo; 


    //constructor
    public Televisor (int canal,int volumen,int resolucion,int brillo) {
        this.canal = canal;
        this.volumen = volumen;
        this.resolucion = resolucion;
        this.brillo = brillo;
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


public void subirResolucion (){
    resolucion = resolucion * 2;
   
}
public void bajarResolucion (){
    resolucion = resolucion / 2;

}
public int getResolucion(){
    return resolucion;
}




}
