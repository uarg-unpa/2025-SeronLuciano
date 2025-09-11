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

    if (mes < 12 && mes > 0 ) {
        return true; 
        
    } else {
        return false;
    }


    if (año > 0){
        return true;
    }else {
        return false;
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

public String Meses (){
    switch (mes){

        case 1 ->  "Enero";
        break;
        case 2 -> "Febrero";
        break;
        case 3 -> "Marzo";
        break;
        case 4 -> "Abril";
        break;
        case 5 -> "Mayo";
        break;
        case 6 -> "Junio";
        break;
        case 7 -> "Julio";
        break;
        case 8 -> "Agosto";
        break;
        case 9 -> "Septiembre";
        break;
        case 10 -> "Octubre";
        break;
        case 11 -> "Noviembre";
        break;
        case 12 -> "Diciembre";
        break;
        default -> "Mes incorrecto";
        break;


    }
public String mostrarFecha() {
    System.out.println(dia + " de "+ Meses () + " del " + año );


}

}
















}