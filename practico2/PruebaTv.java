public class PruebaTv {
    
    public static void main (String [] args) {

        Televisor tv = new Televisor (25,12,1080,80);
        tv.subirCanal();
        System.out.println("canal N°:"+ tv.getCanal());
        tv.bajarCanal();
        System.out.println("Canal N°: "+ tv.getCanal());
        tv.bajarCanal();
        System.out.println("Canal N°: "+ tv.getCanal());

        tv.subirVolumen();
        System.out.println ("Volumen:"+ tv.getVolumen());
       tv.subirResolucion();
        System.out.println("Resolucion:" + tv.getResolucion());
      





    }
    
}
