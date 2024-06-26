public class ClienteExistente {
    private String cedula;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String direccion;
    private String email;
    
    public ClienteExistente(String cedula,String nombre, String apellidos, String telefono, String direccion, String email) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono=telefono;
        this.direccion = direccion;
        this.email=email;
    }
    
    public String getNombre() {
        return nombre;
    }
    public String getNumcedula() {
        return cedula;
    }
    
    public String getDireccion() {
        return direccion;
    }
    public String getApellido() {
        return apellidos;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getEmail() {
        return email;
    }
}
