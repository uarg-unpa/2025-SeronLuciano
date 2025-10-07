public class Fecha {

// ATRIBUTOS
private int dia;
private int mes;
private int año;

// VALIDAR fecha
//constructor 
public Fecha (int dia,int mes, int año){
    if (validarFecha (dia,mes,año)){
        this.dia = dia;
        this.mes = mes;
        this.año = año;

    }else {
    this.dia = 1;
    this.mes = 1;
    this.año = 2013;
    }
}
// metodo validar fecha 

private boolean validarFecha (int dia,int mes, int año){
    if (dia <= 31 && dia > 0 ){
        return true;

    }else {
        return false;
    }

       else  {
            if (mes < 12 && mes > 0 ) {
                 return true; 
        
         } else {
            return false;
         
         }     
        }    else  {}
              if (año > 0){
                     return true;
                }else {
                        return false;
                }
            }          
}

//------------------set
public void setDia () {
    if (validarFecha(dia, this.mes, this.año)){
        this.dia = dia;
    }

    
}
public void setMes () {
    if (validarFecha(this.dia, mes,this.año)){
        this.mes= mes;
    }
    
}
public void setAño () {
    if (validarFecha(this.dia, this.mes, año))
        this.año = año;
    
}

//---------get 
public int getDia(){
    return dia;
}
public int getMes (){
    return mes;
}
public int getAño (){
    return año;
}


// metodo para saber nombres de meses



    
public String mostrarFecha() {
    System.out.println(dia + " de "+ Meses () + " del " + año );


}

}
















}