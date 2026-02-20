public class NodoCamion {
    // 1. Los datos del camión
    String placa;
    String nombreChofer; // ¡Nuevo dato agregado!

    // 2. El puntero: la referencia al siguiente camión en la fila
    NodoCamion siguiente;

    // 3. El constructor actualizado
    public NodoCamion(String placa, String nombreChofer) {
        this.placa = placa;
        this.nombreChofer = nombreChofer; // Guardamos el nombre
        this.siguiente = null; // Sigue siendo null porque acaba de llegar
    }
}