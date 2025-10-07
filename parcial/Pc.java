

public class Pc {
    // atributos
    private String marca;
    private String procesador;
    private double precio;
    private int ram;

    // constructor 
    public Pc (String marca,String procesador, double precio,int ram){
        if (marca !=null && marca.trim().isEmpty()){
        this.marca = marca;
        }
        if (procesador !=null && procesador.trim().isEmpty()){
        this.procesador = procesador;
        }
        if (precio > 0){
        this.precio = precio;
        }
        if (ram > 0){
        this.ram = ram;
        }


    }
//setters y


public void setMarca (){
    this.marca = marca;

}
public void setProcesador (){
    this.procesador = procesador;

}
public void setPrecio (){
    this.precio = precio;

}
public void setRam (){
    this.ram = ram;

}
//getters 
public String getMarca (){
    return this.marca;

}
public String getProcesador (){
    return this.procesador;

}
public double getPrecio (){
    return this.precio;

}
public int getRam (){
    return this.ram;

}
// actualizar ram
 public void actualizarRam (int nuevaRam){
    
    pc.setRam (nuevaRam);

     System.out.println("la RAM atual es :");
     }
    
 }
 //aplicar descuento 
 public double Descuento (double porcentaje){
    double precioactualizado = this.precio - porcentaje;
    return precioactualizado;
     
 }

//mayor PC 
public boolean mayorRam ( PC p){
    if (this.ram > p.getRam()){
        return true;
    
    }else{
        return false;
    }
}





// mostrar informacion }
public String toString (){
    return "["+marca+"]"+"["+procesador+"]"+"["+ram+"]"+"["+precio+"]";


}
}
