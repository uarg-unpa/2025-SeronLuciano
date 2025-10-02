public class ClaseCola {
    
    private final int maxcola = 5;
    private int frente, ultimo;
    private int cola [];

    // constructor cola 
    public ClaseCola (){
        frente = 0;
        ultimo = 0;
        cola = new  int [maxcola];

    }
//metod siguiente 
private int siguiente ( int subint){
    if (subint == maxcola -1){
        return 0;

    }else {
        return ++ subint;
    }

}

//´metodo estavavia 
public boolean estaVacia (){
    if (frente ==ultimo){
        return true;
    }else {
        return false;
        
    }

}
//metod estalllena
public boolean estaLlena (){
    int sigultimo = siguiente (ultimo);
    return (sigultimo == frente);


}    
//metodo insertar 
public void insertar (int num){
    ultimo = siguiente (ultimo);
    cola [ultimo] = num;



}
//metodo borra 
public int borrar (){
    frente = siguiente (frente);
    return cola [frente];

}




}