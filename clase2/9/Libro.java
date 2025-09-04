public class Libro {
//atributos 
private String titulo;
private String autor;
private int añoPublicacion;
private int cantPag;
// constructor 
public Libro (String titulo, String autor,int añoPublicacion,int cantPag) {
    this.titulo=  titulo;
    this.autor = autor ;
    this.añoPublicacion = añoPublicacion;
    this.cantPag = cantPag;
}
// metodos get y set 

public void setTitulo (String titulo){
    this.titulo = titulo;

}
public String getTitulo() {
    return this.titulo;

}

// ---------------------
// metodos / operaciones

public boolean esReciente () {
    if (this.añoPublicacion > 2010){
        return true;
     } else {
        return false;
     } 
 //public boolean esReciente (){
//boolean resultado= false;
// (this.añoPublicacion > 2010){
//return = true;
//} return resultado; }

}



}