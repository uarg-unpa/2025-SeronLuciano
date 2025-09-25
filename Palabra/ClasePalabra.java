package Palabra;

public class ClasePalabra {

    // atributos+
    private final int MAX = 100;
    private char [] palabra;
    private int cima;
    //costructor 
    public void clasePalabra (int cima) {
        this.palabra = new char [MAX];
        this.cima ++;

    }
    //metdos  sacar meter estallena esta vacia 
    public boolean estaVacia (){
        if (cima == -1){
            return true;

        }else {
            return false;
        }
    }
    public boolean estaLlena (){
        if (cima >=MAX){
            return true;
            
        }else{
            return false;
        }
}    

public void meter (char letra){
    cima++;
    palabra [cima]= letra;

}
public char sacar (){
    char aux = palabra [cima];
    cima --;
    return aux;
}

    


















}