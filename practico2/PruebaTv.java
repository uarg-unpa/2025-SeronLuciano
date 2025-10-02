package practico2;
public class PruebaTv {
    
    public static void main (String [] args) {
// CANAL
        Televisor tv = new Televisor (25,12,4320,720,80);
        tv.subirCanal();
        System.out.println("canal N°:"+ tv.getCanal());
        tv.bajarCanal();
        System.out.println("Canal N°: "+ tv.getCanal());
        tv.bajarCanal();
        System.out.println("Canal N°: "+ tv.getCanal());
//   VOLUMEN
        tv.subirVolumen();
        System.out.println ("Volumen:"+ tv.getVolumen());
       
// RESOLUCION

            System.out.println ("Resolucion actual "+ tv.getResolucion()+ " pixeles");
            tv.subirResolucion(2);
            System.out.println ("Resolucion: "+ tv.getResolucion()+ " pixeles");
            tv.subirResolucion(2);
            System.out.println ("Resolucion: "+ tv.getResolucion()+ " pixeles");





    }
    
}
