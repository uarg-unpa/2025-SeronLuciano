public class PilaReales {
    private double [] elementos; // Array para almacenar los elementos
    private int cima;       
    private final int MAX = 10; // Capacidad máxima de la pila

    // Constructor: inicializa el array y la cima
    public PilaReales() {
        elementos = new double [MAX]; // Crear el array
        // Completar: inicializar cima
        cima = -1;
    }

    // Verifica si la pila está vacía
    public boolean estaVacia() {// Completar: devolver true si cima indica que la pila está vac
         
        if ( cima == -1 ){
            return true;
        }else 
             return false;
    }

    
        

    // Verifica si la pila está llena
    public boolean estaLlena() {
        // Completar: devolver true si cima está en el límite del array
        if (cima >= MAX){
            return true;
        }else {
        return false;
        }
    }

    // Agrega un elemento en la cima (push)
    public void meter(double elem) {
              // Completar: incrementar cima y asignar el elemento
              cima++;
              elementos [cima]= elem;

        
    }

    // Saca y devuelve el elemento de la cima (pop)
    private double aux;
    public double sacar() {
                  // Completar: guardar el elemento de la cima, decrementar cima y devolverlo
                  aux = elementos [cima];
                  cima --;
                  return aux;
        
         }
}