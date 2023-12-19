public class ClienteExistente {
    private String nombre;
    private String direccion;
    
    public ClienteExistente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }
}
