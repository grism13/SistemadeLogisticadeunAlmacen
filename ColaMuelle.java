public class ColaMuelle {
    NodoCamion frente;
    NodoCamion fin;

    public ColaMuelle(){
        this.frente = null;
        this.fin = null;
    }

    public boolean estaVacia (){
        return frente == null ;
    }

    public void registrarCamion( String placa, String nombreChofer){
        NodoCamion nuevoCamion = new NodoCamion (placa, nombreChofer);

        if(estaVacia()){
            frente = nuevoCamion;
            fin = nuevoCamion;
        }
        else {
            fin.siguiente = nuevoCamion;
            fin = nuevoCamion;
        }
        System.out.println(" Camion con placa" + placa + " (Chofer: " + nombreChofer + ") reguistro en la fila. ");
    }
     public NodoCamion atenderCamion(){
        if(estaVacia()){
            System.out.println("⚠️ El muelle está vacío. No hay camiones esperando.");
            return null;
        }

        NodoCamion camionAtendido = frente ;

        frente = frente.siguiente;

        if (frente == null){
            fin = null;
        }
        System.out.println("🚚 Camión placa " + camionAtendido.placa + " ha sido atendido y descargado.");
        return camionAtendido;

     }
     public void mostrarCola() {
        if (estaVacia()) {
            System.out.println("📭 La fila del muelle está vacía.");
            return;
        }
        
        System.out.println("🚛 --- ESTADO DE LA FILA EN EL MUELLE --- 🚛");
        
        // Usamos un nodo "auxiliar" para recorrer la fila sin perder el frente original
        NodoCamion actual = frente; 
        int posicion = 1;
        
        // Mientras el nodo actual no sea nulo (es decir, mientras haya un camión)
        while (actual != null) {
            System.out.println(posicion + ". Placa: " + actual.placa + " | Chofer: " + actual.nombreChofer);
            
            // Saltamos al siguiente camión usando el puntero
            actual = actual.siguiente; 
            posicion++;
        }
        System.out.println("------------------------------------------");
     }
}
