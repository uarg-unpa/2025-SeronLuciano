

public class PruebaNave {
    public static void main(String[] args) {
        
        Nave nave1 = new Nave ("Eli",122,"EL SOL",50000);
    //ACELERAR

        nave1.acelerar(10000);
        System.out.println ("Velocidad actual: "+ nave1.getVelocidad() +" km/h");
        System.out.println();
        System.out.println ("------ACELERAR------");
        System.out.println ("ACELERANDO 1°: "+ nave1.getVelocidad()+" km/h");
        nave1.acelerar(20000);
        System.out.println ("ACELERANDO 2°: "+ nave1.getVelocidad()+" km/h");
        nave1.acelerar(4000);
        System.out.println ("ACELERANDO 3°: "+ nave1.getVelocidad()+" km/h");
        

        
   // VERIFICAR SI LLEGA A DESTINO
    System.out.println();
    System.out.println (nave1.getNombre()+" puede llegar a "+ nave1.getDestino()+": "+nave1.llegaDestino());

   
   // INFORME 
   System.out.println();
   nave1.Informe();

   
   
   
   
    }
}
